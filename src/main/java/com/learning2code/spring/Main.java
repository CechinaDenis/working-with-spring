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
        MusicPlayer playerSingleton1 = context.getBean("musicPlayerConstructorListArgs", MusicPlayer.class);
        MusicPlayer playerSingleton2 = context.getBean("musicPlayerConstructorListArgs", MusicPlayer.class);
        playerSingleton1.playAllMusic();
        System.out.println(playerSingleton1.getName());
        System.out.println(playerSingleton1.getVolume());
        System.out.println("Singleton scope enable; 2 obj gotten from the context are the same? -> "
                + (playerSingleton1 == playerSingleton2));
        MusicPlayer player1 = context.getBean("musicPlayerConstructorAllArgsPrototype", MusicPlayer.class);
        MusicPlayer player2 = context.getBean("musicPlayerConstructorAllArgsPrototype", MusicPlayer.class);
        System.out.println("Prototype scope enable; 2 obj gotten from the context are the same? -> "
                + (player1 == player2));

        context.close();
    }
}
