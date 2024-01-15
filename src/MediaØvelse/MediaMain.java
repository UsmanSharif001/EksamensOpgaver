package MediaØvelse;

import MediaØvelse.Audio;
import MediaØvelse.Media;
import MediaØvelse.Video;

import java.util.ArrayList;

public class MediaMain {
    public static void main(String[] args) {

        Audio audio1 = new Audio("In the end", 3.2, 10);
        Audio audio2 = new Audio("Stairway to Heaven", 4.11, 22);
        Video video1 = new Video("Batman", 3.32, "16:4");

        ArrayList<Media> mediaList = new ArrayList<>();

        mediaList.add(audio1);
        mediaList.add(audio2);
        mediaList.add(video1);

        for (Media media : mediaList) {
            System.out.println(media);
        }


    }
}
