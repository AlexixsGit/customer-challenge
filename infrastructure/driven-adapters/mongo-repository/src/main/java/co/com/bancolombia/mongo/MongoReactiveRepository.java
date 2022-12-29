package co.com.bancolombia.mongo;

import co.com.bancolombia.mongo.dto.CustomerDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoReactiveRepository
        extends ReactiveMongoRepository<CustomerDTO, String> {
}
