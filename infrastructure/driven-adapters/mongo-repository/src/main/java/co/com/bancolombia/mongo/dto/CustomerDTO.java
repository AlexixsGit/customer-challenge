package co.com.bancolombia.mongo.dto;

import co.com.bancolombia.model.customer.AuthenticationInfo;
import co.com.bancolombia.model.customer.DetailCustomer;
import co.com.bancolombia.model.customer.Header;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
@Getter
public class CustomerDTO {
    @Id
    private String id;
    private Header header;
    private String accountType;
    private String accountNumber;
    private String email;
    private DetailCustomer detailCustomer;
    private String clientDocumentType;
    private String clientDocument;
    private String businessDocumentType;
    private String businessDocument;
    private String clientIp;
    private String channelId;
    private String consumerId;
    private String userAgent;
    private String device;
    private AuthenticationInfo authenticationInfo;
}
