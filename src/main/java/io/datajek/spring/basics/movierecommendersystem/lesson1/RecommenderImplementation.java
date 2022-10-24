package io.datajek.spring.basics.movierecommendersystem.lesson1;

public class RecommenderImplementation {

    public String[] recommendMovies(String movies) {
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
