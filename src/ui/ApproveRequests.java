/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 *
 * @author Admin
 */
import database.DBConnection;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;





public class ApproveRequests extends JFrame {

    JTable table = new JTable();
    DefaultTableModel model = new DefaultTableModel();

    JButton btnApprove = new JButton("Approve");
    JButton btnReject = new JButton("Reject");

    public ApproveRequests() {
        setTitle("Approve Loan Requests");
        setSize(700, 400);
        setLayout(null);

        model.addColumn("Request ID");
        model.addColumn("User ID");
        model.addColumn("Laptop ID");
        model.addColumn("Status");

        table.setModel(model);

        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(20, 20, 640, 250);

        btnApprove.setBounds(150, 300, 120, 30);
        btnReject.setBounds(300, 300, 120, 30);

        add(sp);
        add(btnApprove);
        add(btnReject);

        loadRequests();

        btnApprove.addActionListener(e -> updateStatus("Approved"));
        btnReject.addActionListener(e -> updateStatus("Rejected"));

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void loadRequests() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM loan_requests WHERE status='Pending'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getInt("laptop_id"),
                        rs.getString("status")
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateStatus(String status) {
        int row = table.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Select a request first");
            return;
        }

        int requestId = (int) model.getValueAt(row, 0);
        int laptopId = (int) model.getValueAt(row, 2);

        try {
            Connection con = DBConnection.getConnection();

            // Update request status
            String sql1 = "UPDATE loan_requests SET status=? WHERE id=?";
            PreparedStatement pst1 = con.prepareStatement(sql1);
            pst1.setString(1, status);
            pst1.setInt(2, requestId);
            pst1.executeUpdate();

            // If approved → mark laptop unavailable
            if (status.equals("Approved")) {
                String sql2 = "UPDATE laptops SET status='Unavailable' WHERE id=?";
                PreparedStatement pst2 = con.prepareStatement(sql2);
                pst2.setInt(1, laptopId);
                pst2.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "Request " + status);
            loadRequests();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}
