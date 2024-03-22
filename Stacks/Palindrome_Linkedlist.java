import java.util.*;
public class Palindrome_Linkedlist {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.next = null;
            this.data = data;
        }
    }
    public static boolean isPalindrome(Node head) {
        Node slow = head;
        boolean isPalin = true;
        Stack<Integer> s = new Stack<>();
        while (slow != null) {
            s.push(slow.data);
            slow = slow.next;
        }
        while (head != null) {
            int i = s.pop();
            if (i == head.data) {
                isPalin = true;
            } else {
                return false;
            }
            head = head.next;
        }
        return isPalin;

    }

    public static void main(String args[]) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(6);
        Node five = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = null;
        System.out.println(isPalindrome(one));
    }
}