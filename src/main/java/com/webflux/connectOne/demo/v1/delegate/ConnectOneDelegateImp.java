package com.webflux.connectOne.demo.v1.delegate;

import com.webflux.connectOne.demo.v1.api.ApiUtil;
//import com.webflux.connectOne.demo.v1.api.WebfluxApiDelegate;
import com.webflux.connectOne.demo.v1.dto.Webflux;
import com.webflux.connectOne.demo.v1.service.ConnectOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Iterator;

public class ConnectOneDelegateImp {
    @Autowired
    ConnectOneService connectOneService;

}
