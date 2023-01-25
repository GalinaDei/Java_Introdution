/*Урок 2.
1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
Используем метод StringBuilder.append().
5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.*/

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random rnd = new Random();                // Создаю две строки разного размера случайным образом
        String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
        StringBuilder builder1 = new StringBuilder();
        for (int i = 0; i < rnd.nextInt(10, 100); i++) {
            builder1.append(alpha.charAt(rnd.nextInt(alpha.length())));
            }

        StringBuilder builder2 = new StringBuilder();
        for (int i = 0; i < rnd.nextInt(5, 10); i++) {
            builder2.append(alpha.charAt(rnd.nextInt(alpha.length())));
            }

        int s = rnd.nextInt(builder1.length() - 5);         // Заменяю в одной строке часть символов на вторую строку
        builder1.replace(s, s + 5, builder2.toString());      // чтобы получить две строки, одна из которых находится в другой
        String str1 = builder1.toString();
        System.out.println(str1);
        String str2 = builder2.toString();
        System.out.println(str2);
        System.out.println(str1.equals(str2));                     // сравниваю две строки на идентичность
        System.out.println(str1.indexOf(str2));                    // Нахождение индекса первого вхождения подстроки в строку
        String str3 = builder2.reverse().toString();               // Разворот одной из строк (меньшей) в другую сторону
        System.out.println(str3);

        StringBuilder builder = new StringBuilder();
        builder.append(3).append("+").append(56).append("=").
                append(3+56).append(" ").append(3).append("*").append(56).append("=").append(3*56);

        System.out.println(builder);                               // Заменяю "=" на "равно"
        builder.insert(builder.toString().indexOf("=")+1, " равно ");
        builder.deleteCharAt(builder.toString().indexOf("="));
        builder.insert(builder.toString().indexOf("=")+1, " равно ");
        builder.deleteCharAt(builder.toString().indexOf("="));
        System.out.println(builder);                              // Вывожу на печать данные в соответствии с заданием 4

        System.out.println(builder.toString().replace(" равно ", "="));
                                                                  // Обратная замена

        String str = "";                                          // Создаю строку на 10000 знаков
        for (int i = 0; i < 10000; i ++) {
            str += "=";
        }
        Long begin1 = System.currentTimeMillis();
        str.replace("=", "равно");             // Заменяю в строке знаки "=" на другие и измеряю время
        Long end1 = System.currentTimeMillis();                   // работы
        System.out.println(end1 - begin1);

        StringBuilder newBuilder = new StringBuilder();               // Создаю объект стрингбилдер на 10000 знаков
        for (int i = 0; i < 10000; i++) {
            newBuilder.append("=");
        }
        Long begin2 = System.currentTimeMillis();
        newBuilder.replace(0,newBuilder.length(), "равно");   // Заменяю в строке знаки "=" на другие и измеряю время
        Long end2 = System.currentTimeMillis();                        // работы

        System.out.println(end2 - begin2);

        System.out.println("Разница = " + ((end1 - begin1) - (end2 - begin2)));

        }
    }


