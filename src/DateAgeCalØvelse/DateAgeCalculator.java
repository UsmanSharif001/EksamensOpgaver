package DateAgeCalØvelse;

public class DateAgeCalculator {

    private int yourAge;
    private int dateAge;


    public DateAgeCalculator(int yourAge, int dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;

    }

    public boolean acceptableDateAge() {
        if (yourAge/2 + 7 > dateAge) {
            return false;
        }
        return true;

    }

    @Override
    public String toString() {
        return "DateAgeCalculator{" +
                "yourAge=" + yourAge +
                ", dateAge=" + dateAge +
                '}';
    }
}
