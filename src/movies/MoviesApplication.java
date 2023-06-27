package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie[] movies = MoviesArray.findAll();
        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. View all movies");
            System.out.println("2. View movies in the animated category");
            System.out.println("3. View movies in the drama category");
            System.out.println("4. View movies in the horror category");
            System.out.println("5. View movies in the romance category");
            System.out.println("6. View movies in the thriller category");
            System.out.println("7. View movies in the history category");
            System.out.println("8. View movies in the action category");
            System.out.println("9. View movies in the documentary category");
            System.out.println("10. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewAllMovies(movies);
                    break;
                case 2:
                    viewMoviesByCategory(movies, "animated");
                    break;
                case 3:
                    viewMoviesByCategory(movies, "drama");
                    break;
                case 4:
                    viewMoviesByCategory(movies, "horror");
                    break;
                case 5:
                    viewMoviesByCategory(movies, "romance");
                    break;
                case 6:
                    viewMoviesByCategory(movies, "thriller");
                    break;
                case 7:
                    viewMoviesByCategory(movies, "history");
                    break;
                case 8:
                    viewMoviesByCategory(movies, "action");
                    break;
                case 9:
                    viewMoviesByCategory(movies, "documentary");
                    break;
                case 10:
                    System.out.println("Exiting the program..");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
    public static void viewAllMovies(Movie[] movies) {
        System.out.println("\nAll Movies:");
        for (Movie movie: movies) {
            System.out.println(movie);
        }
    }
    public static void viewMoviesByCategory(Movie[] movies, String animated) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the category: ");
        String category = scanner.nextLine();

        System.out.println("\nMovies in the category \"" + category + "\":");
        boolean foundMovies = false;

        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie);
                foundMovies = true;
            }
        }

        if (!foundMovies) {
            System.out.println("No movies found in the category \"" + category + "\"");
        }
    }
}

