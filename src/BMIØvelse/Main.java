package BMIØvelse;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BMI bmi1 = new BMI(185, 83);
        BMI bmi2 = new BMI(200,55);
        BMI bmi3 = new BMI(145, 88);

        bmi1.BMIcalculator();
        bmi1.isNormalWeight();
        bmi1.isOverWeight();
        bmi1.isUnderWeight();


        bmi2.BMIcalculator();
        bmi2.isNormalWeight();
        bmi2.isOverWeight();
        bmi2.isUnderWeight();


        bmi3.BMIcalculator();
        bmi3.isOverWeight();
        bmi3.isNormalWeight();
        bmi3.isUnderWeight();




    }
}
