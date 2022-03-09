import java.lang.reflect.Array;
import java.util.LinkedHashMap;

public class CaesarCipher {
    private String word;
    private int numShift;

    public CaesarCipher(String word, int numShift) {
        this.word = word;
        this.numShift = numShift;
    }

    private void encrypt(){
        LinkedHashMap<String, String> mapEncrypt = new LinkedHashMap<>();
        String[] str = "abcdefghijklmnopqrstuvwxyz".split("");
        for (int i = 0; i < 26; i++) {
            mapEncrypt.put(str[i], (str[i + numShift]));
            if(i == 25){
                mapEncrypt.put(str[i], (str[numShift]));
            }
        }
    }
}
