package CodeMessageØvelse;

import javax.crypto.Cipher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeMessage {

    private String plainText;
    private int[] ciphers;

    private int shiftValue;


    public CodeMessage(String plainText) {
        this.plainText = plainText;
        this.ciphers = new int[plainText.length()];

    }
    public int[] getCiphers() {

        return Arrays.copyOf(ciphers, ciphers.length);

    }
    public int getShiftValue() {
        return shiftValue;
    }

    public void convertMessageToNumbers() {

        plainText.chars().map(a -> a - 'A' + 1).forEach(System.out::println);

    }

    public void textToCiphers() {
        for (int i = 0; i < plainText.length(); i++) {
            ciphers[i] = plainText.charAt(i) - 'A' + 1;

        }




    }



}
