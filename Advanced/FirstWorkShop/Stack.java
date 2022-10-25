package FirstWorkShop;

import java.util.function.Consumer;

public class Stack<Integer> {
    private static class Node {
        private int element;
        private Node prev;

        private Node(int element) {
            this.element = element;
        }
        }
    private Node top;
    private int size;
    public Stack() {

    }
    public void push(int element) {
        Node newNode = new Node(element);
        if (this.top != null) {
            newNode.prev = this.top;
        }
        this.top = newNode;
        size++;
    }
    private int pop(int element) {
        ensureNonEmpty();
        int result = this.top.element;
        this.top = this.top.prev;
        size--;
        return  result;
    }
    public int peek(){
        ensureNonEmpty();
        return this.top.element;
    }
    public void forEach(Consumer<java.lang.Integer> consumer) {
        Node currentNode = this.top;
        while (currentNode != null) {
            consumer.accept(currentNode.element);
            currentNode = currentNode.prev;
        }
    }
    private void ensureNonEmpty() {
        if (this.top == null) {
            throw new IllegalStateException("Empty Stack");
        }
    }
}
