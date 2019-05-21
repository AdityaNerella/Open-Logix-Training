import java.util.ArrayList;

public class Customers implements Operations{
	
	private ArrayList <User> users = new ArrayList<User>();
	
	public void insert(User user){
		users.add(user);
	}

	public void update(int userID, User updatedUser){
		for(int i=0; i < users.size(); i++){
			if((users.get(i)).getId() == userID){
				User temp = users.get(i);
				temp.setFirst(updatedUser.getFirst());
				temp.setLast(updatedUser.getLast());
				temp.setEmail(updatedUser.getEmail());
				temp.setAge(updatedUser.getAge());
				temp.setSsn(updatedUser.getSsn());
			}
		}
	}

	public void delete(int userID){
		for(int i=0; i < users.size(); i++){
			if(users.get(i).getId() == userID){
				users.remove(i); //Deleting user by specifying Index
			}
		}
	}

	public void printAll(){
		for(int i=0; i < users.size(); i++){
			System.out.print(users.get(i) + " ");
		}
	}
}