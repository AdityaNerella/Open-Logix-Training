import java.sql.*;

public class main{

	public static void main(String[]args){

		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Driver Success!");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OLCustomers?serverTimezone=UTC" ,
						"root", "1997");

			System.out.println("Connection Success!");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Users");

			while(rs.next()){
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +rs.getString(3) 
					+ rs.getInt(4)  + rs.getInt(5)  + rs.getString(6) );
			}
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}

		User u1 = new User();
		User u2 = new User();
		User u3 = new User("Adi","Nerella","an@gmail.com", 10, 11);
		
		Customers customerList = new Customers();
		
		System.out.println("______________________");	
		System.out.println("Inserting Users...");
		
		customerList.insert(u1);
		customerList.insert(u2);
		customerList.insert(u3);

		System.out.println("Insertion Completed!");
		System.out.println("User List:");
		customerList.printAll();
		System.out.println("\n______________________");	

		User u4 = new User("Adi","Nerella","apnerella@gmail.com", 10, 11);
		System.out.println("Updating Adi's Email...");
		customerList.update(2, u4);

		System.out.println("Updating Completed!");
		System.out.println("User List:");
		customerList.printAll();
		System.out.println("\n______________________");

		System.out.println("Deleting 2nd Record (id = 1)...");
		customerList.delete(1);

		System.out.println("Deletion Completed!");
		System.out.println("User List:");
		customerList.printAll();
		System.out.println("\n______________________");
	}
}
