package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.lesson1.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        RecommenderImplementation recommender = new RecommenderImplementation();
        String[] results = recommender.recommendMovies("Finding Dory");

        System.out.println(Arrays.toString(results));

        SpringApplication.run(MovieRecommenderSystemApplication.class, args);


    }

}
