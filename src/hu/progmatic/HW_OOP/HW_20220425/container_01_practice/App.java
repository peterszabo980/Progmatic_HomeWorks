package hu.progmatic.HW_OOP.HW_20220425.container_01_practice;

public class App {
    public static void main(String[] args) {
        Container.setTaxRate(0.27);

        Cargo water = new Cargo("CARGO/001", "Víz", 10);
        Container[] containers = {
                new Container(water, 2, 2, 2),
                new Container(water, 3, 3, 3),
                new Container(water, 4, 4, 4)
        };

        int netTotal = 0;
        int grossTotal = 0;

        for (Container container : containers) {
            netTotal += container.getNetPrice();
            grossTotal += container.getGrossPrice();
        }

        System.out.println("Nettó összeg: " + netTotal);
        System.out.println("Bruttó összeg: " + grossTotal);

        Object[] dataSheets = {
                "Konténerek listája:",
                containers[0],
                containers[1],
                containers[2]
        };

        for (Object dataSheet : dataSheets) {
            System.out.println(dataSheet);
        }
    }
}
