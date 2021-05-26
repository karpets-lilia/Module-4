package country;

import java.util.ArrayList;

public class Region {
   private String regionName;
   private City regionalCentre;
   private ArrayList<District> districts;

   Region(String regionName, City regionalCentre,ArrayList<District> districts) {
      this.regionName = regionName;
      this.regionalCentre = regionalCentre;
      this.districts = districts;
   }

   public double getArea() {
      double sum = 0;
      for (District district : districts) {
         sum += district.getArea();
      }
      return sum;
   }

   public String getRegionCenterName(){
      return regionalCentre.getName();
   }
}