// Polymorphism means many forms
// At runtime, a method's behaviour can be different for different objects.
// The behaviour depends on runtime type of the object.
// The runtime type might be different from the declared type in the code.
// The declared type has to have some kind of relationship to the runtime type.
// Inheritance is used to support Polymorphism,
//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Movie theMovie = Movie.getMovie("Science", "Star Wars");
        theMovie.watchMovie();*/

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter Type (A for Adventure, C for Comedy, S for Science Fiction, or Q for Quit): ");
            String type = sc.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = sc.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}