package MedieØvelse;

public class Video extends Medie {


    private String aspectRatio;

    public Video(String name, double duration, String aspectRatio) {
        super(name, duration);
        this.aspectRatio = aspectRatio;
    }


    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    @Override
    public String toString() {
        String mediaString = super.toString();
        return mediaString + " Video " +
                " aspectRatio: " + aspectRatio+" aspectRatio";
    }
}
