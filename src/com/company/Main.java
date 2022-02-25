package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        findInList.ListNode<Integer> fil = new findInList.ListNode<Integer>(1);
        fil.next = new findInList.ListNode<>(2);
        fil.next.next = new findInList.ListNode<>(3);
        fil.next.next.next = new findInList.ListNode<>(4);
        fil.next.next.next.next = new findInList.ListNode<>(5);
        findInList filMethod = new findInList();
        System.out.println(filMethod.solution(fil, 3));
        System.out.println("*************************\n" + fil.next.next);
    }
}
