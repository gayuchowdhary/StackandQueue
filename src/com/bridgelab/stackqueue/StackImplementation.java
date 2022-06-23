package com.bridgelab.stackqueue;

public class StackImplementation implements IStack {
    LinkedList list = new LinkedList();

    @Override
    public void push(int data) {
        list.add(data);
    }

    @Override
    public String toString() {
        return "StackImplementation{" +
                "list=" + list +
                '}';
    }
}
