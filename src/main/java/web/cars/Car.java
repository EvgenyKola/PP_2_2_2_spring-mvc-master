package web.cars;

public class Car {

    private String production;
    private String model;
    private int year;

    public Car() {};

    public Car(String production, String model, int year) {
        this.production = production;
        this.model = model;
        this.year = year;
    };

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getProduction() {
        return production;
    }

    @Override
    public String toString() {
        return "Cars [production=" + production + ", model=" + model + ", year=" + year + "]";
    }
}


