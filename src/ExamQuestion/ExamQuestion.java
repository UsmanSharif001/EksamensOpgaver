package ExamQuestion;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Random;

public class ExamQuestion {

    private char grade;
    private int number;

    public ExamQuestion(int number, char grade) {

        this.number = number;
        this.grade = grade;
    }


    public void grade() {
       Random random = new Random();
       int randomIndex = random.nextInt(5);

       switch (randomIndex) {
           case 1: grade = 'A';
           break;
           case 2: grade = 'B';
           break;
           case 3: grade = 'C';
           break;
           case 4: grade = 'D';
           break;
           case 5: grade = 'E';
           break;

           default: grade = 'F';
       }
    }

    @Override
    public String toString() {
        return "ExamQuestion{" +
                "grade=" + grade +
                ", number=" + number +
                '}';
    }
}
