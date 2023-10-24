import java.util.*;

public class SortUKTownNames {
    public static void main(String[] args) {
        Map<String,Integer> townMap = new HashMap<>();
        townMap.put("London",10);
        townMap.put("Manchester",7);
        townMap.put("Birmingham",8);
        townMap.put("Glasgow",5);
        townMap.put("Liverpool",6);
        /*List<Map.Entry<String,Integer>> townMapArray = new ArrayList<Map.Entry<String,Integer>>();
        townMapArray.addAll(townMap.entrySet());
        townMapArray.sort(Map.Entry.comparingByKey());*/
        TreeMap<String, Integer> sortedTownMap = new TreeMap<String, Integer>(new SortByValue(townMap));
        sortedTownMap.putAll(townMap);
        Iterator<Map.Entry<String,Integer>>townMapIterator = sortedTownMap.entrySet().iterator();
        while(townMapIterator.hasNext()){
            System.out.println(townMapIterator.next());
        }


    }
}
