public class BestProblems {

    // Tower of Hanoi
    // Rules:
    // 1. Only one disk transferred in 1 step.
    // 2. Smaller disks are always kept on top of larger disks.

    public static void TowerOfHanoi(int n, char src, char helper, char dest) {
        if(n == 0) {
            return;
        }

        TowerOfHanoi(n-1, src, dest, helper);
        System.out.printf("Move disk from %c to %c %n", src, dest );
        TowerOfHanoi(n-1, helper, src, dest);
    }

    // Reverse a string

    public static void reverseString(String s) {
        if(s.isEmpty()) {
            return;
        }
        String rev = s.substring(1);
        reverseString(rev);
        System.out.print(s.charAt(0));
    }

    // First and Last Occurrence of an element in a string

    public static int firstOcc(String s, int n, int i, char key) {
        if(i == n) {
            return -1;
        }
        if(s.charAt(i) == key) {
            return i;
        }
        return firstOcc(s, n, i+1, key);
    }

    public static int lastOcc(String s, int n, int i, char key) {
        if(i == n) {
            return -1;
        }
        int restString = lastOcc(s, n, i+1, key);
        if(restString != -1) {
            return restString;
        }
        if(s.charAt(i) == key) {
            return i;
        }
        return -1;
    }

    // Checking if an array is sorted

    public static boolean isSorted(int[] arr, int i) {
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] < arr[i+1]) {
            return isSorted(arr, i+1);
        } else {
            return false;
        }
    }

    //

    public static void main(String[] args) {
        System.out.println("Tower of Hanoi");
        TowerOfHanoi(3, 'A', 'B', 'C');

        System.out.println("---x---x---x---x---");

        System.out.println("Reverse String");
        reverseString("Ishan");
        System.out.println();

        System.out.println("---x---x---x---x---");

        System.out.println("First and Last Occurrence of an element in a string");
        String s = "abaacdaefaah";
        int len = s.length();
        System.out.println(firstOcc(s, len, 0, 'a'));
        System.out.println(lastOcc(s, len, 0, 'a'));

        System.out.println("---x---x---x---x---");

        System.out.println("Checking if an array is sorted");
        int n = 5;
        int[] arr = {1, 3, 5, 10, 9};
        System.out.println(isSorted(arr, 0));



    }
}
