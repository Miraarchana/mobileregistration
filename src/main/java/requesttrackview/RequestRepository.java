package requesttrackview;

import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<CustomerRequest, String> {

}
