package com.ex.toystore.Presenter;

import com.ex.toystore.Model.Toy;
import com.ex.toystore.Model.ToyDraw;
import com.ex.toystore.View.View;

public class Presenter {
    ToyDraw toyDraw = new ToyDraw();
    View view = new View();
    private Integer id = 0;

    public Presenter() {}

    public void addToy(String toyName, Integer toyAmount, Integer toyChance){
        try {
            toyDraw.getToyList().addToyToList(new Toy(id += 1, toyName, toyAmount, toyChance));
        }catch (RuntimeException e){
            view.printErr(e);
        }
    }

    /**
     * "Розыгрыш" игрушки
     * @return "Игрушка"
     */
    public Toy draw(){
        Toy toy = null;
        try {
            toy = toyDraw.getToyList().getToyInList();
        }catch (RuntimeException e){
            view.printErr(e);
        }
        return toy;
    }

    /**
     * @param toy Игрушка
     */
    public void printResult(Toy toy){
        try{
            view.printRes("\nID: " + toy.getId() +
                          "\nИмя: " + toy.getToyName() +
                          "\nОсталось игрушек: " + toy.getToyAmount() +
                          "\nШанс: " + toy.getToyChance());
        }catch (RuntimeException e){
            view.printErr(e);
        }
    }
}
