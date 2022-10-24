package io.datajek.spring.basics.movierecommendersystem.lesson1;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    private Filter filter;

    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }

    public String[] recommendMovies(String movies) {
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }
}
