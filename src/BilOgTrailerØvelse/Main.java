package BilOgTrailerØvelse;

public class Main {
    public static void main(String[] args) {

        Bil bil1 = new Bil(2000, new Trailer(1000));

        Bil bil2 = new Bil(2500, new Trailer(1001));

        Bil bil3 = new Bil(100, new Trailer(200));

        bil1.totalVægten();


        bil2.totalVægten();

        bil3.totalVægten();


    }
}
