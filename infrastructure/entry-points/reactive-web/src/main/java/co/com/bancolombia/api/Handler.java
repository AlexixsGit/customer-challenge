package co.com.bancolombia.api;

import co.com.bancolombia.model.customer.Customer;
import co.com.bancolombia.usecase.customer.CustomerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
    final CustomerUseCase customerUseCase;

    public Mono<ServerResponse> listenGETUseCase(ServerRequest serverRequest) {
        Mono<Customer> customerFoundMono = customerUseCase.
                findOneCustomer(serverRequest.queryParam("clientDocument").toString());

        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(customerFoundMono, Customer.class);
    }

    public Mono<ServerResponse> listenGETOtherUseCase(ServerRequest serverRequest) {
        // useCase2.logic();
        return ServerResponse.ok().bodyValue("");
    }

    public Mono<ServerResponse> listenPOSTUseCase(ServerRequest serverRequest) {
        // usecase.logic();
        return ServerResponse.ok().bodyValue("");
    }
}
