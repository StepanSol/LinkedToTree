import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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