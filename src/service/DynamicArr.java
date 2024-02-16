package service;

import util.Input;

import java.util.Arrays;

public class DynamicArr {
    private Integer[] myArray;
    private int size;

    public void removeAll() {
        System.out.println(Arrays.toString(myArray));
        int removeE = Input.inputInt("Choose element to remove: ");

        for (int i = 0; i < size; i++) {
            if (myArray[i].equals(removeE)) {
                for (int j = i; j < size - 1; j++) {
                    myArray[j] = myArray[j + 1];
                }
                myArray[size - 1] = null;
                size--;
                i--;
            }
        }
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("]");
    }
    public void removeByElement() {
        System.out.println(Arrays.toString(myArray));
        int elementToRemove = Input.inputInt("Choose element to remove: ");
        for (int i = 0; i < size; i++) {
            if (myArray[i].equals(elementToRemove)) {
                for (int j = i; j < size - 1; j++) {
                    myArray[j] = myArray[j + 1];
                }
                size--;
                break;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(myArray, size)));
    }

    public DynamicArr(int capacity) {
        this.myArray = new Integer[capacity];
        this.size = 0;
    }

    public boolean add(Integer value) {
        if (size == myArray.length) {
            grow();
        }
        myArray[size++] = value;
        return true;
    }

    private void grow() {
        int newArrLength = (myArray.length + myArray.length) / 2 + 1;
        myArray = Arrays.copyOf(myArray, newArrLength);
    }

    public Integer get(int index) {
        return myArray[index];
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(myArray, size));
    }
}