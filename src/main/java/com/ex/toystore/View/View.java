package com.ex.toystore.View;
import java.util.Arrays;

public class View{

    public void printRes(String str){
        System.out.printf("""
                \n===========================
                Вы выиграли игрушку: %s
                ===========================\n""", str);
    }
    public void printErr(Exception e){
        System.out.printf(
        "\n==============\n" + Arrays.toString(e.getStackTrace()) + "\n" + e.getMessage() + "\n==============\n");
    }
}

