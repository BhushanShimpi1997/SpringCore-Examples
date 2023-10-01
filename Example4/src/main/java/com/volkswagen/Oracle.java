package com.volkswagen;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("acc")
public class Oracle {
    public Oracle(){
        System.out.println("Oracle DataSource is created..!!");
    }
}
