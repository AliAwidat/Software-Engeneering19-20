


enum ItemType 
{ 
    kkk, rrr, ttt,yyy; 
} 

public class Item {

	private String itemId;
	private String descreption;
	private String domianColor;
	private ItemType type;
	private String price;
	
	
	public Item(String id) {
		this.itemId = id ; 
	}
	public Item(String id, String desc, String DC, ItemType type, String price) {
		this.itemId= id;
		this.descreption = desc ; 
		this.domianColor = DC ; 
		this.type = type ; 
		this.price = price;
		
		
	}
	
	
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getDescreption() {
		return descreption;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	public String getDomianColor() {
		return domianColor;
	}
	public void setDomianColor(String domianColor) {
		this.domianColor = domianColor;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	} 
}
