package org.example;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentMap;

public class Cinema {
    String Genre;
    double rating;
    double revenue;
    String Director;
    String year;

    public Cinema(String genre, double rating, double revenue, String director, String year) {
        Genre = genre;
        this.rating = rating;
        this.revenue = revenue;
        Director = director;
        this.year = year;
    }

    public String getGenre() {
        return Genre;
    }

    public double getRating() {
        return rating;
    }

    public double getRevenue() {
        return revenue;
    }

    public String getDirector() {
        return Director;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "Genre='" + Genre + '\'' +
                ", rating=" + rating +
                ", revenue=" + revenue +
                ", Director='" + Director + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public static void main(String[] args) {
        LinkedHashSet<Cinema> cinemas = new LinkedHashSet<>();

        cinemas.add(new Cinema("Action", 2.4,1000.1,"Joseph","2023"));
        cinemas.add(new Cinema("Comedy", 2.4,1000.2,"Tosue","2024"));
        cinemas.add(new Cinema("Dra,", 2.4,1000.3,"Jos","2025"));

      cinemas.stream().sorted(Comparator.comparing(Cinema:: getGenre)).forEach(System.out::print);

      Cinema maxPorfitObjectCinema = cinemas.stream().max(Comparator.comparing(Cinema:: getRevenue)).orElse(null);
        System.out.println();
        System.out.println(maxPorfitObjectCinema);

        String directorName = cinemas.stream().max(Comparator.comparing(Cinema::getRevenue)).map(Cinema::getDirector).orElse(null);

        System.out.println(directorName);

        double totalRevenue = cinemas.stream().mapToDouble(Cinema::getRevenue).sum();


        System.out.println(totalRevenue);

        double totalRatin = cinemas.stream().mapToDouble(Cinema::getRating).sum();

        System.out.println(totalRatin);

        // Sort cinemas by revenue
        Comparator<Cinema> revenueComparator = Comparator.comparing(Cinema::getRevenue);
        cinemas.stream().sorted(revenueComparator).forEach(System.out::println);

        // Sort cinemas by director
        Comparator<Cinema> directorComparator = Comparator.comparing(Cinema::getDirector);
        cinemas.stream().sorted(directorComparator).forEach(System.out::println);
        // Sort cinemas by revenue in descending order
        Comparator<Cinema> revenueComparators = Comparator.comparing(Cinema::getRevenue).reversed();
        cinemas.stream().sorted(revenueComparators).forEach(System.out::println);

        // Sort cinemas by director in descending order
        Comparator<Cinema> directorComparatos = Comparator.comparing(Cinema::getDirector).reversed();
        cinemas.stream().sorted(directorComparatos).forEach(System.out::println);


    }
}
