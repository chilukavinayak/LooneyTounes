package com.java.learn.dsalgo.twopointer;

class LinkedList{
    int data;
    LinkedList next;
    public LinkedList(int data){
        this.data = data;
    }
}

public class CycleInTheLinkedList {
    public static void main(String[] args) {
        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(2);
        head.next.next = new LinkedList(3);
        head.next.next.next = new LinkedList(4);
        head.next.next.next = head.next.next;

        System.out.println("it mast me true: "+ hasCycle(head));

        head = new LinkedList(1);
        head.next = new LinkedList(2);
        head.next.next = new LinkedList(3);
        head.next.next.next = new LinkedList(4);

        System.out.println("it mast me false: "+ hasCycle(head));

    }
    static boolean hasCycle(LinkedList head){
        LinkedList slow = head;
        LinkedList fast = head;
        do{
            if(slow != null)
                slow = slow.next;

            if(fast != null && fast.next != null)
                fast = fast.next.next;

            if(slow == fast)
                return true;

        }while(fast != null && slow != fast);

        return false;
    }

}
