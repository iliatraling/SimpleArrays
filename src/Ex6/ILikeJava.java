package Ex6;
// Все строки являются объектами типа String. Покажите, как
// вызываются методы length()и charAt()для строкового литерала "Мне нравится Java".
public class ILikeJava {
    public static void main(String[] args) {
        String str =  "Мне нравится Java";
        System.out.println("Lenght is: " + str.length());
        System.out.println(str.charAt(10));
    }
}
