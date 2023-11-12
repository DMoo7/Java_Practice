import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ElementsFrequency {

    public Map<Integer,Integer> countElementFrequency (int[] inputArr) {


        Map<Integer,Integer> countingMap = new HashMap<Integer,Integer>();

        for (int i = 0; i < inputArr.length; i++) {

            countingMap.put(inputArr[i],1);
            if (countingMap.containsKey(inputArr[i])) {
                int count = countingMap.get(inputArr[i]);
                count += 1;
                countingMap.put(inputArr[i], count);
            }

        }
        return countingMap;

    }



    public static void main (String[] args) {

        int[] arr = {10,10,20,20,30,30,30};

        ElementsFrequency inst1 = new ElementsFrequency();

        Map<Integer,Integer> result = inst1.countElementFrequency(arr);

        for (int j = 0; j < result.size(); j++) {
            Set<Integer> keys = result.keySet();
            Object[] arrKeys = keys.toArray();
            int count = result.get(arrKeys[j]);
            int max = 0;
            if (count > max) {
                max = count;
            }
            System.out.println(max);
        }
    }

}