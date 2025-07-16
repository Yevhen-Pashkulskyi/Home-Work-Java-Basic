package org.example.oop.list;

public class MyArrayList implements MyList {
    private static final int INITIAL_CAPACITY = 16;

    private String[] array;
    private int size = 0;

    public MyArrayList() {
        this.array = new String[INITIAL_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    // todo нужно сделать
    @Override
    public boolean isEmpty() {
        return size == 0;
    }// сделал

    // todo нужно сделать
    @Override
    public void addFirst(String value) {
        String[] temp = new String[size];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        resize();
        array[0] = value;
        for (int i = 1; i <= size; i++) {
            array[i] = temp[i - 1];
        }
        size++;
    }// сделал

    @Override
    public void addLast(String value) {
        resize();
        array[size] = value;
        size++;
    }


    @Override
    public void add(int index, String value) {
        if (index == size) {
            addLast(value);
        } else if (index == 0) {
            addFirst(value);
        } else {
            validateForAdd(index);
            resize();
            for (int i = size - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }
            array[index] = value;
            size++;
        }
    }

    @Override
    public String get(int index) {
        validate(index);
        return array[index];
    }

    @Override
    public void set(int index, String value) {
        validate(index);
        array[index] = value;
        // змінити значення елемента з індеком index
    }// сделал


    private void validate(int index) {
        if (isEmpty()) {
            throw new MyListException("Wrong index. List is empty");
        }
        if (index < 0 || index >= size) {
            throw new MyListException("Wrong index. Index must be from 0 to " + (size - 1));
        }
    }

    private void validateForAdd(int index) {
        if (index < 0 || index > size) {
            throw new MyListException("Wrong index. Index must be from 0 to " + size);
        }
    }

    // todo нужно сделать
    @Override
    public String remove(int index) {
        validate(index);
        String value = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return value;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                result += ", ";
            }
            result += array[i];
        }
        result += "]";
        return result;
    }

    private void resize() {
        if (size < array.length) {
            return;
        }
        String[] newArray = new String[2 * array.length];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }
}
