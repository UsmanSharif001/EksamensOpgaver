public class Image {
    private String fileName;
    private int width;
    private int height;

    public Image(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public boolean isKnownFileType(){
        if (fileName.equals(".gif") || fileName.equals(".jpg") || fileName.equals(".jpeg") || fileName.equals(".jpeg") || fileName.equals("png"));
        return true;
    }

    public boolean isPortrait() {

        if (height > width) {
            return true;
        } return false;
    }

    @Override
    public String toString() {
        return "Image{" +
                "fileName='" + fileName + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
