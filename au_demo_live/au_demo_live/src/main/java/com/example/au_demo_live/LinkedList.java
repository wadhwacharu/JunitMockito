package com.example.au_demo_live;

public class LinkedList<T> {

    private Node<T> headNode;

    public T getElement(int index){
        if(index < 0){
            throw new RuntimeException("Index cannot be negative");
        }


        var iteratorNode = headNode;

        var currIndex = 0;
        while(iteratorNode != null){
            if(currIndex == index){
                return iteratorNode.getValue();
            }

            iteratorNode = iteratorNode.getNextNode();
            currIndex++;
        }

        throw new RuntimeException("Index greater than the size on the list");

    }

    public void addElement(T element){
        final var tempNode = new Node<T>();
        tempNode.setValue(element);

        if(headNode == null){
            headNode = tempNode;
        }

        var iteratorNode = headNode;
        while(iteratorNode.getNextNode() != null){
            iteratorNode = iteratorNode.getNextNode();
        }



//        if(iteratorNode == null){
//
//        }
    }


}
class Node<T>{

    private T value;
    private Node<T> nextNode;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}