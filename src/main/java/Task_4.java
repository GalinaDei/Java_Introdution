//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

import java.util.*;

public class Task_4 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i > Short.MIN_VALUE; i--) {
            if (i % n!=0) numList.add(i);
        }
        int [] arr = new int [numList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numList.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}


