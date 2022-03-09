import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("illiad.txt"));
        HashSet<String> wordSet = new HashSet<>();
        int num = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] words = line.split("\\W+");
            for (int i = 0; i < words.length; i++) {
                if(wordSet.add(words[i].toLowerCase())){
                    num++;
                }
            }
        }

        for (String w:
             wordSet) {
            System.out.println(w);
        }

        System.out.println(num);
    }
}
