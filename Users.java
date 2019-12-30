import java.util.Vector;
enum UserType 
{ 
    CLIENT, EMPLOYEE, MANGER; 
} 
public class Users {
	private String userId;
	private String userName;
	private UserType UT;//enum
	private String shippingDetails;
	private String phoneNumber;
	
	
	public Users(String id) {
		this.setUserId(id);
	}
	
	public Users(String id,String name, String Hours,UserType ut ,String det, String phone) {
		this.userId = id;
		this.userName = name;
		this.shippingDetails = det;
		this.phoneNumber = phone;
		this.UT=ut;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getShippingDetails() {
		return shippingDetails;
	}

	public void setShippingDetails(String shippingDetails) {
		this.shippingDetails = shippingDetails;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public UserType getUserType() {
		return UT;
	}
	public void setUserType(UserType ut) {
		this.UT = ut;
	}
	
	
	
}

