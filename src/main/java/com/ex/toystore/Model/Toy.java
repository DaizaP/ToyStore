package com.ex.toystore.Model;

public class Toy implements Comparable<Toy> {
    private Integer id;
    private String ToyName;
    private Integer ToyAmount; //кол-во игрушек
    private Integer ToyChance;

    public Toy(Integer id, String toyName, Integer toyAmount, Integer toyChance) throws NullPointerException {
        if (toyChance == null || id == null || toyName == null || toyAmount == null) {
            throw new NullPointerException("Одно из переданных значений в класс Toy == null");
        }
        this.id = id;
        this.ToyName = toyName;
        this.ToyAmount = toyAmount;
        this.ToyChance = toyChance;
    }

    public Integer getToyChance() {
        return ToyChance;
    }

    public void setToyChance(Integer toyChance) throws NullPointerException {
        if (toyChance == null) {
            throw new NullPointerException("Chance null");
        } else {
            ToyChance = toyChance;
        }
    }

    public Integer getToyAmount() {
        return ToyAmount;
    }

    public void setToyAmount(Integer toyAmount) throws NullPointerException {
        if (toyAmount == null) {
            throw new NullPointerException("Amount null");
        } else {
            ToyAmount = toyAmount;
        }
    }

    public String getToyName() {
        return ToyName;
    }

    public void setToyName(String toyName) throws NullPointerException {
        if (toyName == null) {
            throw new NullPointerException("Name null");
        } else {
            ToyName = toyName;
        }
    }

    public Integer getId() {
        return id;
    }

    @Override
    public int compareTo(Toy o) {
        return o.ToyChance - this.ToyChance;
    }
}
