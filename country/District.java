package country;

import java.util.ArrayList;

public class District {
    private String districtName;
    private City districtCentre;
    private ArrayList<City> cities;
    private double area;

    District(String districtName, ArrayList<City> cities, City districtCentre, double area) {
        this.districtName = districtName;
        this.districtCentre = districtCentre;
        this.cities = cities;
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}
