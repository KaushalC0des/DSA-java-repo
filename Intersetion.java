class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {

    // Function to get the count of nodes in a linked list 
    static int getCount(Node head) {
        int cnt = 0;
        Node curr = head;
        while (curr != null) {
            cnt++;
            curr = curr.next;
        }
        return cnt;
    }

    // Function to get the intersection point of two
    // linked lists where head1 has d more nodes than head2
    static Node getIntersectionByDiff(int diff, Node head1, Node head2) {
        Node curr1 = head1;
        Node curr2 = head2;

        // Move the pointer forward by d nodes
        for (int i = 0; i < diff; i++) {
            if (curr1 == null)
                return null;
            curr1 = curr1.next;
        }

        // Move both pointers until they intersect
        while (curr1 != null && curr2 != null) {
            if (curr1 == curr2)
                return curr1;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return null;
    }

    // Function to get the intersection point of two linked lists
    static Node intersectPoint(Node head1, Node head2) {
      
        // Count the number of nodes in both linked lists
        int len1 = getCount(head1);
        int len2 = getCount(head2);

        int diff = 0;

        // If the first list is longer
        if (len1 > len2) {
            diff = len1 - len2;
            return getIntersectionByDiff(diff, head1, head2);
        } else {
            diff = len2 - len1;
            return getIntersectionByDiff(diff, head2, head1);
        }
    }

    public static void main(String[] args) {
      
        // creation of first list: 10 -> 15 -> 30
        Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(30);

        // creation of second list: 3 -> 6 -> 9 -> 15 -> 30
        Node head2 = new Node(3);
        head2.next = new Node(6);
        head2.next.next = new Node(9);

        // 15 is the intersection point
        head2.next.next.next = head1.next;

        Node intersectionPoint = intersectPoint(head1, head2);

        if (intersectionPoint == null)
            System.out.println("-1");
        else
            System.out.println(intersectionPoint.data);
    }
}