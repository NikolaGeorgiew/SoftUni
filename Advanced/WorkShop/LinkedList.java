package WorkShop;

import java.util.function.Consumer;

public class LinkedList {
    private Node head;
    private int size;
    private Node tail;


    public void addFirst(int element) {
        Node newNode = new Node(element);

        if (!isEmpty()) {
            newNode.next = head;
            head.prev = newNode;

        } else {
            tail = newNode;
        }
        head = newNode;
        size++;
    }
    public void addLast(int element) {
        if (isEmpty()) {
            addFirst(element);
        }
        else {
            Node currentNode = head;
            Node newNode = new Node(element);
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
    public int get (int index) {
        checkIndex(index);
        Node currentNode = head;
        int currentIndex = 0;
        while (currentIndex < index) {

            currentNode = currentNode.next;
            currentIndex++;
        }
        return currentNode.value;

    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("No such element in list.");
        }
        Node currentNode = head;
        head = currentNode.next;
        size--;
        if (this.size > 1) {
            head.prev = null;
        }
        if (isEmpty()) {
            head = null;
            tail = null;
        }
        return currentNode.value;

    }
    public int removeLast() {
        if (size < 2) {
            return removeFirst();
        }
        int result = tail.value;
        tail = tail.prev;
        tail.next = null;

        size--;
        return result;

    }
    public void forEach(Consumer<Integer> consumer) {
        Node currentNode = head;
        while (currentNode.next != null) {
            consumer.accept(currentNode.value);


            currentNode = currentNode.next;
        }
    }
    public int[] toArray() {
        Node currentNode = head;
        int[] arr = new int[size];
        int index = 0;
        while (currentNode != null) {
            arr[index] = currentNode.value;

            index++;
            currentNode = currentNode.next;
        }
        return arr;
    }
    public void checkIndex(int index) {
        if (index < 0 || index >= size){
            throw new IllegalStateException("No such index in list.");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
