package com.ex.toystore.Model;

//        1) Напишите класс-конструктор у которого принимает минимум 3 строки,
//        содержащие три поля id игрушки, текстовое название и частоту выпадения
//        игрушки
//        2) Из принятой строки id и частоты выпадения(веса) заполнить минимум три
//        массива.
//        3) Используя API коллекцию: java.util.PriorityQueue добавить элементы в
//        коллекцию
//        4) Организовать общую очередь 5) Вызвать Get 10 раз и записать результат в
//        файл


import java.util.PriorityQueue;

public class ToyList {
    private PriorityQueue<Toy> toyList;

    public ToyList() {
        this.toyList = new PriorityQueue<>();
    }

    /**
     * @param toy "Игрушка"
     * @throws NullPointerException "Переданная игрушка null"
     */
    public void addToyToList(Toy toy) throws NullPointerException {
        if (toy == null)
            throw new NullPointerException("Переданное значения является null");
        this.toyList.add(toy);
    }

    /**
     * @return "Очередь игрушек"
     */
    public PriorityQueue<Toy> getToyList() {
        return toyList;
    }

    /**
     * Метод вытягивает игрушку из очереди, согласно заданному шансу. Изменяет шанс, уменьшает
     * кол-во оставшихся игрушек и возвращает игрушку
     * @return "Игрушка"
     * @throws NullPointerException "В списке больше нет игрушек"
     */
    public Toy getToyInList() throws NullPointerException {
        if (this.toyList.peek() == null) {
            throw new NullPointerException("Список пустой");
        }
        Toy toy = this.toyList.poll();
        Integer amount = toy.getToyAmount();
        Integer chance = toy.getToyChance();
        if (amount == 1) {
            toy.setToyAmount(0);
            if (this.toyList.peek() == null){
                //Ничего не меняем. "Оптимизация"
            }else if (chance < 10) {
                toy.setToyChance(chance + 1);
            } else {
                toy.setToyChance(chance - 5);
            }
            return toy;
        } else {
            toy.setToyAmount(amount - 1);
            if (this.toyList.peek() == null){
                //Ничего не меняем. "Оптимизация"
            } else if (chance < 10) {
                toy.setToyChance(chance + 1);
            } else {
                toy.setToyChance(chance - 5);
            }
            this.toyList.add(toy);
            return toy;

        }
    }

}

