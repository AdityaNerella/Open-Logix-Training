public interface Operations{

	abstract public void insert(User user);
	abstract public void update(int userID, User updatedUser);
	abstract public void delete(int userID);

}