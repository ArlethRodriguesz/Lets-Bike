public class Bike {
    //class that will create the bike designed
    //instance variables:
    private String type;//(road bike=1, electric bike=2)
    private int speed;

    //constructor:
    public Bike(String type, int speed) {
        this.type = type;
        this.speed = speed;

    }

    public String tellBikeType() {
        return type;
    }

    public int TellSpeed() {
        return speed;
    }

}