package com.volkswagen.Example3;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@Slf4j
@AllArgsConstructor
public class Controller {

    private Person person;

    @RequestMapping("/hello")
    public String hello(){
        log.info("request come to controller");
        person.hello();
        log.info("counter count is: {}",person.getCounter());

        return "index.html";
    }
}
