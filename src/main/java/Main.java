import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Digit the letters to create anagrams!");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(AnagramsGenerator.GetList(word));
    }
}

