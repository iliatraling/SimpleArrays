package Ex4;
//Напишите программу, которая сортирует массив символьных
// строкв лексикографическом  порядке  по  убыванию  и  по
// возрастанию. Продемонстрируйте ее работу.
import java.util.Arrays;
import java.util.Collections;

public class ArrayStringSort {
    public static void main(String[] args) {
        String[] Arr = {"addldsx", "asx", "bdf", "jfg", "zxc", "abab", "ab", "md", "axax", "axaxaxz", "qw", "as", "gh", "lk", "ababab", "a"};
        System.out.println(Arrays.toString(Arr));
        Arrays.sort(Arr);
        System.out.println(Arrays.toString(Arr));
        Arrays.sort(Arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(Arr));
    }
}
