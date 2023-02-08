import java.util.HashMap;
public class Task_6 {
//  static MySet my_set = new MySet(); // экземпляр класса MySet
    public static void main(String[] args) {
        MySet my_set = new MySet();      //переносим сюда из поля класса Task_6 и убираем static
        my_set.add(1);                   //переписываем метод add на динамический объект my_set
        my_set.add(35);
        my_set.add(5);
        my_set.add(15);
        my_set.add(3);
        System.out.println(my_set);
        for (int i = 0; i < my_set.size(); i++){
            System.out.println(my_set.get(i));
        }
    }

}
class MySet {                                            //создаем приватный класс внутри публичного класса Task_6
    private HashMap<Integer, Object> map = new HashMap<>();  //Теперь в поле класса Task_6 в конструкторе можно создавать объекты класса MySet
    private final Object OBJ = new Object();              // а эти два объекта забираем из поля класса Task_6 сюда, убираем статик
    boolean add(int i) {                  // также переносим сюда, убираем статик
        return map.put(i, "") != null ? true : false;
    }
    public Integer size() {                            // создаем метод определения размера сета с ключами (кол-во элементов)
        return map.keySet().size();
    }
    public Integer get(Integer a){                    // создаем метод получения значений элементов
        return (Integer) (map.keySet().toArray())[a];
    }
    @Override
    public String toString(){
        return map.keySet().toString();
    }

}


//public class Task_6 {
//    static HashMap<Integer, Object> map = new HashMap<>();   //объявляем статический хешмеп через конструктор в поле класса Task_6
//    static final Object OBJ = new Object();             // объявляем статическую константу обджект.
//    //все, что объявлено static в поле класса, будет видно из статических методов
//
//    public static void main(String[] args) {
//        add(1);                                        //теперь в мапу можно добавлять объекты напрямую статическим методом,
//        add(35);                                         // который объявлен ниже
//        add(5);
//        add(15);
//        add(3);
//        System.out.println(map);
//
//    }
//
//    private static boolean add(int i) {                           //статический метод для добавления объектов в статическую мапу
//        return map.put(i, "") != null ? true : false;               //реализован через лямбду или тернарный оператор?
//    }
//}