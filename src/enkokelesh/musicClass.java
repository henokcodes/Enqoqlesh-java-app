/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkokelesh;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



    
public class musicClass {
void playMusic(String music){
        try{
            File musicPath = new File(music);
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInput);
                        clip.start();
                        clip.loop(Clip.LOOP_CONTINUOUSLY);
                       // JOptionPane.showMessageDialog(null,"press ok to stop");
            }else {
                System.out.println("can't find file");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
    
