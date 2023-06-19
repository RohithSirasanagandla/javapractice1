package day14;
import java.util.*;
import java.util.stream.Stream;

public class Capitalize {
    public static void main (String args[]) {

        Stream<String> st=Stream.of("Serendipity",
                "quixotic",
                "mellifluous",
                "Bucolic",
                "effervescent",
                "Labyrinthine",
                "epiphany",
                "zephyr",
                "ephemeral",
                "cascade");


        st.map(word -> {
                    char firstChar = Character.toUpperCase(word.charAt(0));
                    String capitalizedWord = firstChar + word.substring(1);
                    return capitalizedWord;
                })
                .forEach(System.out::println);


    }

}
