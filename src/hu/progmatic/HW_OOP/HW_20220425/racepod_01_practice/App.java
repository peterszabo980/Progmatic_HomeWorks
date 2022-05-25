package hu.progmatic.HW_OOP.HW_20220425.racepod_01_practice;

public class App {
    public static void main(String[] args) {
        RacePod.setSpeedLimit(500);
        RacePod[] racePods = {
            new RacePod("Slow", -100, true),
            new RacePod("Fast", 1000, true),
            new RacePod("Middle", 1550, false),
        };

        Object[] dataSheets = {
                "RacePodok listája - adatlap",
                "===========================",
                racePods[0],
                racePods[1],
                racePods[2]
        };

        for (RacePod racePod : racePods) {
            System.out.println(racePod);
        }

        RacePod fastest = null;
        int speedSum = 0;

        for (RacePod racePod : racePods) {
            // akkor írja felül, ha az első iterációban járunk (akkor mindig null) VAGY
            // találtunk egy gyorsabbat
            if (fastest == null || racePod.getSpeed() > fastest.getSpeed()) {
                fastest = racePod;
            }
            speedSum += racePod.getSpeed();
        }

        System.out.println("A leggyorsabb: " + fastest);
        System.out.println("Átlag sebesség: " + speedSum / racePods.length);
    }
}
