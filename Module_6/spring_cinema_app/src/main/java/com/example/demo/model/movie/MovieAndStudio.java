package com.example.demo.model.movie;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class MovieAndStudio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movieS;

    @ManyToOne
    @JoinColumn(name = "movie_studio_id")
    private MovieStudio movieStudio;

    public MovieAndStudio() {
    }

    public MovieAndStudio(Integer id, Movie movieS, MovieStudio movieStudio) {
        this.id = id;
        this.movieS = movieS;
        this.movieStudio = movieStudio;
    }
}
