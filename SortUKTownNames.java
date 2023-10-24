import java.util.*;

public class SortUKTownNames {
    public static void main(String[] args) {
        /**
         * Adding towns to the map
         */
        Map<String,Integer> townMap = new HashMap<>();
        townMap.put("London",10);
        townMap.put("Manchester",7);
        townMap.put("Birmingham",8);
        townMap.put("Glasgow",5);
        townMap.put("Liverpool",6);
        /*List<Map.Entry<String,Integer>> townMapArray = new ArrayList<Map.Entry<String,Integer>>();
        townMapArray.addAll(townMap.entrySet());
        townMapArray.sort(Map.Entry.comparingByKey());*/
        /**
         * Creating a treemap to hold the sorted map. A custom comparator was created to sort by the value
         * fields instead of the keys
         */
        TreeMap<String, Integer> sortedTownMap = new TreeMap<String, Integer>(new SortByValue(townMap));
        sortedTownMap.putAll(townMap);
        /**
         * An iterator to traverse the sorted map containing the town details
         */
        Iterator<Map.Entry<String,Integer>>townMapIterator = sortedTownMap.entrySet().iterator();
        while(townMapIterator.hasNext()){
            System.out.println(townMapIterator.next());
        }


    }
}
