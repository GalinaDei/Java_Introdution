//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//Не совсем понятно, что принимать за i. Пусть это будет 0.
import java.util.*;

public class Task_3 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < Short.MAX_VALUE + 1; i++) {
            if (i % n==0) numList.add(i);
        }
        int [] arr = new int [numList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numList.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}

