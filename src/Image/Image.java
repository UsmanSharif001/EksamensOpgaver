package Image;

public class Image {

    private String fileName;
    private int width;
    private int height;



    public Image(String fileName, int width, int height) {

        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }


    public boolean isKnownFiletype() {

        return fileName.endsWith(".gif") || fileName.endsWith("jpg")
                || fileName.endsWith(".bmp") || fileName.endsWith("jng");
    }

    public boolean isPortrait() {

        return height > width;


    }

    public boolean isLandscape() {

        return height < width;
    }

    @Override
    public String toString() {
        return "Image" +
                "fileName: " + fileName + '\'' +
                ", width: " + width +
                ", height: " + height;
    }
}
