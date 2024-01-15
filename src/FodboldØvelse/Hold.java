package FodboldØvelse;

import FodboldØvelse.Statestik;

import java.util.ArrayList;

public class Hold {
    private String navn;
    private int mål;
    private int antalMålImod;
    Statestik statestik = new Statestik();



    ArrayList<Integer> statestikHold = new ArrayList();


    public Hold (String navn) {
        this.navn = navn;

    }

    public int opdaterStatestik(int mål, int antalMålImod, int målForskel) {
        int opdateretStatestik = 0;
        if (mål > antalMålImod) {
            statestik.setPoint(3);
        } else if (mål == antalMålImod) {
            statestik.setPoint(1);
        } else statestik.setPoint(0);

        statestik.setAntalKampe(antalMålImod);
        statestik.setMål(mål);
        statestik.setMålForskel(målForskel);
        statestik.antalMålImod(antalMålImod);

        return opdateretStatestik;
    }

    @Override
    public String toString() {
        return "FodboldØvelse.Hold:" +
                navn + '\'' + statestik +
                ", statestikHold = " + statestikHold +
                '}';
    }
}
