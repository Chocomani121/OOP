public class Cartype extends Main {

    // String name;
    String model;
    String brand;
    int year;
    String location;

    public Cartype(String name, String model, String brand, int year, String location) {

        // this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.location = location;
    }

    // public brand("mitsubishi", "honda", "toyota"){
    // string[] brand = new string[3]
    // this is will be the brand names for the user to choose
    // for (int i = 0; i < 5; i++)
    // System.out.println("what type of car brand?");
    // brand[i] = scan.next();
    // System.out.println("Name: " + car1.getName() + "\nModel: " + car1.getModel()
    // + "\nBrand: " + car1.getBrand()
    // + "\nYear: " + car1.getYear() + "\nLcation: " + car1.getLocation());

    // intial output = the display will be
    // *What type of car brand*
    // -------honda--------
    // model,year,location,
    // ---------------------
    // brand.honda
    // model.civic
    // year.1998
    // location.cebu
    // }
    // }
    public static void travel(Cartype car1) {

        // car1.setLocation("Cebu");
        // System.out.println("Name: " + car1.getName() + "\nModel: " + car1.getModel()
        // + "\nBrand: " + car1.getBrand()
        // + "\nYear: " + car1.getYear() + "\nLcation: " + car1.getLocation());

        car1.setLocation("mandaue");
        System.out.println("Model: " + car1.getModel() + "\nBrand: " + car1.getBrand()
                + "\nYear: " + car1.getYear() + "\nLcation: " + car1.getLocation());

    }

    // public String getName() {
    // return name;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}