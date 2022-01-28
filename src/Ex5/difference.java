package Ex5;

import java.util.Arrays;
// В чем состоит разница между методами indexOf()и lastIndexOf()класса String?
// Ответ: первый массив возвращает индекс первой встречающейся строчки из главной строки, а lastIndexOf() - индекс начала последней строчки
public class difference {
    public static void main(String[] args) {
        String str = "acdbndaac";
        int ind = str.indexOf("ac");
        System.out.println("Index is: " + ind);
        ind = str.lastIndexOf("ac");
        System.out.println("Index is: " + ind);
    }
}
