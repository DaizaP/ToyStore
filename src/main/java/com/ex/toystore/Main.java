package com.ex.toystore;

import com.ex.toystore.Presenter.Presenter;

public class Main {
    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        presenter.addToy("Маленький робот", 10, 60);
        presenter.addToy("Робот побольше", 3, 60);
        presenter.addToy("Пистолет с пистонами", 2, 40);

        presenter.printResult(presenter.draw());
        presenter.printResult(presenter.draw());
        presenter.printResult(presenter.draw());
        presenter.printResult(presenter.draw());
        presenter.printResult(presenter.draw());
        presenter.printResult(presenter.draw());
        presenter.printResult(presenter.draw());
        presenter.printResult(presenter.draw());
        presenter.printResult(presenter.draw());
        presenter.printResult(presenter.draw());


    }
}
