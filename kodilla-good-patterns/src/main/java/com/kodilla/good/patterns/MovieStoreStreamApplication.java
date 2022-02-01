package com.kodilla.good.patterns;

import java.util.List;
import java.util.Map;

public class MovieStoreStreamApplication {
    public static void main(String[] args) {
        String result = "";
        Map<String, List<String>> listOfMovies = MovieStore.getMovies();
        listOfMovies
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(p -> p.stream()
                        .map(v -> v.concat(",")))
                .forEach(System.out::print);
    }
}
