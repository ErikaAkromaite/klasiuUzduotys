public class Apskritimas {
    private double plotas;
    private double spindulys ;

    public Apskritimas() {
    }

    public Apskritimas(double spindulys) {
        this.spindulys = spindulys;
    }

    public double getSpindulys() {
        return spindulys;
    }

    public void setSpindulys(double spindulys) {
        this.spindulys = spindulys;
    }
    public double skersmuo() {
        return  spindulys * 2;
    }
    public double plotas() {
        return spindulys * spindulys * Math.PI;
    }
    public double ilgis () {
        return 2 * Math.PI * spindulys;
    }

    @Override
    public String toString() {
        return "apskritimas{" +
                "spindulys=" + spindulys +
                '}';
    }

}