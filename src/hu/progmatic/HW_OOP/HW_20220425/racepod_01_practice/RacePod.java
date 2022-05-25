package hu.progmatic.HW_OOP.HW_20220425.racepod_01_practice;

public class RacePod {
    private static Integer speedLimit;
    private String name;
    private int speed;
    private boolean restricted;

    public RacePod() {

    }

    public RacePod(String name, int speed, boolean restricted) {
        setRestricted(restricted);
        setName(name);
        setSpeed(speed);
        /*this.name = name;
        this.speed = speed;
        this.restricted = restricted;*/
    }

    public static Integer getSpeedLimit() {
        return speedLimit;
    }

    public static void setSpeedLimit(Integer speedLimit) {
        RacePod.speedLimit = speedLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = -10;
        if (speed < -10) {
            System.out.println("Nem lehet a sebesség kisebb, mint -10!");
        } else if (restricted && speed > speedLimit) {
            this.speed = speedLimit;
            System.out.println("A sebesség nem lehet nagyobb " + speedLimit + "-nál/nél!");
        } else {
            this.speed = speed;
        }
    }

    public boolean isRestricted() {
        return restricted;
    }

    public void setRestricted(boolean restricted) {
        this.restricted = restricted;
    }

    @Override
    public String toString() {
        return "RacePod{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", restricted=" + restricted +
                '}';
    }
}
