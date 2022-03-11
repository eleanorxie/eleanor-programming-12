import java.util.LinkedHashMap;

public class CaesarCipher {
    private String word;
    private int numShift;
    LinkedHashMap<String, String> mapEncrypt = new LinkedHashMap<>();
    LinkedHashMap<String, String> mapDecrypt = new LinkedHashMap<>();
    String[] str = "abcdefghijklmnopqrstuvwxyz".split("");
    public CaesarCipher(String word, int numShift) {
        this.word = word;
        this.numShift = numShift;
        if(numShift > 0){
            encrypt();
            encryptWord();
        }
        else{
            decrypt();
            decryptWord();
        }


    }

    private void encrypt(){
        for (int i = 0; i < 26; i++) {
            int totalShift = i + numShift;

            if(totalShift > 25){
                totalShift-=25;
            }
            mapEncrypt.put(str[i], (str[totalShift]));
        }
    }

    private void decrypt(){
        for (int i = 0; i < 26; i++) {
            int totalShift = i + numShift;

            if(totalShift < 0){
                totalShift = 26 + totalShift;
            }
            mapDecrypt.put(str[i], (str[totalShift]));
        }
    }

    private String encryptWord(){
        String finalWord = "";
        for(int i = 0; i < word.length(); i++){
            finalWord = finalWord + mapEncrypt.get(word.substring(i,i+1));
        }
        return finalWord;
    }
    private String decryptWord(){
        String finalWord = "";
        for(int i = 0; i < word.length(); i++){
            finalWord = finalWord + mapDecrypt.get(word.substring(i,i+1));
        }
        return finalWord;
    }

    public String toString() {
        if(numShift > 0){
            return encryptWord();
        }
        else{
            return decryptWord();
        }
    }
}
