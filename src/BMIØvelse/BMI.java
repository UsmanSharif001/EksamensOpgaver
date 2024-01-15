package BMIØvelse;

public class BMI {

    private double height;

    private double weight;

    private double BMI;

    public BMI (double height, double weight) {

        this.height = height;
        this.weight = weight;

    }

    public void BMIcalculator() {

        BMI = weight/Math.pow(height/100, 2);

        System.out.println(BMI);

    }

    public boolean isUnderWeight() {
        boolean underVægtig = true;
        if (BMI < 18.5)
            System.out.println("Du er undervægtig");
        return underVægtig;
    }

    public void isNormalWeight() {
        boolean normalVægtig = true;
        if (BMI >= 18.5 && BMI <=25 )
            System.out.println("Du er normalvægtig");


    }

    public void isOverWeight() {
       boolean overVægtig = true;
        if (BMI > 25) {
            System.out.println("Du er overvægtig");
        }
    }


}
