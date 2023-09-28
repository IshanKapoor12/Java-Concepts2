public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    // public->access modifier AND Car->Constructor name (same as Class name)
    public Car(){
        this("Mercedes", "S Class", "Black", 2, false); // Constructor Chaining
        System.out.println("Empty Constructor called.");
    }

    public Car(String make, String model, String color, int doors, boolean convertible){
        System.out.println("Constructor with parameters called.");

        // LHS->attribute of the class, RHS->argument of the constructor.
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;
    }

    public Car(String color, int doors, boolean convertible) {
        this("Bugatti", "Chiron", color, doors, convertible); // Constructor Chaining.
        /*this.color = color;
        this.doors = doors;
        this.convertible = convertible;*/
    }

    // getters are methods used to access private attributes in a class.
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    //setters are used to make changes to private attributes.
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));
    }
}
