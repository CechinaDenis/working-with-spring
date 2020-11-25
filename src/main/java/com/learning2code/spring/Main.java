package com.learning2code.spring;

import com.learning2code.spring.view.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created on 11/24/2020
 * Author Cechina Denis
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//      ----> FOR REFERENCES LOOK IN TO "applicationContext"<----
//      --> Getting from 'context' 'Music' bean
//        Music music = context.getBean("musicBean", Music.class);
//      --> Injecting musicBean to PlayerMusic constructor
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//      --> ~(IoC) Spring first of all creates musicBean than creates and injects it to musicPlayer bean
//              depending what bean name we will use vvvvvvvvvvvvvvvv that bean will be got.
        MusicPlayer player = context.getBean("musicPlayerSetterWithProperty", MusicPlayer.class);
        player.playMusic();
        System.out.println(player.getName());
        System.out.println(player.getVolume());

        context.close();
    }
}
