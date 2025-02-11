import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    При создании HashMap с конструктором по умолчанию(без указания initialCapacity), перестройка
    в дерево происходит после добавления одиннадцатой пары ключ-значение. Это происходит из-за того,
    что внутренний ассоциативный массив 2 раза увеличивается(размер по умолчанию - 16), прежде чем
    начнётся трификация.
 */
public class Main {
    public static void main(String[] args){

        Map<ClassForMap, Integer> map = new HashMap<>(64);
        List<String> classes = new ArrayList<>();



        for (int i = 1; i < 10; i++) {
            map.put(new ClassForMap(i), i);
            for (Map.Entry entry : map.entrySet()) {
                classes.add(String.valueOf(entry.getClass()));
            }
            System.out.println("Количество элементов в одном бакете: " + i
                    + "; Класс Ноды последних добавленных элементов: " + classes.getLast());
        }
    }
}