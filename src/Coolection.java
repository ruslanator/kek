import java.util.ArrayList;
import java.util.List;

public class Coolection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(12);
        for (int i = 0; i < list.size(); i++) {
            list.add(i, null);
        }
        System.out.println(list.get(2));
    }
}
