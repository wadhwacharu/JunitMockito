package com.example.au_demo_live;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    private LinkedList<Integer> list;
    @BeforeEach
    void setup()
    {
        list=new LinkedList<>();
    }
    @ParameterizedTest
    @ValueSource(ints={-1,-3,-5,Integer.MIN_VALUE})
    @DisplayName("index = -1 ---> Exception should be thrown")
    void testElement_shouldThrowsExceptionOnNegativeIndex(int negativeIndex){
      final var list = new LinkedList<Integer>();
      assertThrows(RuntimeException.class, () -> list.getElement(negativeIndex));
}
//    @Test
//    @DisplayName("index = -1 ---> Exception should be thrown")
//    void testElement_shouldThrowsExceptionOnNegativeIndex(){
//
//        final var list = new LinkedList<Integer>();
//        assertThrows(RuntimeException.class, () -> list.getElement(-1));
//    }

    @Test
    @DisplayName("Given a valid index, getElement() should return the value")
    void testGetElement_shouldReturnELementOnValidIndex(){
        final var list = new LinkedList<Integer>();

        list.addElement(10);
        assertEquals(10, list.getElement(0));
    }

    @Test
    @DisplayName("index greater than the size --> throw exception")
    void testGetElement_shouldthrowExceptionGreaterThanSize(){
        final var list = new LinkedList<Integer>();

        list.addElement(10);
        list.addElement(20);
        final var exception =  assertThrows(RuntimeException.class, () -> list.getElement(2));
        assertEquals("Index greater than the size on the list", exception.getMessage());
    }

    @Test
    @DisplayName("Length Of LinkedList should inrease after adding element")
    void testIncreaseSize_shouldIncreaseTheSize(){

        final var list = new LinkedList<Integer>();

        list.addElement(10);
        list.addElement(20);
    }
}