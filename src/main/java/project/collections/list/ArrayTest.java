package project.collections.list;

import java.util.*;

public class ArrayTest {
    private final List<Integer> listOfIntegers = new LinkedList<>();

    public void arrayInit() {
        listOfIntegers.add(1);
        listOfIntegers.add(-2);
        listOfIntegers.add(6);
        listOfIntegers.add(0);
        listOfIntegers.add(null);
    }

    public void out() {
        listOfIntegers.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ArrayTest arrayTest = new ArrayTest();
        arrayTest.arrayInit();
        arrayTest.out();
    }
}