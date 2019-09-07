package requesttrackview;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {
	@Autowired
	public RequestRepository requestRepo;
	
	public void addRequest(CustomerRequest req) {
		//validate
		requestRepo.save(req);
//		return "Success";
	}
	
	public List<CustomerRequest> getAllRequest(){
//		List<CustomerRequest> lsrequests = new ArrayList<>();
		return (List<CustomerRequest>) requestRepo.findAll();
//		return customerRepo.customers;
	}

}
