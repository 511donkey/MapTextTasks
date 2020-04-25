package textTask;

import java.util.HashMap;
import java.util.Map;

// TODO  4. Вывести частоту встречаемости букв анг алфавита в данном тексте. Вывести в процентах для каждой буквы

public class CountChars {

    // метод, который возвращает то, сколько раз буква встречается в тексте
    public static HashMap<Character, Integer> countChars (String text){
        HashMap<Character, Integer> countChar = new HashMap<>();
        char[] chars = text.replaceAll("\\s+", "").replaceAll("-", "").toLowerCase().toCharArray();
        for (char ch: chars) {
            if(!countChar.containsKey(ch)){
                countChar.put(ch, 0);
            }
            countChar.put(ch, countChar.get(ch) + 1);
        }
        return countChar;
    }

    // метод, который возвращает в процентах частоту появления буквы в тексте
    public static HashMap<Character, Double> precentOfChars (String text){
        HashMap<Character, Double> precentChars = new HashMap<>();
        HashMap<Character, Integer> countChar = countChars(text);
        int allChars = 0;
        for(Map.Entry<Character,Integer> e : countChar.entrySet()){
            allChars = allChars + e.getValue();
        }
        System.out.println("всего букв в тексте: " + allChars);
        for (Map.Entry<Character, Integer> entry : countChar.entrySet()){
            precentChars.put(entry.getKey(), entry.getValue().doubleValue() * 100 / allChars);
        }
        return precentChars;
    }

    public static void main(String[] args) {
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";

        System.out.println(countChars(text));
        System.out.println(precentOfChars(text));
    }
}
