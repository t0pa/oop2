package org.example.week10;

import java.util.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Songs {
    static class Song {
        String title, artist, genre;

        public Song(String title, String artist, String genre) {
            this.title = title;
            this.artist = artist;
            this.genre = genre;
        }

        @Override
        public String toString() {
            return "Title: " + title + ", Artist: " + artist + ", Genre: " + genre;
        }
    }

    static class GenreFilterIterator implements Iterator<Song> {
        private Iterator<Song> iterator;
        private String targetGenre;
        private Song nextSong;

        public GenreFilterIterator(List<Song> playlist, String targetGenre) {
            this.iterator = playlist.iterator();
            this.targetGenre = targetGenre;
            findNext();
        }

        private void findNext() {
            while (iterator.hasNext()) {
                Song song = iterator.next();
                if (song.genre.equalsIgnoreCase(targetGenre)) {
                    nextSong = song;
                    return;
                }
            }
            nextSong = null;
        }

        @Override
        public boolean hasNext() {
            return nextSong != null;
        }

        @Override
        public Song next() {
            if (nextSong == null) throw new NoSuchElementException();
            Song current = nextSong;
            findNext();
            return current;
        }
    }

    public static void main(String[] args) {
        List<Song> playlist = Arrays.asList(
                new Song("Song A", "Artist 1", "Pop"),
                new Song("Song B", "Artist 2", "Rock"),
                new Song("Song C", "Artist 3", "Pop"),
                new Song("Song D", "Artist 4", "Jazz")
        );

        GenreFilterIterator iterator = new GenreFilterIterator(playlist, "Pop");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
