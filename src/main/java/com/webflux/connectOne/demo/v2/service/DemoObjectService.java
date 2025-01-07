package com.webflux.connectOne.demo.v2.service;

import com.webflux.connectOne.demo.v2.dao.DemoObjectDao;
import com.webflux.connectOne.demo.v2.dto.DemoObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class DemoObjectService {
@Autowired
private DemoObjectDao dao;
    public Flux<DemoObject> loadAllDemoObjectsStream() {
        long start = System.currentTimeMillis();
        Flux<DemoObject> demoObjects = dao.getDemoObjectsStream();
        long end = System.currentTimeMillis();
        System.out.println("Total execution time : " + (end - start));
        return demoObjects;
    }
}
