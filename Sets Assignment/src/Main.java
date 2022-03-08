import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("illiad.txt"));
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

        /*LinkedHashSet<Word> words = new LinkedHashSet<>();

        ArrayList arr = new ArrayList<>();
        String file = String.valueOf(new File("illiad.txt"));
        String str = file;

        while(str.length() > 0){
            int j = str.indexOf(" ");
            str = str.substring(j);
            arr.add(str.substring((i,j)));


        }*/

        String str = String.valueOf(new File("illiad.txt"));
        String[] words = str.replaceAll("\\p{Punct}", "").split(" ");
        LinkedHashSet<String> wordSet = new LinkedHashSet<>();
        for (int i = 0; i < words.length; i++) {
            wordSet.add(words[i].toLowerCase(Locale.ROOT));
        }
        for (String w:
             wordSet) {
            System.out.println(w);
        }

    }
}
