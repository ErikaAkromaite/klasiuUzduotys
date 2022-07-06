public class koordinate {

    double x;
    double y;

    public koordinate() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "koordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

        public void apkeistiSkaicius () {
       double x = 5;
       double y = 20;
       double temp  = x;
       x = y;
       y =  temp;

            System.out.println("apkeista vietomis = " + temp);





    }


}
