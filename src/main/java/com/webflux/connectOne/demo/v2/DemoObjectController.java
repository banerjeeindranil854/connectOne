package com.webflux.connectOne.demo.v2;

import com.webflux.connectOne.demo.v2.dto.DemoObject;
import com.webflux.connectOne.demo.v2.service.DemoObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/demoObjects")
public class DemoObjectController {
    @Autowired
    private DemoObjectService demoObjectService;
    @GetMapping(value = "/stream",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<DemoObject> getAllCustomersStream() {
        return demoObjectService.loadAllDemoObjectsStream();
    }
}
