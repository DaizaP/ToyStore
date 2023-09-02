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
public class Toy implements Comparable<Toy> {
    private final Integer id;
    private String ToyName;
    private Integer ToyAmount; //кол-во игрушек
    private Integer ToyChance;

    /**
     * @param id Идентификатор игрушки
     * @param toyName Имя игрушки
     * @param toyAmount Количество игрушек
     * @param toyChance Шанс выпадения игрушки
     * @throws NullPointerException Одно из значений null
     */
    public Toy(Integer id, String toyName, Integer toyAmount, Integer toyChance) throws NullPointerException {
        if (toyChance == null || id == null || toyName == null || toyAmount == null) {
            throw new NullPointerException("Одно из переданных значений в класс Toy == null");
        }
        this.id = id;
        this.ToyName = toyName;
        this.ToyAmount = toyAmount;
        this.ToyChance = toyChance;
    }

    /**
     * @return Шанс выпадения игрушки
     */
    public Integer getToyChance() {
        return ToyChance;
    }

    /**
     * @param toyChance Шанс выпадения игрушки
     * @throws NullPointerException Значение шанса null
     */
    protected void setToyChance(Integer toyChance) throws NullPointerException {
        if (toyChance == null) {
            throw new NullPointerException("Chance null");
        } else {
            ToyChance = toyChance;
        }
    }

    /**
     * @return Количество игрушек
     */
    public Integer getToyAmount() {
        return ToyAmount;
    }

    /**
     * @param toyAmount Количество игрушек
     * @throws NullPointerException Значение количества игрушек null
     */
    protected void setToyAmount(Integer toyAmount) throws NullPointerException{
        if (toyAmount == null) {
            throw new NullPointerException("Amount null");
        } else {
            ToyAmount = toyAmount;
        }
    }

    /**
     * @return Имя игрушки
     */
    public String getToyName() {
        return ToyName;
    }

    /**
     * @param toyName Имя игрушки
     * @throws NullPointerException Имя игрушки null
     */
    protected void setToyName(String toyName) throws NullPointerException {
        if (toyName == null) {
            throw new NullPointerException("Name null");
        } else {
            ToyName = toyName;
        }
    }

    /**
     * @return Идентификатор игрушки
     */
    public Integer getId() {
        return id;
    }

    @Override
    public int compareTo(Toy o) {
        return o.ToyChance - this.ToyChance;
    }
}
