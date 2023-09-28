// Casting with Classes

// Local Variable Type Inference: Used to help with the readability of the code and to reduce boilerplate code.
// It's called Local Variable Type Inference because:
// 1. It can't be used in field declarations on a class.
// 2. It can't be used in method signatures, either as a parameter type or a return type.
// 3. It can't be used without an assignment, because the type can't be inferred in that case.
// 4. It can't be assigned a null literal, again because a type can't be inferred in that case.

public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        // Adventure jaws = (Adventure) Movie.getMovie("C", "Jaws"); // Gives error as class is cast as Adventure but type is given as C.

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        // var is a special contextual keyword that lets the code take advantage of Local Variable Type Inference
        // It tells Java to figure out the compile-time type for us.

        var airplane = Movie.getMovie("C","Aiplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        // Testing the runtime type using instanceof Operator.
        // The left operand is the reference variable being tested.
        // The right operand is the type we are testing for.
        // Eg: unknownObject instanceof Adventure
        // If the instanceof operator returns true then the object can be assigned to a binding variable for further use without casting.
        // Eg: unknownObject instanceof ScienceFiction syfy

        Object unknownObject = Movie.getMovie("C", "Airplane");

        // Done without instanceof operator.
        if(unknownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        }

        // Done with instanceof operator and casting.
        else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        }

        // Done with instanceof operator but without casting.
        else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
