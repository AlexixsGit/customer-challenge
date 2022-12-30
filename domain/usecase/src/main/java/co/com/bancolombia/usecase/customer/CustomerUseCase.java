package co.com.bancolombia.usecase.customer;

import co.com.bancolombia.model.customer.Customer;
import co.com.bancolombia.model.customer.gateways.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class CustomerUseCase {

    final CustomerRepository customerRepository;

    public Mono<Customer> findOneCustomer(String clientDocument) {
        return customerRepository.findOneCustomer("1989635462");
    }
}
