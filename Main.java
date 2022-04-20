public class Main {

    public static void main(String[] args) {

        Cartype car1 = new Cartype("Mitsubishi", "Lancer", "Tesla", 2022, "Cebu");

        System.out.println("\n*Current Locaation*");

        // System.out.println("Name: " + car1.getName() + "\nModel: " + car1.getModel()
        // + "\nBrand: " + car1.getBrand()
        // + "\nYear: " + car1.getYear() + "\nLcation: " + car1.getLocation());

        System.out.println("Model: " + car1.getModel() + "\nBrand: " + car1.getBrand()
                + "\nYear: " + car1.getYear() + "\nLcation: " + car1.getLocation());

        System.out.println("\n*After Travelling*");

        // Call travel method and pass the object
        Cartype.travel(car1);

    }

}