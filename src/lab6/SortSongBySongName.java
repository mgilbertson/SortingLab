/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import common.Song;
import java.util.*;
/**
 *
 * @author Mitch
 */
public class SortSongBySongName implements Comparator<Song> {
    
    @Override
    public int compare(Song s1, Song s2) {
        return (s1.getArtist() + s1.getAlbum() + s1.getName()).compareTo(s2.getArtist() + s2.getAlbum() + s2.getName());
    }

    
}
