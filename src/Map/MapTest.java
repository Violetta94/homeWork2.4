package Map;

import java.util.*;


public class MapTest {

    private static final Map<String, Integer> strMap = new HashMap<>();

    public static void main(String[] args) {

        test1();
        test2();
        test3();

    }

    private static void test1() {
        addNumberToMap("s",1);
        addNumberToMap("s2",1);
        addNumberToMap("s2",4);
        addNumberToMap("s3",5);
        addNumberToMap("s4",2);

        for (Map.Entry<String,Integer> stringIntegerEntry: strMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey()+ " : " + stringIntegerEntry.getValue());
        }
    }

    private static void test2() {
        Map<String, List<Integer>> listMap = new HashMap<>();

        listMap.put("str1", List.of(15,13,17));
        listMap.put("str2", List.of(150,103,170));
        listMap.put("str3", List.of(150,320,210));
        listMap.put("str4", List.of(740,130,170));
        listMap.put("str5", List.of(159,190,107));

        Map<String, Integer> listMap1 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> stringListEntry: listMap.entrySet()) {
           listMap1.put(stringListEntry.getKey(), sumElements(stringListEntry.getValue()));
        }
        for (Map.Entry<String,Integer> stringIntegerEntry: listMap1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey()+ " : " + stringIntegerEntry.getValue());
        }
    }

    public static void test3() {
        Map<Integer, String> someNumbers = new LinkedHashMap<>();
        someNumbers.put(1,"one");
        someNumbers.put(2,"two");
        someNumbers.put(3,"three");
        someNumbers.put(4,"four");
        someNumbers.put(5,"five");
        someNumbers.put(6,"six");
        someNumbers.put(7,"seven");
        someNumbers.put(8,"eight");
        someNumbers.put(9,"nine");
        someNumbers.put(10,"ten");

        for (Map.Entry<Integer,String> integerStringEntry: someNumbers.entrySet()) {
            System.out.println(integerStringEntry.getKey()+ " : " + integerStringEntry.getValue());
        }
    }

    private static Integer sumElements(List<Integer> list) {
        Integer sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;
    }

    private static void addNumberToMap(String str, Integer i) {
        if (strMap.containsKey(str) && strMap.containsValue(i)) {
            throw new RuntimeException(strMap + "ключ есть и значения совпадают") ;
        }
        strMap.put(str,i);
    }


}
