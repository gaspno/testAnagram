import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain {


    @Test
    @DisplayName("Good case test")
    public void goodTest() {
        String word="abc";
        List<String> list=AnagramsGenerator.GetList(word);
        assertEquals(6,list.size());
        List<String> expectedAnagrams=new ArrayList<>(List.of(new String[]{"abc", "acb", "bac", "bca", "cab", "cba"}));

        // Pode validar que contém todos os anagramas esperados
        for (String s:expectedAnagrams){
            assertTrue(list.contains(s));
        }


    }

    @Test
    @DisplayName("One letter case test")
    public void badTest() {
        String word="t";
        List<String> list=AnagramsGenerator.GetList(word);
        assertEquals(1,list.size());
        assertTrue(list.contains("t"));

    }

    @Test
    @DisplayName("No letter case test")
    public void noLetterTest() {
        String word="ab8c";
        List<String> list=AnagramsGenerator.GetList(word);
        assertEquals(null,list);

    }

    @Test
    @DisplayName("Null case test")
    public void nullTest() {
        String word="";
        List<String> list=AnagramsGenerator.GetList(word);
        assertEquals(null,list);

    }
    @Test
    @DisplayName("Good case test")
    public void repeatedLetterTest() {
        String word="acdcbc";
        List<String> list=AnagramsGenerator.GetList(word);
        assertEquals(null,list);
    }


}
