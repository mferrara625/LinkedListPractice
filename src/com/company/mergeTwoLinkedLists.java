package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mergeTwoLinkedLists {
     class ListNode<T> {
   ListNode(T x) {
     value = x;
   }
   T value;
   ListNode<T> next;
 }

    ListNode<Integer> solution(ListNode<Integer> l1, ListNode<Integer> l2) {

        List<Integer> intList = new ArrayList<>();
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        intList.add(l1.value);
        intList.add(l2.value);
        while(l1.next != null){
            intList.add(l1.next.value);
            l1.next = l1.next.next;
        }
        while(l2.next != null){
            intList.add(l2.next.value);
            l2.next = l2.next.next;
        }
        Collections.sort(intList);
        ListNode head = new ListNode(intList.get(0));
        ListNode current = head;
        for(int i = 1; i < intList.size(); i++){
            current.next = new ListNode(intList.get(i));
            current = current.next;
        }

        return head;
    }

}
