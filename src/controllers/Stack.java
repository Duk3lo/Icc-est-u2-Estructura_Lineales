package controllers;

import models.Node;

public class Stack<T> {

    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(top);
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T data = top.getValue();
        top = top.getNext();
        return data;
    }

    public T peek() {
        if (isEmpty())
            return null;
        T data = top.getValue();
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        int count = 1;
        Node<T> aux = top;
        while (aux.getNext() != null) {
            aux = aux.getNext();
            count++;
        }
        return count;
    }

    public void pritnAllNodes() {
        Node<T> current = top;
        System.out.print("Cima -> ");
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }

}
