package com.ex.toystore.View;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.util.Arrays;

public class View{

    /**
     * @param str Ответ для вывода в консоль
     */
    public void printRes(String str){
        try (FileWriter fileWriter = new FileWriter("res.txt", true)){
            fileWriter.write("\n===========================");
            fileWriter.write("\nВы выиграли игрушку: ");
            fileWriter.write(str);
            fileWriter.write("\n===========================");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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

