package com.volkswagen;

import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers{
    @Override
    public void playMusic() {
        System.out.println("Sony Speakers Are Playing...!!!");
    }
}
