package com.company.Linklist;

public class linklist {
    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public void display() {
        Node temp = this.head;
        System.out.println("--------------------------------");
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("--------------------------------");
    }

    public void addLast(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if (this.size >= 1) {
            this.tail.next = nn;
        }
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.tail = nn;
            this.size++;
        }
    }

    public void addFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;
        if (this.size >= 1) {
            nn.next = head;
        }
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.head = nn;
            this.size++;
        }
    }

    public int getFirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("Empty");
        }
        return this.head.data;
    }

    public int getlast() throws Exception {
        if (this.size == 0) {
            throw new Exception("Empty");
        }
        return this.tail.data;
    }

    public int getAt(int idx) throws Exception {
        if (this.size == 0) {
            throw new Exception("ll is Empty");
        }
        if (idx < 0 || idx >= this.size) {
            throw new Exception("invalid Index");
        }
        Node temp = this.head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public Node getNodeAt(int idx) throws Exception {
        if (this.size == 0) {
            throw new Exception("ll is Empty");
        }
        if (idx < 0 || idx >= this.size) {
            throw new Exception("invalid Index");
        }
        Node temp = this.head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void AddAt(int item, int idx) throws Exception {
        if (idx < 0 || idx > this.size) {
            throw new Exception("invalid index");
        }
        if (idx == 0) {
            addFirst(item);
        } else if (idx == this.size) {
            addLast(item);
        }
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        Node nm1 = getNodeAt(idx - 1);
        Node np1 = nm1.next;
        nm1.next = nn;
        nn.next = np1;

        this.size++;
    }

    public int removeFirst() throws Exception {

        if (this.size == 0) {
            throw new Exception("ll is empty");
        }
        int rv = this.head.data;

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            this.head = this.head.next;
            this.size--;
        }
        return rv;
    }

    public int removeLast() throws Exception {
        if (this.size == 0) {
            throw new Exception("ll is empty");
        }
        int rv = tail.data;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            Node lm1 = getNodeAt(this.size - 2);
            this.tail = lm1;
            this.tail.next = null;
            this.size--;

        }
        return rv;
    }

    public int removeAt(int idx) throws Exception {
        if (this.size == 0) {
            throw new Exception("ll is empty");
        }
        if (idx < 0 || idx >= this.size) {
            throw new Exception("invalid Index");
        }
        if (idx == this.size - 1) {
            return removeLast();
        } else if (idx == 0) {
            return removeFirst();
        } else {
            Node nm1 = getNodeAt(idx - 1);
            Node n = nm1.next;
            Node np1 = n.next;
            int rv = n.data;
            nm1.next = np1;
            this.size--;
            return rv;
        }
    }

    public void reverseData() throws Exception {
        int left = 0;
        int right = this.size - 1;
        while (left < right) {
            Node lt = getNodeAt(left);
            Node rt = getNodeAt(right);
            int temp = lt.data;
            lt.data = rt.data;
            rt.data = temp;
            left++;
            right--;
        }
    }

    public void ReversePointer() throws Exception {
        Node previous = this.head;
        Node current = previous.next;

        while (current != null) {
            Node Ahead = current.next;
            current.next = previous;
            previous = current;
            current = Ahead;
        }
        Node t = this.head;
        this.head = this.tail;
        this.tail = t;
        this.tail.next = null;
    }

    public int midNode() {
        Node slow = this.head;
        Node fast = this.head;
        while (fast.next!=null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public int size(){
        return this.size;
    }

    public boolean IsEmpty(){
        if(this.size==0){
            return true;
        }
        return false;
    }



}





