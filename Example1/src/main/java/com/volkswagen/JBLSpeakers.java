package com.volkswagen;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JBLSpeakers implements Speakers{
    public void playMusic(){
        System.out.println("JBL Speakers playing Music...!!!");
    }
}
