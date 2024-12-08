package FeedBackPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FeedBackController {
	
	//DB Connection
	private static boolean isSuccess;
	private static Connection conn = null;
	private static Statement stmt = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;
	
	public int getFeedbackCount() {
	    int count = 0;
	    try {
	        conn = DBconnection.getConnection();
	        String sql = "SELECT COUNT(*) FROM feedback"; // Ensure the table name matches your DB
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
	 
	//Insert Data 
	public static boolean insertData(String name, String email, String description, String rate) {
		
		boolean isSuccess =  false;
		
		try {
			// DB CONNECTION CALL
			conn = DBconnection.getConnection();
			stmt = conn.createStatement();
			
			//SQL QUERY
			String sql = "insert into FeedBack values (0, '"+name+"' , '"+email+"', '"+description+"', '"+rate+"')";
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
	
	//Display Data By ID
	public static List<FeedBackModel> getById (String Id){
		
		int convertID = Integer.parseInt(Id);
		
		ArrayList <FeedBackModel> feedback = new ArrayList<>();
		
		try {
			// DB CONNECTION CALL
			conn = DBconnection.getConnection();
			stmt = conn.createStatement();
			
			//SQL QUERY
			String sql = "select * from FeedBack where id '"+convertID+"'";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String description = rs.getString(4);
				String rate = rs.getString(5);
				
				FeedBackModel feedbackmodel = new FeedBackModel(id,name,email,description,rate);
				feedback.add(feedbackmodel);
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return feedback;
	}

	
	//Display All Data
	public static List<FeedBackModel> getByAll (){
		
		ArrayList <FeedBackModel> feedbacks = new ArrayList<>();
		try {
			// DB CONNECTION CALL
			conn = DBconnection.getConnection();
			stmt = conn.createStatement();
			
			//SQL QUERY
			String sql = "select * from FeedBack";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String description = rs.getString(4);
				String rate = rs.getString(5);
				
				FeedBackModel feedbackmodel = new FeedBackModel(id,name,email,description,rate);
				feedbacks.add(feedbackmodel);
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return feedbacks;
	}
	
	//Update Data 
		public static boolean updateData(String id, String name, String email, String description, String rate) {
			
			try {
				// DB CONNECTION CALL
				conn = DBconnection.getConnection();
				stmt = conn.createStatement();
				
				//SQL QUERY
				String sql = "update FeedBack set name = '"+name+"', email = '"+email+"',  description = '"+description+"', rate = '"+rate+"' "
						+ "where id ='"+id+"'";
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
		
		//Delete Data 
			public static boolean deleteData(String id) {
				
				int convId = Integer.parseInt(id);
				try {
					// DB CONNECTION CALL
					conn = DBconnection.getConnection();
					stmt = conn.createStatement();
						
					//SQL QUERY
					String sql = "delete from FeedBack where id ='"+convId+"'";
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
					
}




















