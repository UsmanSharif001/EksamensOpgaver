package KortØvelse;

public class Kort {

    private int value;

    private SuitEnum suitEnum;




    public Kort (int value, SuitEnum suitEnum) {
        this.value = value;
        this.suitEnum = suitEnum;

    }


    public boolean challenges(Kort otherKort) {
        if (value > otherKort.value) {
            System.out.println(value + " beats " + otherKort.value);
            return true;
        }

        else if (otherKort.value > value) {
            System.out.println(otherKort.value + " beats " + this.value);
            return true;
        }
        else if (value == otherKort.value) {
            if (this.suitEnum.ordinal() > otherKort.suitEnum.ordinal()) {
                System.out.println(this + " beats " + otherKort);
            }
            if (otherKort.value == this.value) {
               if (otherKort.suitEnum.ordinal() > this.suitEnum.ordinal()) {
                   System.out.println(otherKort.value + otherKort.suitEnum.toString() + " beats " + this.value + this.suitEnum + " due to suit");
               }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Kort{" +
                "value=" + value +
                ", suitEnum=" + suitEnum +
                '}';
    }

    public int getValue(){
        return value;
    }

    public SuitEnum getSuitEnum() {
        return suitEnum;
    }
}
