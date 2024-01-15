package Image;

public class Main {
    public static void main(String[] args) {

        Image image1 = new Image("Mona Lisa.gif", 100, 10);
        boolean isValid = image1.isKnownFiletype();
        System.out.println(image1);
        System.out.println(isValid);

        boolean isWiderThanHeight = image1.isLandscape();

        System.out.println(isWiderThanHeight);

        boolean isHeigherThanWide = image1.isPortrait();
        System.out.println(isHeigherThanWide);


    }
}
