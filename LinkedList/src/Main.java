// Queue - A First-In, First-Out (FIFO) Data Collection
// Remove an item - POLL the queue -> gives the first element of the queue.
// Add an item - OFFER the queue -> adds the item at the back of the queue.
// Single-ended queues always process elements from thw start of the queue.

// A LinkedList can be used as a double ended queue which allows access to both start and end of the queue.

// Stack - A Last-In, First-Out (LIFO) Data Collection
// It is like a vertical pile of elements, one on top of another.
// Add an item - PUSH onto the stack -> item added on top of the stack.
// Remove an item - POP from the stack -> item removes from the top of the stack.


import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // LinkedList<String> placesToVisit = new LinkedList<>(); // One way to declare a linked list.

        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);

        gettingElements(placesToVisit);

        printItinerary(placesToVisit);
        printItinerary2(placesToVisit);
        printItinerary3(placesToVisit);

        testIterator(placesToVisit);
        testListIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");

        // queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        // stack methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);

        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");

        // Queue methods
        String p1 = list.poll(); // removes first element
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast(); // removes last element
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); // removes first element
        System.out.println((p4 + " was removed"));
    }

    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position = " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position = " + list.lastIndexOf("Melbourne"));

        // queue retrieval methods
        System.out.println("Element from element() = " + list.element());

        // stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());

        for(int i=1;i<list.size();i++){
            System.out.println("---> From: " + list.get(i-1) + " to " + list.get(i));
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());

        String previousTown = list.getFirst();
        for(String town : list){
            System.out.println("---> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    // next() method is used to get the next element in the list.
    // hasNext() method is used to check if any elements remain to be processed
    // default position of the cursor is before the first element of the list.

    public static void printItinerary3(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());

        String previousTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("---> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){
        var iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(list);

        var iterator2 = list.iterator();
        while(iterator2.hasNext()){
            if(iterator2.next().equals("Brisbane")){
                iterator2.remove();
            }
        }
        System.out.println(list);
    }

    // An iterator is forwards only and supports the remove method only.
    // A ListIterator can be used to go both forwards and backwards
    // And it can use remove, add and set methods.
    // The position of the iterator is between the elements.
    // Eg: When the iterator position is 1, it is present between the elements at index 0 and 1.

    private static void testListIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(list);

        // printing the list backwards.
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator();
        while(iterator2.hasNext()){
            if(iterator2.next().equals("Brisbane")){
                iterator2.add("Lake Wivenhoe");
            }
        }
        System.out.println(list);



        // printing an element at particular index.
        var iterator3 = list.listIterator(3);
        System.out.println(iterator3.next());
        System.out.println(iterator3.previous());


    }
}