package co.com.bancolombia.config;

import co.com.bancolombia.model.customer.gateways.CustomerRepository;
import co.com.bancolombia.usecase.customer.CustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
public class UseCasesConfig {
    @Bean
    public CustomerUseCase customerUseCaseConfig(CustomerRepository customerRepository) {
        return new CustomerUseCase(customerRepository);
    }
}
