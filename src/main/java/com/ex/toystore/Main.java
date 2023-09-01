package com.ex.toystore;

import com.ex.toystore.Presenter.Presenter;

public class Main {
    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        presenter.addToy("Шарик", 5, 60);
        presenter.addToy("Робот", 3, 30);
        presenter.addToy("Пистолет с пистонами", 2, 10);

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
