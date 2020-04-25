package textTask;

// TODO:: Задания по тексту (text). На каждый пункт - минимум один метод:
        //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
        //  2. написать метод, который собирает все слова в группы по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]


import java.lang.reflect.Array;
import java.util.*;

public class TextTasks {
    public static void main(String[] args) {

        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like"; // !!! в тексте содержатся только буквы и пробельные символы !!!
        // сколько раз слово встречается в тексте
        System.out.println(searchWord(text, "a"));
        // слова поделены по количеству букв в них
        System.out.println(searchLenght(text));

    }

   // метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
    public static HashMap<String, Integer> searchWord(String text, String word) {
        String[] words = text.split("\\s+");
        HashMap<String, Integer> wordCount = new HashMap<>();
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        wordCount.put(word, count);
        return wordCount;
    }

    // метод, который собирает все слова в группы по количеству букв:
    public static HashMap<Integer, ArrayList<String>> searchLenght(String text) {
        ArrayList<String> word1 = new ArrayList<>();
        ArrayList<String> word2 = new ArrayList<>();
        ArrayList<String> word3 = new ArrayList<>();
        ArrayList<String> word4 = new ArrayList<>();
        ArrayList<String> word5 = new ArrayList<>();
        ArrayList<String> word6 = new ArrayList<>();
        ArrayList<String> word7 = new ArrayList<>();
        ArrayList<String> word8 = new ArrayList<>();
        ArrayList<String> word9 = new ArrayList<>();
        ArrayList<String> word10 = new ArrayList<>();
        ArrayList<String> word11 = new ArrayList<>();
        ArrayList<String> word12 = new ArrayList<>();
        ArrayList<String> word13 = new ArrayList<>();
        ArrayList<String> word14 = new ArrayList<>();
        ArrayList<String> word15 = new ArrayList<>();
        HashMap<Integer, ArrayList<String>> lenghtWord = new HashMap<>();
        String[] words = text.split("\\s+");
        int length = 0;
        for (String word : words) {
            if (word.length() == 1) {
                word1.add(word);
            }
            if (word.length() == 2) {
                word2.add(word);
            }
            if (word.length() == 3) {
                word3.add(word);
            }
            if (word.length() == 4) {
                word4.add(word);
            }
            if (word.length() == 5) {
                word5.add(word);
            }
            if (word.length() == 6) {
                word6.add(word);
            }
            if (word.length() == 7) {
                word7.add(word);
            }
            if (word.length() == 8) {
                word8.add(word);
            }
            if (word.length() == 9) {
                word9.add(word);
            }
            if (word.length() == 10) {
                word10.add(word);
            }
            if (word.length() == 11) {
                word11.add(word);
            }
            if (word.length() == 12) {
                word12.add(word);
            }
            if (word.length() == 13) {
                word13.add(word);
            }
            if (word.length() == 14) {
                word14.add(word);
            }
            if (word.length() == 15) {
                word15.add(word);
            }
        }

        lenghtWord.put(1, word1);
        lenghtWord.put(2, word2);
        lenghtWord.put(3, word3);
        lenghtWord.put(4, word4);
        lenghtWord.put(5, word5);
        lenghtWord.put(6, word6);
        lenghtWord.put(7, word7);
        lenghtWord.put(8, word8);
        lenghtWord.put(9, word9);
        lenghtWord.put(10, word10);
        lenghtWord.put(11, word11);
        lenghtWord.put(12, word12);
        lenghtWord.put(13, word13);
        lenghtWord.put(14, word14);
        lenghtWord.put(15, word15);

        return lenghtWord;
    }

}



