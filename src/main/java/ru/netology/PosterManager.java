package ru.netology;

public class PosterManager {
    private String[] movie = { "movie1", "movie2", "movie3", "movie4", "movie4",  "movie5", "movie6", "movie7"

    };

    public PosterManager(String film) {

        this.movie = movie;
    }

    public PosterManager() {
    }
    public PosterManager(int size) {

    }

    public String[] getMovie() {
        return movie;
    }

    public void setMovie(String[] movie) {

        this.movie = movie;
    }

    private PosterManager[] movies = new PosterManager[0];

    public void add(PosterManager movie) {
        PosterManager[] tmp = new PosterManager[movies.length+1];
        for (int i=0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public void  findAll(PosterManager movie) {
        PosterManager[] tmp = new PosterManager[movies.length + 1];
        for (int i=0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length -1] = movie;
        movies = tmp;

    }


    public void findLast(PosterManager) {

    }
        ??? resultLength;
  if ??? {
        resultLength = ???
    } else {
        resultLength = ???
    }
  ??? result = new ???[resultLength];
  for (???) {
        // заполняем result из массива, что лежит в поле
        // в обратном порядке
    }
}

