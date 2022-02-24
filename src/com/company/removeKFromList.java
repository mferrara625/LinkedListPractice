package com.company;

public class removeKFromList {
    class ListNode<T> {
   ListNode(T x) {
     value = x;
   }
   T value;
   ListNode<T> next;
 }


    ListNode<Integer> solution(ListNode<Integer> l, int k) {

        if(l == null){
            return l;
        }

        while(l.value == k && l != null){
            l = l.next;
            if( l == null){
                break;
            }
        }

        if(l == null){
            return l;
        }

        ListNode<Integer> current = l;

        while(current.next != null){
            if(current.value == k){
                current = current.next;
            }
            if(current.next.value == k){
                current.next = current.next.next;
            }
            else{
                current = current.next;

            }
        }


        return l;
    }
}
