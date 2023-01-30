/*1.оздать новый список, добавить несколько строк и вывести коллекцию на экран.
  2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.
  3.Вставить элемент в список в первой позиции.
  4.Извлечь элемент (по указанному индексу) из заданного списка.
  5.Обновить определенный элемент списка по заданному индексу.
  6.Удалить третий элемент из списка.
  7.Поиск элемента в списке по строке.
  8.Создать новый список и добавить в него несколько елементов первого списка.
  9.Удалить из первого списка все элементы отсутствующие во втором списке.
  10.*Сортировка списка.*/

import java.util.*;

public class Task_3 {

    public static void main(String[] args) {

        ArrayList<String> rainbow = new ArrayList<>(); // новый список
        rainbow.add("red");                            // заполняем список цветами радуги
        rainbow.add("orange");
        rainbow.add("yellow");
        rainbow.add("green");
        rainbow.add("blue");
        rainbow.add("violet");
        ArrayList<String> rainbow1 = new ArrayList<>();  // новый список
        for (int i = 0; i < rainbow.size(); i++) {       // печать исходного списка
            System.out.print(rainbow.get(i)+", ");       // итерация, добавление к каждому элементу "!" и  запись в новый список
            rainbow1.add(rainbow.get(i).concat("!"));
            }
        System.out.println();
        for (int j = 0; j < rainbow1.size(); j++) {            // печать нового списка
            System.out.print(rainbow1.get(j)+", ");
        }

        System.out.println();
        rainbow1.add(0, "black");               // добавляю в начало списока элемент (по индексу 0)
        for(String str: rainbow1){                           // вывод на печать
            System.out.print(str + ", ");
        }
        System.out.println();
        rainbow1.set(0, "white");               // заменяю  элемент (по указанному индексу 0)
        for(String str: rainbow1){                           // вывод на печать
            System.out.print(str + ", ");
        }
        System.out.println();
        rainbow1.remove(0);                           // удаляю  элемент (по указанному индексу 0)
        for(String str: rainbow1){                           // вывод на печать
            System.out.print(str + ", ");
        }
        System.out.println();
        rainbow1.remove(2);                           // удаляю  элемент (по указанному индексу 0)
        for(String str: rainbow1){                           // вывод на печать
            System.out.print(str + ", ");
        }
        System.out.println();
        System.out.print(rainbow1.indexOf("blue!")+", "+rainbow.indexOf("black"));
                                                        // поиск индекса указанного элемента в списке
        System.out.println();
        ArrayList<String> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < rnd.nextInt(1,rainbow.size()-1); i++) {
            list.add(rainbow.get(rnd.nextInt(1, rainbow.size())));        // добавляю в новый список случайным образом выбранное случайное количество элементов из исходного списка
            }
        for(String str: list){                           // вывод на печать
            System.out.print(str + ", ");
        }
        System.out.println();
        rainbow.removeAll(list);                            // удаление из исходного списка (самый первый) элементов второго (рандомного)

        for(String str: rainbow){                           // вывод на печать
            System.out.print(str + ", ");
        }
        System.out.println();

        Collections.sort(rainbow1);                         // сортировка списка
        for(String str: rainbow1){                           // вывод на печать
            System.out.print(str + ", ");
        }
        System.out.println();

    }

}

