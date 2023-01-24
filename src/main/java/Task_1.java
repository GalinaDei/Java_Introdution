/*1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int i = rnd.nextInt(2000);
        System.out.println(i);
        String bynary = Integer.toBinaryString(i);
        System.out.println(bynary);
        int n = bynary.length();
        System.out.println(n);
        List<Integer> numList = new ArrayList<>();
        for (int j = i; j < Short.MAX_VALUE + 1; j++) {
            if (j % n==0) numList.add(j);
        }
        int [] m1 = new int [numList.size()];
        for (int j = 0; j < m1.length; j++) {
            m1[j] = numList.get(j);
        }
        System.out.println(Arrays.toString(m1));

        List<Integer> numList1 = new ArrayList<>();
        for (int j = Short.MIN_VALUE; j < i+1; j++) {
            if (j % n!=0) numList1.add(j);
        }
        int [] m2 = new int [numList1.size()];
        for (int j = 0; j < m2.length; j++) {
            m2[j] = numList1.get(j);
        }
        System.out.println(Arrays.toString(m2));
    }
}

