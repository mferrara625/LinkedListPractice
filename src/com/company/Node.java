package com.company;

public class Node<T> {
    Node(T x) {
        value = x;
    }
    T value;
    Node<T> left;
    Node<T> right;

}