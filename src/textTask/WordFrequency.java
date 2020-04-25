package textTask;

import java.util.*;

// TODO  3. написать метод, который выводит в консоль топ 10 самых частых слов

public class WordFrequency {

    // метод, который возвращает то, сколько раз слово встречается в тексте
    public static HashMap<String, Integer> countWord(String text) {
        HashMap<String, Integer> countWord = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (!countWord.containsKey(word)) {
                countWord.put(word, 0);
            }
            countWord.put(word, countWord.get(word) + 1);
        }
        return countWord;
    }

    // метод, который сортирует мапу в порядке убывания
    public static HashMap<String, Integer> sort(String text) {
        HashMap<String, Integer> countMap = countWord(text);
        ArrayList<Map.Entry<String, Integer>> arr = new ArrayList<>();
        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> e : countMap.entrySet()) {
            arr.add(e);
        }

        Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                Integer v1 = e1.getValue();
                Integer v2 = e2.getValue();
                return v2.compareTo(v1);
            }
        };

        Collections.sort(arr, valueComparator);

        for(Map.Entry<String, Integer> e: arr) {
            linkedMap.put(e.getKey(), e.getValue());
        }
        return linkedMap;
    }

    // метод, который выводит 10 слов, которые чаще всего встречаются в тексте
    public static List<String> maxCount (String text, Integer count){
        ArrayList<String> maxCount = new ArrayList<>();
        HashMap<String, Integer> sortMap = sort(text);
        for(Map.Entry<String, Integer> e : sortMap.entrySet()){
            maxCount.add(e.getKey());
        }
        List<String> maxCount1 = maxCount.subList(0, count);
        return maxCount1;
    }

    public static void main(String[] args) {
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
        //Сколько раз слово встречается в тексте
        System.out.println(countWord(text));
        // отсортировали мапу в порядке убывания
        System.out.println(sort(text));
        // первые 10 слов которые чаще всего встречаются в тексте
        System.out.println(maxCount(text, 10));
    }
}
