package com.webflux.connectOne.demo.v1.service;


import com.webflux.connectOne.demo.v1.dto.Webflux;
import org.springframework.core.io.buffer.DefaultDataBuffer;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

@Service
public class ConnectOneService {
public Webflux getDemoObject(){
    Webflux webflux=new Webflux();
    webflux.setId(BigDecimal.TEN);
    webflux.setName("indranil banerjee");
    return webflux;
}
}
