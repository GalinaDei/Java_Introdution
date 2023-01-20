/*1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

 */
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int i = rnd.nextInt(2000);
        System.out.println(i);
    }
}
