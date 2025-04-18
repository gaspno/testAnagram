import java.util.*;

public class AnagramsGenerator {
    public static List<String> GetList(String word) {

        if (word.isEmpty()) {
            System.out.println("Invalid word don't contains letters");
            return null;
        }
        else if (word.length() == 1) {
            return Arrays.asList(word);
        }
        HashMap<Character, Boolean> map = new HashMap<>();
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++) {
            if(Character.isLetter(word.charAt(i)) == false) {
                System.out.println("Invalid word contains special characters");
                return null;
            }
            if (map.containsKey(word.charAt(i))) {
                System.out.println("Invalid word contains repeated letters");
                return null;
            }
            map.put(word.charAt(i),true);
        }
        List<String> anagrams=new ArrayList<>();
        GenerateAnagrams(word, "",anagrams);
        return anagrams;

    }

    private static void GenerateAnagrams(String word, String stack,List<String>anagrams) {
        // last step from code in this situation the word remains is empty so this is a final valid anagram
        if(word.isEmpty()){
            anagrams.add(stack);
        }else{
            //first create temp anagrams with first letters
            if(stack.isEmpty()){
                for (int i = 0; i < word.length(); i++) {
                    String letter= String.valueOf(word.charAt(i));
                    GenerateAnagrams(word.replace(letter,""),stack+letter,anagrams);
                }
            }else{
                //here the temp anagrams go be added to the additonal letters each anagram is incremented by other letter
                //creating all possible temp options until that length of letters
                for (int i = 0; i < word.length(); i++) {
                    String letter= String.valueOf(word.charAt(i));
                    GenerateAnagrams(word.replace(letter,""),stack+letter,anagrams);
                }
            }
        }
    }


}
