package com.ex.toystore.Model;

public interface ToyListChanceInterface {
    String RegExValidNum = "^[0-9]*$";
    String RegExValidName = "^[А-Яа-яЁёa-zA-Z][А-Яа-яЁёa-zA-Z0-9]{2,128}$";
    public void addToyList(String[] toy);
}
