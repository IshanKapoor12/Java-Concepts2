// child or subclass or Animal.
// a class can use only one class in its extends clause.

public class Dog extends Animal {

    private String earShape;
    private String tailShape;
    public Dog() {
        super("Mutt", "Big", 50); // used to call a constructor on the super class from the subclass's constructor.
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        if(type=="Wolf"){
            System.out.println("Ow Woo! ");
        }
        bark();
        System.out.println();
    }

    // Overridden Method
    // It can do one of 3 things:
    // 1. It can implement completely different behaviour, overriding the behaviour of the parent.
    // 2. It can simply call the parent class's method, which is somewhat redundant.
    // 3. The method can call the parent class's method, and include other code to run, so it can extend the functionality for the Dog, for that behaviour.
    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail.");
        if(speed=="slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.println("Woof! ");
    }

    private void run(){
        System.out.println("Dog Running ");
    }

    private void walk(){
        System.out.println("Dog Walking");
    }

    private void wagTail(){
        System.out.println("Tail Wagging ");
    }
}
