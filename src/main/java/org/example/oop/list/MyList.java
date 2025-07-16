package org.example.oop.list;

public interface MyList {
    int size();

    boolean isEmpty();

    void addFirst(String value);

    void addLast(String value);

    void add(int index, String value);

    String get(int index);

    void set(int index, String value);

    String remove(int index);

}
