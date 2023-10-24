import java.util.Comparator;
import java.util.Map;

public class SortByValue implements Comparator<String> {
    Map<String,Integer> map;

    public SortByValue(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(String o1, String o2) {
        return map.get(o1).compareTo(map.get(o2));
    }


}
