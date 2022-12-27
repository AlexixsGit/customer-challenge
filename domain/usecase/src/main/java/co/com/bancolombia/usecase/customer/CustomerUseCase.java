package co.com.bancolombia.usecase.customer;

import co.com.bancolombia.model.customer.Customer;
import co.com.bancolombia.model.customer.gateways.CustomerRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CustomerUseCase {

    final CustomerRepository customerRepository;

    public Mono<Customer> findOneCustomer(String clientDocument) {
        return customerRepository.findOneCustomer(clientDocument);
    }
}
