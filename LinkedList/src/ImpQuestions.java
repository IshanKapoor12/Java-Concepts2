class ImpQuestions {
    static Node head;
    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Find and Remove the nth node from end

    public Node removeNthFromEnd(Node head, int n) {
        if(head.next == null) {
            return null;
        }

        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        if(n == size) {
            return head.next;
        }

        int indexReq = size - n;
        Node prev = head;
        int i = 1;
        while(i<indexReq) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }

     // Check for palindromes

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node findMiddle(Node head) {
        Node hare = head;
        Node turtle = head;

        while(hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(Node head) {
        if(head == null || head.next == null) {
            return true;
        }

        Node middle = findMiddle(head);
        Node secondHalfStart = reverse(middle.next);

        Node firstHalfStart = head;
        while(secondHalfStart != null) {
            if(firstHalfStart.data != secondHalfStart.data) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    // Cycles in Linked List

    // Cycle Formation in a LL
    public void makeCycle(Node head, int pos) {
        Node temp = head;
        Node startNode = null;

        int count = 1;
        while(temp.next != null) {
            if(count == pos) {
                startNode = temp;
            }
            temp = temp.next;
            count++;
        }
        temp.next = startNode;
    }

    // Cycle Detection in a LL
    public boolean detectCycle(Node head) {
        if(head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    // Cycle Removal in a LL
    public void removeCycle(Node head) {
        Node slow = head;
        Node fast = head;

        do {
            slow = slow.next;
            fast = fast.next.next;
        } while(slow != fast);

        fast = head;
        while(slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = null;
    }

    public static void main(String[] args) {
        ImpQuestions list = new ImpQuestions();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        Node newHead = list.removeNthFromEnd(head, 2);
        list.printList();

        ImpQuestions list1 = new ImpQuestions();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(2);
        list1.addLast(1);
        System.out.println(list1.isPalindrome(head));

        ImpQuestions list2 = new ImpQuestions();
        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(4);
        list2.makeCycle(head, 2);
        list2.printList();

        System.out.println(list2.detectCycle(head));
        System.out.println(list1.detectCycle(head));

        list2.removeCycle(head);
        list2.printList();
    }
}
