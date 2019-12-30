import java.util.Vector;

public class Store {
	private String storeId;
	private String storeName;
	private String opinningHours;
	private String storeAddress;
	private String storeManger;
	private Vector <Users> users;
	
	
	 //** Constructors **//

	  /**
	   * Constructs an instance of the Store.
	   */
	public Store(String id) {
		this.storeId=id;
	}
	
	public Store(String id,String name, String Hours, String address, String manger) {
		this.storeId=id;
		this.storeName=name;
		this.opinningHours=Hours;
		this.storeAddress=address;
		this.storeManger=manger;
	}
	
	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getOpinningHours() {
		return opinningHours;
	}

	public void setOpinningHours(String opinningHours) {
		this.opinningHours = opinningHours;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreManger() {
		return storeManger;
	}

	public void setStoreManger(String storeManger) {
		this.storeManger = storeManger;
	}
}
