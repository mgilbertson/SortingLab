/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import common.*;
import java.util.*;
/**
 *
 * @author Mitch
 */
public class Startup2 {
    public static void main(String[] args) {
           Song song1 = new Song("Hells Bells                ", "ACDC     ", "Back in Black  ", "001");
           Song song2 = new Song("What You Do For Money Honey", "ACDC     ", "Back in Black  ", "003");
           Song song3 = new Song("Girls Got Rythm            ", "ACDC     ", "Highway To Hell", "002");
           Song song4 = new Song("Highway To Hell            ", "ACDC     ", "Highway To Hell", "001");
           Song song5 = new Song("Blew                       ", "Nirvana  ", "Bleach         ", "001");
           Song song6 = new Song("Floyd the Barber           ", "Nirvana  ", "Bleach         ", "002");
           Song song7 = new Song("Smells Like Teen Spirit    ", "Nirvana  ", "Nevermind      ", "001");
           Song song8 = new Song("In Bloom                   ", "Nirvana  ", "Nevermind      ", "002");
           Song song9 = new Song("I Have A Problem           ", "Beartooth", "Sick           ", "001");
           Song song10 = new Song("Go Be The Voice            ", "Beartooth", "Sick           ", "002");
           Song song11 = new Song("The Lines                  ", "Beartooth", "Discusting     ", "001");
           Song song12 = new Song("Beaten in Lips             ", "Beartooth", "Discusting     ", "002");
           Map<Integer, Song> songMap = new LinkedHashMap<>();
           
           songMap.put(song1.getSongId(), song1);
           songMap.put(song2.getSongId(), song2);
           songMap.put(song3.getSongId(), song3);
           songMap.put(song4.getSongId(), song4);
           songMap.put(song5.getSongId(), song5);
           songMap.put(song6.getSongId(), song6);
           songMap.put(song7.getSongId(), song7);
           songMap.put(song8.getSongId(), song8);
           songMap.put(song9.getSongId(), song9);
           songMap.put(song10.getSongId(), song10);
           songMap.put(song11.getSongId(), song11);
           songMap.put(song12.getSongId(), song12);
           
           Set<Integer> keys = songMap.keySet();
           System.out.println("Artist   " + " | " + "Album          " + " | " + "Song");
            for(Integer key : keys) {
                Song found = songMap.get(key);
                System.out.println(found);
            }
           
    }
   
}
