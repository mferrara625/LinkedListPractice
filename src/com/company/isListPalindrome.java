package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class isListPalindrome {

     class ListNode<T> {
   ListNode(T x) {
     value = x;
   }
   T value;
   ListNode<T> next;
 }

    boolean solution(ListNode<Integer> l) {

        List<Integer> arrList = new ArrayList();
        List<Integer> revList = new ArrayList();

        if(l == null)
            return true;

        arrList.add(l.value);
        revList.add(l.value);

        while(l.next != null){
            arrList.add(l.next.value);
            revList.add(l.next.value);
            l.next = l.next.next;
        }
        Collections.reverse(revList);

        if(arrList.equals(revList))
            return true;

        return false;
    }
}
