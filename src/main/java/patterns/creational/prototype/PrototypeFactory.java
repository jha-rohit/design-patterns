package main.java.patterns.creational.prototype;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by rohit.jh on 19/06/19
 */
class PrototypeFactory {
    private static final Movie MOVIE = new Movie();
    private static final Album ALBUM = new Album();
    private static final Song SONG = new Song();

    Object getPrototype(String type) throws InvalidArgumentException, CloneNotSupportedException {
        switch (type) {
            case "movie":
                return MOVIE.clone();
            case "album":
                return ALBUM.clone();
            case "song":
                return SONG.clone();
            default:
                throw new InvalidArgumentException(new String[]{});
        }
    }


}
