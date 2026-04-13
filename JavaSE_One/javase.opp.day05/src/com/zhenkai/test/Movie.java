package com.zhenkai.test;

/**
 * @author Zhenkai
 * @date 2026/4/13 周一
 * @description 存放电影数据
 **/
public class Movie {
    private String movieName;
    private double movieScore;
    private int id;
    private String director;
    private String actor;
    private String information;

    public Movie() {
    }

    public Movie(String movieName, double movieScore, int id, String director, String actor, String information) {
        this.movieName = movieName;
        this.movieScore = movieScore;
        this.id = id;
        this.director = director;
        this.actor = actor;
        this.information = information;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getMovieScore() {
        return movieScore;
    }

    public void setMovieScore(double movieScore) {
        this.movieScore = movieScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
