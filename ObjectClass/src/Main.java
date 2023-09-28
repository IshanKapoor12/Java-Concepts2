// Every class extends the Object class of java.lang.Object.
// It is the same as
// public class Main extends Object
// every class inherits the methods of the Object class.

public class Main {
    public static void main(String[] args) {
        Student max = new Student("Max", 21);
        //System.out.println(max.toString()); // max.toString() prints the class name followed by @ and the hash code of the symbol when no toString() method is defined.
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);

    }
}

class Student {
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}