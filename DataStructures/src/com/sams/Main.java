package com.sams;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeLast();
        list.contains(10);
    }
}