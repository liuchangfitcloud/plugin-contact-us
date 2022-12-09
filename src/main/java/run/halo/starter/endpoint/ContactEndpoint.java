//package run.halo.starter.endpoint;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springdoc.webflux.core.fn.SpringdocRouteBuilder;
//import org.springframework.http.MediaType;
//import org.springframework.security.core.context.ReactiveSecurityContextHolder;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.ServerRequest;
//import org.springframework.web.reactive.function.server.ServerResponse;
//import reactor.core.publisher.Mono;
//import run.halo.app.core.extension.endpoint.CustomEndpoint;
//import run.halo.app.extension.ExtensionClient;
//import run.halo.app.extension.GroupVersion;
//
///**
// * @author ShrChang.Liu
// * @Date 2022/12/8
// **/
//@Component
//@Slf4j
//public class ContactEndpoint implements CustomEndpoint{
//
//    private final ExtensionClient client;
//
//    public ContactEndpoint(ExtensionClient client) {
//        this.client = client;
//    }
//
//    /**
//     * 返回一个测试的示例
//     * @param request
//     * @return
//     */
//    Mono<ServerResponse> testRes(ServerRequest request) {
//        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue("{'name':'liuchang'}");
//    }
//
//
//    @Override
//    public RouterFunction<ServerResponse> endpoint() {
//        log.info("******init contact test*******");
//        return SpringdocRouteBuilder.route()
//                .GET("/contacts/add", this::testRes, builder -> builder.operationId("AddContact")
//                        .description("Test My Contract")
//                        .tag("api.halo.run/v1alpha1/Contract"))
//                // 这里可添加其他自定义 API
//                .build();
//    }
//
//    @Override
//    public GroupVersion groupVersion() {
//        return GroupVersion.parseAPIVersion("api.halo.run/v1alpha1");
//    }
//}
