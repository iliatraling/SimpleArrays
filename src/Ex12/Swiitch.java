package Ex12;
//Можно ли управлять оператором switchс помощью объектов типа
// String?Если да, то напишите пример такого использования.
import java.util.Scanner;

public class Swiitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            switch (sc.next()) {
                case ("a"):
                    System.out.println("Hello");
                    break;
                case ("ab"):
                    System.out.println("Hi");
                    break;
                case ("abc"):
                    System.out.println("Ola");
                    break;
                default:
                    System.out.println("Привет");
                    break;
            }
            i++;
        }
    }

}
