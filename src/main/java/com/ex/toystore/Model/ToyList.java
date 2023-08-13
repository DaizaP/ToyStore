package com.ex.toystore.Model;

//1) Напишите класс-конструктор у которого принимает минимум 3 строки,
//        содержащие три поля id игрушки, текстовое название и частоту выпадения
//        игрушки
//        2) Из принятой строки id и частоты выпадения(веса) заполнить минимум три
//        массива.
//        3) Используя API коллекцию: java.util.PriorityQueue добавить элементы в
//        коллекцию
//        4) Организовать общую очередь 5) Вызвать Get 10 раз и записать результат в
//        файл


import java.util.PriorityQueue;
import java.util.Queue;

public class ToyList {
    private Queue<String[]> toy = new PriorityQueue<>();

    public ToyList() {
    }

    public void addToyList(String[] toy) throws NullPointerException {
        if (toy == null)
            throw new NullPointerException("Переданное значения является null");
        this.toy.add(toy);
    }

    public Queue<String[]> getToy() {
        return toy;
    }
}
