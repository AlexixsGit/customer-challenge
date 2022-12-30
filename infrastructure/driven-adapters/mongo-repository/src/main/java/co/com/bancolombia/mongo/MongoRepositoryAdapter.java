package co.com.bancolombia.mongo;

import co.com.bancolombia.model.customer.Customer;
import co.com.bancolombia.model.customer.gateways.CustomerRepository;
import co.com.bancolombia.mongo.dto.CustomerDTO;
import co.com.bancolombia.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class MongoRepositoryAdapter extends AdapterOperations<Customer, CustomerDTO, String, MongoReactiveRepository>
        implements CustomerRepository {

    public MongoRepositoryAdapter(MongoReactiveRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Customer.class));
    }

    @Override
    public Mono<Customer> findOneCustomer(String clientDocument) {
        return super.repository.findByClientDocument(clientDocument)
                .flatMap(customerDTO -> Mono.just(Customer.builder()
                        .header(customerDTO.getHeader())
                        .accountType(customerDTO.getAccountType())
                        .accountNumber(customerDTO.getAccountNumber())
                        .email(customerDTO.getEmail())
                        .detailCustomerInformation(customerDTO.getDetailCustomer())
                        .clientDocumentType(customerDTO.getClientDocumentType())
                        .clientDocument(customerDTO.getClientDocument())
                        .businessDocumentType(customerDTO.getBusinessDocumentType())
                        .businessDocument(customerDTO.getBusinessDocument())
                        .clientIp(customerDTO.getClientIp())
                        .channelId(customerDTO.getChannelId())
                        .consumerId(customerDTO.getConsumerId())
                        .userAgent(customerDTO.getUserAgent())
                        .device(customerDTO.getDevice())
                        .authenticationInfo(customerDTO.getAuthenticationInfo()).build()));

    }
}
