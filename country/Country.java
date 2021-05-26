package country;
import java.util.ArrayList;

public class Country {
    private String countryName;
    private City capital;
    private ArrayList<Region> regions;

    Country(String countryName, City capital, ArrayList<Region> regions) {
        this.countryName = countryName;
        this.capital = capital;
        this.regions = regions;
    }

    public  int getCountOfRegions() {
        return regions.size();

    }
    public double getArea() {
        double sum = 0;
        for (Region reg : regions) {
            sum += reg.getArea();
        }
        return sum;
    }

    public String getCountryName() {
        return countryName;
    }

    public ArrayList<String> getRegionNames() {
        ArrayList<String> names = new ArrayList<String>();
        for(Region region: regions) {
            names.add(region.getRegionCenterName());
        }
        return names;
    }
}
