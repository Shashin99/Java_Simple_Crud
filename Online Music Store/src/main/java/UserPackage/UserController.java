package UserPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import FeedBackPackage.DBconnection;
import FeedBackPackage.FeedBackModel;


public class UserController {
	
	//DB Connection
	private static boolean isSuccess;
	private static Connection conn = null;
	private static Statement stmt = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;

	//Create a private static instance of the class
	private static UserController instance;
	
	public int getUserCount() {
	    int count = 0;
	    try {
	        conn = DBconnection.getConnection();
	        String sql = "SELECT COUNT(*) FROM user"; // Ensure the table name matches your DB
	        PreparedStatement pstmt = conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        if (rs.next()) {
	            count = rs.getInt(1);
	        }
	    } catch (Exception e) {
	        e.printStackTrace(); // Log error for debugging
	    } finally {
	        // Close resources
	        try {
	            if (rs != null) rs.close();
	            if (pstmt != null) pstmt.close();
	            if (conn != null) conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return count;
	}
	 
	
    // Validation: Check if email is unique
    public static boolean isEmailUnique(String email) {
        boolean isUnique = true;
        try {
            // DB Connection
            conn = DBconnection.getConnection();
            stmt = conn.createStatement();
            
            // SQL Query to check if email exists
            String sql = "SELECT email FROM User WHERE email = '" + email + "'";
            rs = stmt.executeQuery(sql);
            
            // If email exists, set isUnique to false
            if (rs.next()) {
                isUnique = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isUnique;
    }

    // Validation: Check if contact number is valid (only digits and length of 10)
    public static boolean isContactNoValid(String contactNo) {
        // Check if contact number contains only digits and is exactly 10 digits long
        return contactNo.matches("\\d{10}");
    }
    
    
    //Make the constructor private to prevent instantiation
    UserController() {
    }

    //Provide a public static method to get the instance
    public static UserController getInstance() {
        if (instance == null) {
            instance = new UserController();
        }
        return instance;
    }

    
	//Insert Data - (Abstraction)
		public static boolean insertData(String firstName, String lastName, String gender, String email, String contactNo,
				String password) {
			
			boolean isSuccess =  false;
			
			try {
				// DB CONNECTION CALL
				conn = DBconnection.getConnection();
				stmt = conn.createStatement();
				
				// Validate email uniqueness
		        String checkEmailQuery = "SELECT email FROM User WHERE email = '" + email + "'";
		        rs = stmt.executeQuery(checkEmailQuery);
		        if (rs.next()) {
		            System.out.println("Error: Email is already in use!");
		            return false;  // Exit if email is already in use
		        }

		        // Validate contact number (must be 10 digits and contain only numbers)
		        if (!contactNo.matches("\\d{10}")) {
		            System.out.println("Error: Contact number must be exactly 10 digits and contain only numbers!");
		            return false;  // Exit if contact number is invalid
		        }

		        
				//SQL QUERY
				String sql = "insert into User values (0, '"+firstName+"' , '"+lastName+"' ,'"+gender+"' ,'"+email+"', '"+contactNo+"', '"+password+"')";
				int rs = stmt.executeUpdate(sql);
				if(rs > 0) {
					isSuccess = true;
				} else {
					isSuccess = false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return isSuccess;
			
		}

		// Fetch data by ID
		public static UserModel getById(String id) {
		    UserModel user = null;
		    int convertID = Integer.parseInt(id); // Convert string ID to int

		    try {
		        // DB CONNECTION CALL
		        conn = DBconnection.getConnection();
		        stmt = conn.createStatement();
		        
		        // SQL QUERY
		        String sql = "SELECT * FROM User WHERE id = " + convertID; // SQL query syntax
		        rs = stmt.executeQuery(sql);
		        
		        if (rs.next()) { // Only need to check if there is a result
		            int id1 = rs.getInt(1);
		            String firstName = rs.getString(2);
		            String lastName = rs.getString(3);
		            String gender = rs.getString(4);
		            String email = rs.getString(5);
		            String contactNo = rs.getString(6);
		            String password = rs.getString(7);

		            user = new UserModel(id1, firstName, lastName, gender, email, contactNo, password);
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    return user; // Return the UserModel object
		}


		
	    // Method to fetch all users from the database
	    public List<UserModel> getAllUsers() {
	        List<UserModel> users = new ArrayList<>();
	        
	        String query = "SELECT * FROM user"; // Assuming you have a 'users' table in your database

	        try {
	        	conn = DBconnection.getConnection();// Assuming you have a DatabaseConnection class
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(query);

	            while (rs.next()) {
	                UserModel user = new UserModel();
	                user.setId(rs.getInt("id"));
	                user.setFirstName(rs.getString("firstName"));
	                user.setLastName(rs.getString("lastName"));
	                user.setGender(rs.getString("gender"));
	                user.setEmail(rs.getString("email"));
	                user.setContactNo(rs.getString("contactNo"));
	                user.setPassword(rs.getString("password"));

	                users.add(user);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return users;
	    }
	    
		//Update User
		public static void updateUser(UserModel user) {
		    try {
		        // DB CONNECTION CALL
		        conn = DBconnection.getConnection();
		        
		        String sql = "UPDATE User SET firstName = ?, lastName = ?, email = ?, contactNo = ? WHERE id = ?";
		        PreparedStatement pstmt = conn.prepareStatement(sql);
		        
		        pstmt.setString(1, user.getFirstName());
		        pstmt.setString(2, user.getLastName());
		        pstmt.setString(3, user.getEmail());
		        pstmt.setString(4, user.getContactNo());
		        pstmt.setInt(5, user.getId());
		        
		        pstmt.executeUpdate();
		    } catch (Exception e) {
		        e.printStackTrace();
		    } finally {
		        // Close resources
		        if (stmt != null) try { stmt.close(); } catch (SQLException ignored) {}
		        if (conn != null) try { conn.close(); } catch (SQLException ignored) {}
		    }
		}

		//Delete User	
		public static boolean deleteData(String id) {
		    int convId = Integer.parseInt(id);
		    boolean isSuccess = false; // Ensure this is declared here
		    try {
		        // DB CONNECTION CALL
		        conn = DBconnection.getConnection();
		        stmt = conn.createStatement();
		            
		        // SQL QUERY
		        String sql = "DELETE FROM User WHERE id ='" + convId + "'";
		        int rs = stmt.executeUpdate(sql);
		            
		        if(rs > 0) {
		            isSuccess = true;
		        } else {
		            isSuccess = false;
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    return isSuccess;
		}

				
				 // Method to check if email and password are valid
			private boolean checkLogin(String email, String password) {
			        boolean isValid = false;

			        try {
			            // Get a connection to the database
			            Connection conn = DBconnection.getConnection();

			            // SQL query to check if the email and password are valid
			            String sql = "SELECT * FROM User WHERE email = ? AND password = ?";
			            PreparedStatement stmt = conn.prepareStatement(sql);
			            stmt.setString(1, email);
			            stmt.setString(2, password);

			            // Execute the query
			            ResultSet rs = stmt.executeQuery();

			            // Check if a record exists with matching email and password
			            if (rs.next()) {
			                isValid = true;
			            }

			            // Close resources
			            rs.close();
			            stmt.close();
			            conn.close();
			        } catch (Exception e) {
			            e.printStackTrace();
			        }

			        return isValid;
			    }
}
