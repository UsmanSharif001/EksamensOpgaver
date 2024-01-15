package CodeMessageØvelse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {

        CodeMessage msg1 = new CodeMessage("ABCabc");

        msg1.convertMessageToNumbers();


        int[] ciphers = msg1.getCiphers();

        System.out.println("Ciphers: " + Arrays.toString(ciphers));

    }
}
