package requesttrackview;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerRequest {
	@Id
	String requestId;
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	String customerID;
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	String status;

}