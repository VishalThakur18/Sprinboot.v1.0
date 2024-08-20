package com.udemy.firstproject.udemyfirstproject;
import firstproject.game.PackmanGame;
import firstproject.game.gameRunner;

public class App01BasicGamingJava {
    public static void main(String[] args) {
//        var game = new marioGame();
//        var game = new SuperContra();
        var game =new PackmanGame();
        var gameRunner=new gameRunner(game);
        gameRunner.run();
    }
}
