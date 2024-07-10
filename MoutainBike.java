public class MountainBike extends Bicycle {

    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
          j              int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
lllllllllll
    // the MountainBik hjkhhe subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
