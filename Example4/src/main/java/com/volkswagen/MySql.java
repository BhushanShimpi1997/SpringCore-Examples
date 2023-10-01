package com.volkswagen;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class MySql {
    public MySql(){
        System.out.println("MySql DataSource Created..!!");
    }
}
