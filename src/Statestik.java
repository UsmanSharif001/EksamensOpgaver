public class Statestik {
    private int antalKampe;
    private int point;
    private int målForskel;
    private int mål;
    private int antalMålScoredeImod;


    public int getAntalMålImod() {
        return antalMålImod;
    }

    private int antalMålImod;

    public int getAntalKampe() {
        return antalKampe;
    }

    public void setAntalKampe(int antalKampe) {
        this.antalKampe = antalKampe;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getMålForskel() {
        return målForskel;
    }

    public void setMålForskel(int målForskel) {
        this.målForskel = målForskel;
    }
    public void antalMålImod(int antalMålImod) {
        this.antalMålImod = antalMålImod;
    }

    public int getMål() {
        return mål;
    }

    public void setMål(int mål) {
        this.mål = mål;
    }

    @Override
    public String toString() {
        return "Statestik{" +
                "antalKampe=" + antalKampe +
                ", point=" + point +
                ", målForskel=" + målForskel +
                ", mål=" + mål +
                ", antalMålImod=" + antalMålImod +
                '}';
    }
}
