package org.example.oop.list.impl;

import org.example.oop.list.MyListException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyArrayListTest {
    private MyArrayList list;

    @BeforeEach
    void setUp() {
        list = new MyArrayList();
    }

    @Test
    void addLast() {
        // given
        int expectedSize = 3;
        String expectedString = "[value#1, value#2, value#3]";

        // when
        for (int i = 1; i <= expectedSize; i++) {
            list.addLast("value#" + i);
        }

        // then
        assertEquals(expectedSize, list.size());
        assertEquals(expectedString, list.toString());
    }

    @Test
    void addLastToManyValues() {
        // given
        int expectedSize = 20;
        fillList(expectedSize);

        // then
        assertEquals(expectedSize, list.size());
    }

    @Test
    void getWithWrongIndex() {
        // given
        fillList(3);
        String expectedError = "Wrong index. Index must be from 0 to 2";

        // when
        MyListException result = assertThrows(MyListException.class, () -> list.get(7));

        // then
        assertEquals(expectedError, result.getMessage());
    }

    @Test
    void getFromEmptyList() {
        // given
        String expectedError = "Wrong index. List is empty";

        // when
        MyListException result = assertThrows(MyListException.class, () -> list.get(4));

        // then
        assertEquals(expectedError, result.getMessage());
    }


    @Test
    void get() {
        // given
        fillList(20);
        String expected = "value#6";

        // when
        String result = list.get(5);

        // then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void setWithWrongIndexIntoEmptyList() {
        // given

        // when + then
        Assertions.assertThrows(MyListException.class, () -> list.set(5, "qwerty"));
    }

    @Test
    void setWithWrongIndex() {
        // given
        fillList(3);

        // when + then
        Assertions.assertThrows(MyListException.class, () -> list.set(5, "qwerty"));
    }

    @Test
    void setAfterLastElement() {
        // given
        fillList(3);

        // when + then
        Assertions.assertThrows(MyListException.class, () -> list.set(3, "qwerty"));
    }

    @Test
    void setLastElement() {
        // given
        fillList(3);
        String[] expected = {"value#1", "value#2", "qwerty"};

        // when
        list.set(2, "qwerty");

        // then
        Assertions.assertEquals(3, list.size());
        for (int i = 0; i < list.size(); i++) {
            assertEquals(expected[i], list.get(i));
        }
    }


    @Test
    void setFirstElement() {
        // given
        fillList(3);
        String[] expected = {"qwerty", "value#2", "value#3"};

        // when
        list.set(0, "qwerty");

        // then
        Assertions.assertEquals(3, list.size());
        for (int i = 0; i < list.size(); i++) {
            assertEquals(expected[i], list.get(i));
        }
    }

    @Test
    void set() {
        // given
        fillList(7);
        String[] expected = {"value#1", "value#2", "value#3", "value#4", "value#5", "qwerty", "value#7"};

        // when
        list.set(5, "qwerty");

        // then
        for (int i = 0; i < list.size(); i++) {
            assertEquals(expected[i], list.get(i));
        }
    }

    @Test
    void emptyList() {
        // given
        fillList(3);

        // when
        boolean result = list.isEmpty();

        // then
        Assertions.assertFalse(result);
    }

    @Test
    void notEmptyList() {
        // given

        // when

        // then
        Assertions.assertEquals(0, list.size());
        Assertions.assertEquals("[]", list.toString());
    }

    @Test
    void addFirst() { // додати реалізацію
        // given
        String expected = "value#1";
        // when
        list.addFirst(expected);
        String result = list.get(0);
        // then
        Assertions.assertEquals(expected, result);
    }// сделал

    @Test
    void addFirstToManyElements() { // додати реалізацію
        // given
        String value = "value#";
        String expected = "value#0";

        // when
        for (int i = 3; i >= 0; i--) {
            list.addFirst(value + i);
        }
        String result = list.get(0);

        // then
        Assertions.assertEquals(expected, result);
    }// сделал

    @Test
    void add() {
        // given
        fillList(7);
        String[] expected = {"value#1", "value#2", "qwerty", "value#3", "value#4", "value#5", "value#6", "value#7"};

        // when
        list.add(2, "qwerty");

        // then
        Assertions.assertEquals(8, list.size());
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], list.get(i));
        }
    }

    @Test
    void addToBegin() {
        // given
        fillList(5);
        String[] expected = {"qwerty", "value#1", "value#2", "value#3", "value#4", "value#5"};

        // when
        list.add(0, "qwerty");

        // then
        Assertions.assertEquals(6, list.size());
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], list.get(i));
        }
    }


    @Test
    void addToEnd() {
        // given
        fillList(5);
        String[] expected = {"value#1", "value#2", "value#3", "value#4", "value#5", "qwerty"};

        // when
        list.add(5, "qwerty");

        // then
        Assertions.assertEquals(6, list.size());
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], list.get(i));
        }
    }

    @Test
    void addManyElements() { // додати реалізацію
        // given
        String value = "value#";
        String expected = "value#1";
        // when
        for (int i = 0; i < 3; i++) {
            list.add(i, value + i);
        }
        String result = list.get(1);
        // then
        Assertions.assertEquals(expected, result);
    }//сделал

    @Test
    void addAfterLastElement() {
        // given
        fillList(20);
        String expectedError = "Wrong index. Index must be from 0 to 20";

        // when
        MyListException result = assertThrows(MyListException.class, () -> list.add(21, "qwerty"));

        // then
        assertEquals(expectedError, result.getMessage());
    }

    @Test
    void removeFromEnd() {
        // given
        fillList(5);
        String[] expected = {"value#1", "value#2", "value#3", "value#4"};

        // when
        String deletedElement = list.remove(4);

        // then
        Assertions.assertEquals("value#5", deletedElement);
        Assertions.assertEquals(4, list.size());
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], list.get(i));
        }
    }


    @Test
    void removeFromBegin() {
        // given
        fillList(5);
        String[] expected = {"value#2", "value#3", "value#4", "value#5"};

        // when
        String deletedElement = list.remove(0);

        // then
        Assertions.assertEquals("value#1", deletedElement);
        Assertions.assertEquals(4, list.size());
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], list.get(i));
        }
    }


    @Test
    void remove() { // додати реалізацію
        // given
        fillList(4);
        String[] expected = {"value#1", "value#2", "value#4"};
        // when
        String deleteElement = list.remove(2);
        // then
        Assertions.assertEquals("value#3", deleteElement);
        Assertions.assertEquals(3, list.size());
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], list.get(i));
        }
    }// сделал но с ошибкой проверки на на равность элементов

    private void fillList(int expectedSize) {
        for (int i = 1; i <= expectedSize; i++) {
            list.addLast("value#" + i);
        }
    }
}