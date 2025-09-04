class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    ListNode head;

    LL() {
        this.head = null;
    }

    public void insertAtHead(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void insertAtTail(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    public void insertAtAnyPos(int data, int pos) {
        ListNode newNode = new ListNode(data);
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null && pos > 1) {
            prev = curr;
            curr = curr.next;
            pos--;
        }

        if (prev == null && pos == 1) {
            insertAtHead(data);
            return;
        }

        if (pos == 1) {
            prev.next = newNode;
            newNode.next = curr;
        }
    }

    void printLL() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }

        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;

        }
    }

    public int deleteAtHead() {
        if (head == null) {
            System.out.println("List Is Empty");
            return -1;
        }

        int data = head.data;
        head = head.next;
        return data;

    }

    public int deleteAtTail() {
        if (head == null) {
            System.out.println("Lost is Empty");
            return -1;
        }

        if (head.next == null) {
            int data = head.data;
            head = null;
            return data;
        }

        ListNode curr = head;

        while (curr.next.next != null) {
            curr = curr.next;
        }

        int data = curr.data;
        curr.next = null;
        return data;
    }

    public int get(int index) {
        ListNode curr = head;
        while (curr != null && index > 1) {
            curr = curr.next;
            index--;
        }
        if (index == 1) {
            return curr.data;

        }
        return -1;
    }

    public int deleteAtAnyPos(int pos) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null && pos > 1) {
            prev = curr;
            curr = curr.next;
            pos--;
        }
        int data = -1;
        if (prev == null && pos == 1) {
            data = deleteAtHead();
            return data;
        }
        if (curr == null) {
            data = deleteAtTail();
            return data;
        }
        if (pos == 1) {
            data = curr.data;
            prev.next = curr.next;
        }

        return data;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.insertAtAnyPos(6, 3);
        list.insertAtHead(7);
        list.deleteAtAnyPos(3);
        list.deleteAtHead();
        list.deleteAtTail();
        list.insertAtAnyPos(7, 1);
        list.insertAtAnyPos(8, 6);
        list.deleteAtAnyPos(1);
        list.deleteAtAnyPos(6);
        System.out.println(list.get(3));
        list.printLL();

    }

}
