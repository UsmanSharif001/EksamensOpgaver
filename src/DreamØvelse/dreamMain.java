package DreamØvelse;

import DreamØvelse.Dream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dreamMain {
    public static void main(String[] args) {

        Dream dream1 = new Dream(LocalDate.of(2022, 1, 22), 12, "tør");
        Dream dream2 = new Dream(LocalDate.of(2002, 2, 22), 9, "våd");
        Dream dream3 = new Dream(LocalDate.of(2012, 4, 22), 41, "mareridt");


        List<Dream> dreamList = new ArrayList<>();
        {
            dreamList.add(dream1);
            dreamList.add(dream2);
            dreamList.add(dream3);
        }
        Collections.sort(dreamList);

        for (Dream dream : dreamList) {
            System.out.println("Date: " + dream.getDate() + ", Duration: " + dream.getDuration()
                    + " minutes, Type: " + dream.getType() + ", Pleasant: " + dream.isPleasant());
        }

    }
}