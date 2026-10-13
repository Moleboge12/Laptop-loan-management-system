package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/laptop_loan _management";
    private static final String USER = "root";
    private static final String PASS = "";

    private static Connection conn;

    // ✅ Always return a valid connection
    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                System.out.println("Database connected successfully.");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Database connection failed.");
            e.printStackTrace();
        }
        return conn;
    }

    // ✅ Compatibility method for older code
    public static Connection connect() {
        return getConnection();
    }

    // ✅ Close connection safely
    public static void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                conn = null;
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ✅ Fetch notifications for a student
    public static ResultSet getNotifications(int studentId) {
        try {
            Connection con = getConnection();
            if (con == null) return null;

            String sql = "SELECT * FROM notifications WHERE user_id = ? ORDER BY created_at DESC";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, studentId);

            return pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // ✅ Insert a new notification
    public static void addNotification(int userId, String message) {
        try {
            Connection con = getConnection();
            if (con == null) return;

            String sql = "INSERT INTO notifications(user_id, message) VALUES(?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, userId);
            pst.setString(2, message);

            pst.executeUpdate();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ✅ Generic query execution
    public static ResultSet getData(String sql) {
        try {
            Connection con = getConnection();
            if (con == null) {
                System.err.println("Connection is null");
                return null;
            }

            PreparedStatement pst = con.prepareStatement(sql);
            return pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

  
    public static void main(String[] args) {
        Connection con = getConnection();
        if (con != null) {
            System.out.println("Connection successful.");
        } else {
            System.out.println("Connection failed.");
        }
    }
}
