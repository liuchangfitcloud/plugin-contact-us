package run.halo.starter.router;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

/**
 * 一个新的API暴露
 * @author ShrChang.Liu
 * @Date 2022/12/8
 **/
@Configuration
@Slf4j
public class ContactRouter {

    @Bean
    RouterFunction<ServerResponse> contactRouters() {
        log.info("*********router init****************");
        return nest(path("/apis/contact.halo.run/v1alpha1"),route(GET("/contacts/{name}/add"),
                request -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue("{\"name\":\""+request.pathVariable("name")+"\"}")));
    }
}
