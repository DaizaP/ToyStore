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
    private PriorityQueue<Toy> toyList;

    public ToyList() {
        this.toyList = new PriorityQueue<>();
    }

    public void addToyToList(Toy toy) throws NullPointerException {
        if (toy == null)
            throw new NullPointerException("Переданное значения является null");
        this.toyList.add(toy);
    }

    public Queue<Toy> getToyList() {
        return toyList;
    }

    public Toy getToyInList() throws NullPointerException {
        if (this.toyList.peek() == null) {
            throw new NullPointerException("Список пустой");
        }
        Integer amount = this.toyList.peek().getToyAmount();
        if (amount == 1) {
            this.toyList.peek().setToyAmount(0);
            return this.toyList.poll();
        } else {
            this.toyList.peek().setToyAmount(amount - 1);
            return this.toyList.peek();
        }
    }

}

