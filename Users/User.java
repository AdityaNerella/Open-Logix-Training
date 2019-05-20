import java.util.ArrayList;

public class User{
	private String first_name, last_name, email;
	private int age, ssn;
	private int id;
	private static int count = 0;
	
	User(){
		first_name = "Default First";
		last_name = "Default Last";
		email = "default@email.com";
		age = 10;
		ssn = 11;
		id = count;
		count++;
	}

	User(String f, String l, String e, int a, int s){
		first_name = f;
		last_name = l;
		email = e;
		age = a;
		ssn = s;
		id = count;
		count++;
	}

	public void setFirst(String fname){
		this.first_name = fname;
	}
	
	public String getFirst(){
		return first_name;
	}

	public void setLast(String lname){
		this.last_name = lname;
	}
	
	String getLast(){
		return last_name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setSsn(int ssn){
		this.ssn = ssn;
	}

	public int getSsn(){
		return ssn;
	}

	public int getId(){
		return id;
	}

	public String toString(){
		return "Name: " + first_name + " " + last_name + " Email: " + email + " Age: "
			+ age + " ssn: " + ssn + " id: " + this.id;
 	}
}