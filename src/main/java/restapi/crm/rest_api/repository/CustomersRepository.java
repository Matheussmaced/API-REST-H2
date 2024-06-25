package restapi.crm.rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import restapi.crm.rest_api.model.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {

}
