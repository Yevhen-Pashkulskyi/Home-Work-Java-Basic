package org.example.oop.list.impl;

import org.example.oop.list.MyList;
import org.example.oop.list.MyListException;

public class MyLinkedList implements MyList {

    private Entry head;
    private int size;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        // зробити самостійно
        return size == 0;
    }

    @Override
    public void addFirst(String value) {
        Entry entry = new Entry(value);
        entry.next = head;
        head = entry;
        size++;
    }

    @Override
    public void addLast(String value) {
        if (head == null) {
            addFirst(value);
            return;
        }

        Entry current = head;
        while (current.next != null) {
            current = current.next;
        }
        Entry entry = new Entry(value);
        current.next = entry;
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

            Entry previous = null;
            Entry current = head;
            for (int i = 1; i <= index; i++) {
                previous = current;
                current = current.next;
            }

            Entry entry = new Entry(value);
            previous.next = entry;
            entry.next = current;

            size++;
        }
    }

    @Override
    public String get(int index) {
        validate(index);
        Entry current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public void set(int index, String value) {
        validate(index);
        Entry current = head;
        for (int i = 1; i <= index; i++) {
            current = current.next;
        }
        current.value = value;
        // зробити самостійно
    }

    @Override
    public String remove(int index) {
        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            validate(index);
            Entry previous = null;
            Entry current = head;
            for (int i = 1; i <= index; i++) {
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
            current.next = null;
            size--;
            return current.value;
            // зробити самостійно
        }
    }

    private String removeFirst() {
        validate(0);
        Entry tmp = head;
        head = head.next;
        tmp.next = null;
        size--;

        return tmp.value;
    }

    private String removeLast() {
        validate(size - 1);
        if (size == 1) {
            return removeFirst();
        }
        Entry previous = null;
        Entry current = head;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
        size--;

        return current.value;
    }

    @Override
    public String toString() {
        String result = "[";

        for (Entry current = head; current != null; current = current.next) {
            if (current != head) {
                result += ", ";
            }
            result += current.value;
        }
        result += "]";
        return result;
    }

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

    private static class Entry {
        private String value;
        private Entry next;


        Entry(String value) {
            this.value = value;
        }

        Entry(String value, Entry next) {
            this.value = value;
            this.next = next;
        }
    }

}
