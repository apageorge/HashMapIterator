import java.util.Comparator;
import java.util.Map;

public class SortByValue implements Comparator<String> {
    Map<String,Integer> map;

    public SortByValue(Map<String, Integer> map) {
        this.map = map;
    }

    /**
     *
     * @param o1 the key of the first pair to be compared.
     * @param o2 the key of the second pair to be compared.
     * uses the default compareTo method to compare between the values associated with each key
     * @return
     */
    @Override
    public int compare(String o1, String o2) {
        return map.get(o1).compareTo(map.get(o2));
    }


}
