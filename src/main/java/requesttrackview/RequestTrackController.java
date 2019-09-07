package requesttrackview;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestTrackController {
	
	@Autowired
	private RequestService reqservice;
	
	@RequestMapping(path = "/addrequest", method = RequestMethod.POST)
	public void addRequest(@RequestBody CustomerRequest req) {
		reqservice.addRequest(req);
	}
	
	@RequestMapping("/checkstatus/{requestId}")
	public String getStatus(@PathVariable String requestId) {
		
		return "In Progress";
	}
	@RequestMapping("/allrequest")
	public List<CustomerRequest> getAllRequest() {
		
		return reqservice.getAllRequest();
//		return "In Progress";
	}
}
