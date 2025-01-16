package day1;

public class Car {
    private String make; 
    private String model;
    private int year;
    private double mileage; 

    public Car(){
        make = "";
        model = "";
        year = 0;
        mileage = 0.0;
    }
    public Car(String m, String ml, int y, double mi){
        make = m;
        model = ml;
        year = y;
        mileage = mi;
    }
    public String getMake(){
        return make; 
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public double getMileage(){
        return mileage;
    }
    public void setMake(String m){
        make = m;
    }
    public void setModel(String ml){
        model = ml;
    }
    public void setYear(int y){
        year = y;
    }
    public void setMileage(double mi){
        mileage = mi;
    }
    public void displayCarDetails(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }
    public void drive(double milesDriven){
        mileage = milesDriven + mileage;
    }

}
