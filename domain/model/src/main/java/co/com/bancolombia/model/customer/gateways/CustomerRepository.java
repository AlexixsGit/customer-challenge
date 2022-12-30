package co.com.bancolombia.model.customer.gateways;

import co.com.bancolombia.model.customer.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CustomerRepository {
    Mono<Customer> findOneCustomer(String clientDocument);
}
