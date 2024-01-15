package ExamQuestion;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        //Opgave 2
        ExamQuestion examQuestion1 = new ExamQuestion(4, 'B');

        examQuestion1.grade();
        System.out.println(examQuestion1);


          //Opgave 3
        List<ExamQuestion> examQuestions = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 14; i++) {
            //Sætter random number til et tal mellem 0 og 4
            int randomNumber = random.nextInt(5);
            //(char) caster randomNumber tilbage til et bogstav startende fra A
            char randomGrade = (char) ('A' + randomNumber);
            //Instanstiere et nyt object af Examquestion og tilføjer til examQuestionsListen "i" antal gange
            examQuestions.add(new ExamQuestion(i, randomGrade));

        }
      examQuestions.forEach(System.out::println);


    }
}
