import java.util.Date;
enum ComplainStatus 
{ 
    kkk, rrr, ttt,yyy; 
} 

public class Complain {

	private String userId;
	private Date orderDate;
	private Date submittionDate;
	private String refund;
	private ComplainStatus status;
	
	
	
	
	public Complain(String id, Date orderD, Date SubmD, String refund, ComplainStatus cs) {
	
		this.userId = id; 
		this.orderDate = orderD;
		this.submittionDate = SubmD; 
		this.refund = refund; 
		this.status = cs;
		
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getSubmittionDate() {
		return submittionDate;
	}
	public void setSubmittionDate(Date submittionDate) {
		this.submittionDate = submittionDate;
	}
	public String getRefund() {
		return refund;
	}
	public void setRefund(String refund) {
		this.refund = refund;
	}
	public ComplainStatus getStatus() {
		return status;
	}
	public void setStatus(ComplainStatus status) {
		this.status = status;
	}
	
	

}
