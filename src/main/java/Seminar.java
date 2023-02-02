/*1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам
и вывести в консоль в формате "Иванов И.И. 32 М"
3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках.
4.Отсортировать по возрасту используя дополнительный список индексов.*/

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Seminar {
    public static void main(String[] args) throws IOException {

//        String text = "Царьков Илья Михайлович 24 мужской";                     // чтобы в файле было побольше строк, несколько раз запускала программу, меняя текст
//        String text2 = "Иванова Дарья Ивановна 15 женский";
//        String str = "";
//        try (FileWriter fileWriter = new FileWriter("db.sql", true)) {   //запись файла
//            fileWriter.write(text);
//            fileWriter.append('\n').append(text2).append('\n');
//            fileWriter.flush();
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        String fileText = "";
        try (FileReader reader = new FileReader("db.sql"))    //чтение файла
        {
            while (reader.ready()) {
                fileText += (char) reader.read();
            }
            System.out.println(fileText);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(fileText);
        String[] arr = fileText.split("\n");
        System.out.println(Arrays.toString(arr));

        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> middlname = new ArrayList<>();
        ArrayList<String> age = new ArrayList<>();
        ArrayList<String> sex = new ArrayList<>();
        ArrayList<Integer> ageInt = new ArrayList<>();

        String[] tempString;
        for (String s : arr) {
            tempString = s.split(" ");
            surname.add(tempString[0]);                                  // Фамилии, имена, отчества, возрас и пол в отдельных списках.
            name.add(tempString[1]);
            middlname.add(tempString[2]);
            ageInt.add(Integer.parseInt(tempString[3]));                 // печать в формате "Иванов И.И. 32 М
            sex.add(tempString[4]);
            System.out.println(tempString[0] + " " + tempString[1].charAt(0) + "." + tempString[2].charAt(0) + ". "
                    + tempString[3] + " " + tempString[4].toUpperCase().charAt(0));
        }
        System.out.println(surname);                                   // вывод на печать списков
        System.out.println(name);
        System.out.println(middlname);
        System.out.println(ageInt);
        System.out.println(sex);

        DataSort(ageInt);                                      // получаем список id в порядке взрастания возрастов
        System.out.println(ageInt);                            // проверяем, что исходный список возрастов остался без изменений
    }
    public static void DataSort(ArrayList <Integer> list) {                     // метод сортировки id для списков Integer, можно сделать универсальным
        ArrayList<Integer> sort_id = new ArrayList<>(list.size());
        ArrayList<Integer> copy_ageInt = (ArrayList<Integer>) list.clone();
        Collections.sort(copy_ageInt);

        for (int i = 0; i < list.size(); i++) {
            sort_id.add(list.indexOf(copy_ageInt.get(i)));
        }
        System.out.println(sort_id);
    }

}









