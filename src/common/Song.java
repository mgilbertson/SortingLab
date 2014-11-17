package common;

import java.util.Objects;

public class Song implements Comparable<Song>{
    private String name;
    private String artist;
    private String album;
    private String trackNo;
    private static int baseId = 1000;
    private int songId;

    public Song(String name, String artist, String album, String trackNo) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.trackNo = trackNo;
        songId = baseId + 1;
        baseId++;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTrackNo() {
        return trackNo;
    }

    public void setTrackNo(String trackNo) {
        this.trackNo = trackNo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.artist);
        hash = 53 * hash + Objects.hashCode(this.album);
        hash = 53 * hash + Objects.hashCode(this.trackNo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        if (!Objects.equals(this.album, other.album)) {
            return false;
        }
        if (!Objects.equals(this.trackNo, other.trackNo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return artist + " : " + album + " : " + name + " : " + trackNo;
    }

    @Override
    public int compareTo(Song s) {
        final int BEFORE = -1;
	final int EQUAL = 0;
	final int AFTER = 1;
        int comparison = (this.artist + this.album + this.trackNo).compareTo(s.getArtist() + s.getAlbum() + s.getTrackNo());
        if( comparison != EQUAL) return comparison;
        return EQUAL; // default
    }
}
