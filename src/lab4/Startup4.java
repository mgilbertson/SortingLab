/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import common.*;
import java.util.*;
/**
 *
 * @author Mitch
 */
public class Startup4 {
    public static void main(String[] args) {
           Song song3 = new Song("Girls Got Rythm            ", "ACDC     ", "Highway To Hell", "002");
           Song song4 = new Song("Highway To Hell            ", "ACDC     ", "Highway To Hell", "001");
           Song song2 = new Song("What You Do For Money Honey", "ACDC     ", "Back in Black  ", "003");
           Song song1 = new Song("Hells Bells                ", "ACDC     ", "Back in Black  ", "001");
           Song song5 = new Song("Blew                       ", "Nirvana  ", "Bleach         ", "002");
           Song song6 = new Song("Floyd the Barber           ", "Nirvana  ", "Bleach         ", "001");
           Song song7 = new Song("Smells Like Teen Spirit    ", "Nirvana  ", "Nevermind      ", "002");
           Song song8 = new Song("In Bloom                   ", "Nirvana  ", "Nevermind      ", "001");
           Song song9 = new Song("I Have A Problem           ", "Beartooth", "Sick           ", "002");
           Song song10 = new Song("Go Be The Voice            ", "Beartooth", "Sick           ", "001");
           Song song11 = new Song("The Lines                  ", "Beartooth", "Discusting     ", "002");
           Song song12 = new Song("Beaten in Lips             ", "Beartooth", "Discusting     ", "001");
           
           Set<Song> songSet = new TreeSet<>();
           
           songSet.add(song1);
           songSet.add(song2);
           songSet.add(song3);
           songSet.add(song4);
           songSet.add(song5);
           songSet.add(song6);
           songSet.add(song7);
           songSet.add(song8);
           songSet.add(song9);
           songSet.add(song10);
           songSet.add(song11);
           songSet.add(song12);           
           
           System.out.println("Artist   " + " | " + "Album          " + " | " + "Song                       " + " | " + "TrackNo");
            for(Song song : songSet) {
                System.out.println(song);
            }
           
    }
   
}
