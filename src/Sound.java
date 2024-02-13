import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sound {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        playSound("cat.mp3");




    }

    public static void playSound(String soundName) {
        try {
            // primeste numele unui mp3 de pe disk
            FileInputStream fos = new FileInputStream(soundName);
            BufferedInputStream bof = new BufferedInputStream(fos);

            // play that file
            Player player = new Player(fos);
            player.play();
            //System.out.println("ruleaza");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}