package com.ex.toystore.View;
import java.util.Arrays;

public class View{

    /**
     * @param str Ответ для вывода в консоль
     */
    public void printRes(String str){
        System.out.printf("""
                \n===========================
                Вы выиграли игрушку: %s
                ===========================\n""", str);
    }

    /**
     * Выводит текст ошибки и место, где ошибка была вызвана
     * @param e Ошибка
     */
    public void printErr(Exception e){
        System.out.printf(
        "\n==============\n" + Arrays.toString(e.getStackTrace()) + "\n" + e.getMessage() + "\n==============\n");
    }
}

