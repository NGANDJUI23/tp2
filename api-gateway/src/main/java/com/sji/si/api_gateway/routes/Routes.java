package com.sji.si.api_gateway.routes;

import org.springframework.cloud.gateway.server.mvc.filter.CircuitBreakerFilterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.*;


import java.io.Console;
import java.net.URI;

import static org.springframework.cloud.gateway.server.mvc.filter.FilterFunctions.setPath;

@Configuration
public class Routes {
    @Bean
    public RouterFunction<ServerResponse> etudiantServiceRoute(){
        return GatewayRouterFunctions.route("etudiant-manager")
                .route(RequestPredicates.path("/api/etudiants/**"), HandlerFunctions.http("http://localhost:8081"))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> inscriptionServiceRoute(){
        return GatewayRouterFunctions.route("inscription-manager")
                .route(RequestPredicates.path("/api/inscription/**"), HandlerFunctions.http("http://localhost:8082"))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> notificationServiceRoute(){
        return GatewayRouterFunctions.route("notification-manager")
                .route(RequestPredicates.path("/api/notification/**"), HandlerFunctions.http("http://localhost:8083"))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> abscenceServiceRoute(){
        return GatewayRouterFunctions.route("abscence-manager")
                .route(RequestPredicates.path("/api/abscence/**"), HandlerFunctions.http("http://localhost:8084"))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> compositeServiceRoute(){
        return GatewayRouterFunctions.route("composite-manager")
                .route(RequestPredicates.path("/api/composite/**"), HandlerFunctions.http("http://localhost:8085"))
                .build();
    }

//    @Bean
//    public RouterFunction<ServerResponse> userServiceSwaggerRoute(){
//        return GatewayRouterFunctions.route("user-manager-swagger")
//                .route(RequestPredicates.path("/aggregate/user-manage/v3/api-docs"), HandlerFunctions.http("http://localhost:8080"))
//                .filter(setPath("/api/docs"))
//                .build();
//    }
}
