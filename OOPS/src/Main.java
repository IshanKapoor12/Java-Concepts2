public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // default constructor (no-arguments constructor)
        // declared when no constructor declarations are made in the class.

        // use of setters
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Red");
        car.setDoors(2);
        car.setConvertible(true);

        // use of getters
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        car.describeCar();

        // parameterized constructor called.
        Car car2 = new Car("Tesla", "X", "Gray", 2, true);
        System.out.println("Make = " +car2.getMake());

        // Constructor Overloading (done above)
        // It means declaring multiple constructors with formal parameters.
        // The number of parameters can be different.
        // If the number of parameters is same, then their type or order needs to differ.

        // Constructor Chaining
        // It is when one constructor explicitly calls another overloaded constructor.
        // It is calling a constructor only from another constructor.
        // Special statement this() is used to execute another constructor, passing it arguments if required.
        // And this() must be the first executable statement, if it's used from another constructor.

        Car car3 = new Car();
        System.out.println("Model = "+car3.getModel());

        Car car4 = new Car("Brown", 2, false);
        System.out.println("Make = "+ car4.getMake() + " and Model = "+ car4.getModel());
    }
}
