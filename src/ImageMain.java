public class ImageMain {
    public static void main(String[] args) {
        Image image1 = new Image(".jpg", 20, 30);

        System.out.println(image1.isKnownFileType());
        System.out.println(image1.isPortrait());

    }
}
