package Ex7;
//Перепишите  приведенную  ниже  последовательность
// операторов, воспользовавшись тернарным оператором.
public class TernaryOperator {
    public static void main(String[] args) {
        int x = 0, y, a = 0, b;
        if(x < 0) {
            y =10;
        } else {
            y = 20;
        }
        b = a > 0 ? 10  : 20;
        System.out.println(y + " " + b);
    }
}
