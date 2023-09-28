// Encapsulation means hiding things, by making them private or inaccessible.
// Reasons for Encapsulation:
// 1. To make the interface simpler, and to hide unnecessary details.
// 2. To protect the integrity of data on an object.
// 3. To decouple the published interface from the internal details of the class.
// Allowing direct access to data on an object can bypass checks and operations
// That is why we need encapsulation.
// Encapsulation is used to prevent effect on any other code.
// It is used to stay in control of the classes created.

// Encapsulation Principles:
// 1. Create constructors for object initialization, which enforces that only objects with valid data will be created.
// 2. Use the private access modifier for your fields.
// 3. Use setter and getter methods sparingly, and only as needed.
// 4. Use access modifiers that aren't private, only for the methods that the calling code needs to access.

public class Main {
    public static void main(String[] args) {
        /*Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        player.health = 200;

        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());
        */

        EnhancedPlayer tim = new EnhancedPlayer("Tim",100,"Sword");
        System.out.println("Initial health is = " + tim.healthRemaining());

    }
}