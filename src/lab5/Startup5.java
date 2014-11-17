/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import common.*;
import java.util.*;
/**
 *
 * @author Mitch
 */
public class Startup5 {
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
           
           List<Song> songList = new ArrayList<>();
           
           songList.add(song1);
           songList.add(song2);
           songList.add(song3);
           songList.add(song4);
           songList.add(song5);
           songList.add(song6);
           songList.add(song7);
           songList.add(song8);
           songList.add(song9);
           songList.add(song10);
           songList.add(song11);
           songList.add(song12);           
           
           Collections.sort(songList);

           System.out.println("Artist   " + " | " + "Album          " + " | " + "Song                       " + " | " + "TrackNo");
            for(Song song : songList) {
                System.out.println(song);
            }
           
    }
   
}
