package co.com.bancolombia.mongo.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
public class CustomerDTO {
    @Id
    private String clientDocument;
    private String clientDocumentType;
    private String businessDocument;
    private String businessDocumentType;
}
