package com.company;

public class findInList {

    static class ListNode<T> {
        ListNode(T x) {
            value = x;
        }
        T value;
        ListNode<T> next;
    }


    ListNode<Integer> solution(ListNode<Integer> l, int k) {
        if(l == null || l.value == k)
            return l;

        while(l!= null){
            if(l.value == k)
                return l;
            l = l.next;
        }

        return null;
    }
}
