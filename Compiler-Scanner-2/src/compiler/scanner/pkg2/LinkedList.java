/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

/**
 *
 * @author Dell
 */
public class LinkedList<T> {

    private Node<T> head;
    private int size;

    public LinkedList() {
        size = 0;
    }

    public void insert(T value) {
        Node<T> newNode = new Node(value);
        newNode.nextNode = null;
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
        }
        size++;
    }

    public T get(T value) {
        if (head.value.equals(value)) {
            return head.value;
        } else {
            Node<T> temp = head;
            while (temp.nextNode != null) {
                if (temp.value.equals(value)) {
                    return temp.value;
                }
                temp = temp.nextNode;
            }
        }
        return null;
    }

    public T get(int index) {
        if (index == 0) {
            return head.value;
        }
        Node<T> temp = head;
        for (int i = 0; i < index && i < size; i++) {
            if (temp.nextNode != null) {
                temp = temp.nextNode;
            }
        }
        return temp.value;
    }

    private Node<T> getNode(int index) {
        if (index == 0) {
            return head;
        }
        Node<T> temp = head;
        for (int i = 0; i < index && i < size; i++) {
            if (temp.nextNode != null) {
                temp = temp.nextNode;
            }
        }
        return temp;
    }

    public void remove(T value) {
        Node<T> temp = head;
        Node<T> prev = null;
        if (temp != null && temp.value.equals(value)) {
            head = temp.nextNode;
        }

        while (temp != null && !temp.value.equals(value)) {
            prev = temp;
            temp = temp.nextNode;
        }

        if (temp != null) {
            prev.nextNode = temp.nextNode;
        }
    }

    private class Node<T> {

        private T value;
        private Node<T> nextNode;

        private Node(T value) {
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public void replace(int index, T value) {
        if (index > size || index < 0) {
            return;
        }
        if (index == 0 && head != null) {
            head.value = value;
        }
        Node<T> toReplace = this.getNode(index);
        toReplace.value = value;
    }

//    public static void main(String[] args) {
//        LinkedList<Integer> l = new LinkedList<>();
//        l.insert(0);
//        l.insert(1);
//        l.replace(0, 5);
//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i));
//        }
//    }
}
