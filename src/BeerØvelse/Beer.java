package BeerØvelse;

public class Beer {

    private String name;
    private double alchoholPercentage;
    private double price;



    public Beer (String name) {
        this.name = name;
    }

    public void setAlchoholPercentage(double alchoholPercentage) {
        this.alchoholPercentage = alchoholPercentage;
        try {
        if (alchoholPercentage <= 100) {
            this.alchoholPercentage = alchoholPercentage;

        } else { throw new IllegalArgumentException("Exception found: " + alchoholPercentage);
        }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void setPrice(double price) {
        this.price = price;

        try {
            if (price > 0) {
               this.price = price;
            } else {
                throw new IllegalArgumentException("Not a price we have" + price);
            }


        } catch (Exception e) {
            e.getMessage();
        }
    }

    public double getPrice () {
        return price;
    }

    @Override
    public String toString() {
        return "Beer" +
                "name='" + name + '\'' +
                ", alchoholPercentage=" + alchoholPercentage +
                ", price=" + price;
    }
}
