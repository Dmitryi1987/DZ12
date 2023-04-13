package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    PosterManager film1 = new PosterManager("movie1");
    PosterManager film2 = new PosterManager("movie2");
    PosterManager film3 = new PosterManager("movie3");
    PosterManager film4 = new PosterManager("movie4");
    PosterManager film5 = new PosterManager("movie5");
    PosterManager film6 = new PosterManager("movie6");
    PosterManager film7 = new PosterManager("movie7");
    @Test
    public void TestAdd() {
        PosterManager poster = new PosterManager(5);
        poster.add(film1);
        poster.add(film2);
        poster.add(film3);
        poster.add(film4);
        poster.add(film4);
        poster.add(film5);

        PosterManager[] expected = {} ;
        PosterManager[] actual =poster.getMovie();

                Assertions.assertArrayEquals(expected, actual);

    }
}
