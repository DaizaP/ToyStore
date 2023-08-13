package com.ex.toystore.View;
import java.util.Scanner;

public class View{
    private Scanner in = new Scanner(System.in);

    public String getValue(String title){
        System.out.print(title);
        return in.nextLine();
    }
    public void printConsole(String str){
        System.out.println(str);
    }
}
//    public void print(String[] data) throws RuntimeException {
//        try (FileWriter fw = new FileWriter(String.format("%s.txt", data[0].toLowerCase()), true)) {
//            fw.append(Arrays.toString(data)).append("\n");
//        } catch (IOException e) {
//            throw new RuntimeException(e.getMessage());
//        }
//    }
//    public String[] () throws RuntimeException {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите id грушки, шанс выпадения и её имя через пробел");
//        String[] toy = in.nextLine().split(" ");
//        if (!toy[0].matches(RegExValidNum)) {
//            throw new RuntimeException("Некорректный id");
//        }
//        if (!toy[1].matches(RegExValidNum)) {
//            throw new RuntimeException("Некорректный шанс");
//        }
//        if (!toy[2].matches(RegExValidName)) {
//            throw new RuntimeException("Некорректное имя");
//        }
//        return toy;
//    }
//}
