public class Main {
    public static void main(String[] args) {

        // POJO
        Student s1 = null;
        for (int i = 0; i <= 5; i++) {
            s1 = new Student("5882" + i,
                    switch (i) {
                        case 1 -> "Ishan";
                        case 2 -> "Ishita";
                        case 3 -> "Anusha";
                        case 4 -> "Ashish";
                        case 5 -> "Amrit";
                        default -> "Anonymous";
                    },
                    "05/04/2003",
                    "Java MasterClass");
            System.out.println(s1);
        }

        // Record
        newStudent s2 = null;
        for (int i = 0; i <= 5; i++) {
            s2 = new newStudent("5882" + i,
                    switch (i) {
                        case 1 -> "Ishan";
                        case 2 -> "Ishita";
                        case 3 -> "Anusha";
                        case 4 -> "Ashish";
                        case 5 -> "Amrit";
                        default -> "Anonymous";
                    },
                    "05/04/2003",
                    "Java MasterClass");
            System.out.println(s2);
        }

        // using getters from POJO class.
        System.out.println(s1.getName() + " is taking " + s1.getClassList());

        // using accessor methods from Record class.
        System.out.println(s2.name() + " is taking " + s2.classList());
    }
}