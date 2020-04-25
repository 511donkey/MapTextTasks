package mapTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        // TODO:: написать статический метод, который приннимает на вход мапу (firstTaskMap) и город (city)
        //  и формирует список (List) логинов, которые соответствуют переданному городу

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";

        System.out.println(search(firstTaskMap, city));




        // TODO:: дан список слов (words). Написать метод, который будет возвращать количество одинаковых слов с списке
        //  в виде Map<String, Integer>, где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        System.out.println(repeat(words));






        // TODO:: дана мапа (customerMap).
        //  Написать метод, который принимает на вход агрументы int from и int to и возвращает новую мапу,
        //  в которую войдут все покупатели, возраст которых находится в диапазоне [from, to)

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));

        System.out.println(agesearch(customerMap, 1, 67));
    }


    // статический метод, который приннимает на вход мапу (firstTaskMap) и город (city)
    //  и формирует список (List) логинов, которые соответствуют переданному городу
    public static List search(HashMap<String, String> firstTaskMap, String city){
        List<String> users = new ArrayList<>();
        for (Map.Entry<String, String> user : firstTaskMap.entrySet())
            if(user.getValue().equals(city)) users.add(user.getKey());
        return users;
    }


    // метод, который будет возвращать количество одинаковых слов с списке
    //  в виде Map<String, Integer>, где String - слово и Integer - количество повторений
    public static Map<String, Integer> repeat (List<String> stringList) {
        HashMap<String, Integer> stringIntegerMap = new HashMap<>();
        for(String s :stringList){
            if(stringIntegerMap.containsKey(s)){
                stringIntegerMap.put(s, stringIntegerMap.get(s) + 1);
            } else {
                stringIntegerMap.put(s, 1);
            }
        }
        return stringIntegerMap;
    }


    // метод, который принимает на вход агрументы int from и int to и возвращает новую мапу,
    //  в которую войдут все покупатели, возраст которых находится в диапазоне [from, to)
    public static HashMap <String, Customer> agesearch (HashMap<String, Customer> customerHashMap ,int from, int to){
        HashMap<String, Customer> ageMap = new HashMap<>();
        for (Map.Entry<String, Customer> customerEntry : customerHashMap.entrySet()){
            if(customerEntry.getValue().getAge() >= from
                    && customerEntry.getValue().getAge() < to){
                ageMap.put(customerEntry.getKey(), customerEntry.getValue());
            }
        }
        return ageMap;
    }
}
