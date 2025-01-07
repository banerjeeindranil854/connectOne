package com.webflux.connectOne.demo.v2.dao;

import com.webflux.connectOne.demo.v2.dto.DemoObject;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Component
public class DemoObjectDao {
    public Flux<DemoObject> getDemoObjectsStream()  {
        return Flux.range(1,10)
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(i -> System.out.println("processing count in stream flow : " + i))
                .doOnComplete(() -> System.out.println("First Event Is done"))
                .map(i -> new DemoObject(i, "DemoObject" + i));
    }
}
