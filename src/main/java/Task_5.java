/* 1.Создать словарь HashMap. Обобщение <Integer, String>.
   2.Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
   3.Изменить значения дописав восклицательные знаки.
   4.*Создать TreeMap, заполнить аналогично.
   5.*Увеличить количество элементов до 1000 случайными ключами и общей строкой.
   6.**Сравнить время последовательного и случайного перебора тысячи элементов словарей.*/

import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Task_5 {
    public static void main(String[] args) {
        HashMap<Integer, String> my_map = new HashMap<>();
        my_map.put(1, "Red");
        my_map.putIfAbsent(2, "Orange");
        my_map.put(3, "Yellow");
        System.out.println(my_map);
        Set<Integer> ks = my_map.keySet();
        System.out.println(ks);
        for (int i = 0; i < ks.size(); i++) {
            my_map.replace((int)ks.toArray()[i], my_map.get((int)ks.toArray()[i])+"!");
            System.out.println("" + ks.toArray()[i] + " " + my_map.get(ks.toArray()[i]));
            }
        System.out.println(my_map);
        TreeMap<Integer,String> my_treeMap = new TreeMap<>();
        my_treeMap.put(1, "Red");
        my_treeMap.putIfAbsent(2, "Orange");
        my_treeMap.put(3, "Yellow");
        System.out.println(my_treeMap);
        Random rnd = new Random();

        for (int i = 0; i < 998; i++) {
            my_map.putIfAbsent(rnd.nextInt(10000), "Color");
        }
        System.out.println(my_map);

        for (int i = 0; i < 998; i++) {
            my_treeMap.putIfAbsent(rnd.nextInt(10000), "Color");
        }
        System.out.println(my_treeMap);
        System.out.println();

        Long begin1 = System.currentTimeMillis();
        my_map.forEach((k, v) -> System.out.print(k+"="+v+"; "));
        Long end1 = System.currentTimeMillis();
        System.out.println();

        Long begin2 = System.currentTimeMillis();
        my_treeMap.forEach((k, v) -> System.out.print(k+"="+v+"; "));
        Long end2 = System.currentTimeMillis();

        System.out.println("\n"+(end1 - begin2));
        System.out.println(end2 - begin2);
    }
}
