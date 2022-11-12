class Bike {

    public String Bike_Name;
    private int Bike_Plate_No = 5412;
    private String Bike_CC = "100CC";
    private String Bike_Engine_Type = "Petrol";

    Bike() {
        this("Honda");
    }

    Bike(String Bike_Name) {
        this.Bike_Name = Bike_Name;
    }

    public void details() {
        System.out.println("Bike Name is: " + Bike_Name);
        System.out.println("Bike Plate Number is: " + Bike_Plate_No);
        System.out.println("Bike CC is: " + Bike_CC);
        System.out.println("Bike Engine Type is: " + Bike_Engine_Type);
        System.out.println("********************************************");
    }
}