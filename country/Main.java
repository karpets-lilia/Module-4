package country;

/*Создать объект класса Государство, используя классы Область, Район, Город.
 Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        City cityMinsk = new City("Minsk");
        City cityKobrin = new City("Kobrin");
        City cityDivin = new City("Divin");
        City cityPinsk = new City("Pinsk");
        City cityGorodok = new City("Gorodok");
        City cityBorisov = new City("Borisov");
        City cityNovosady = new City("Novosady");
        City citySlutsk = new City("Slutsk");
        City cityLenino = new City("Lenino");
        City cityBrest = new City("Brest");


        ArrayList<City> borisovDistrictCities = new ArrayList<City>();
        borisovDistrictCities.add(cityBorisov);
        borisovDistrictCities.add(cityNovosady);
        District disBorisov = new District("Borisovskiy r-n", borisovDistrictCities, cityBorisov, 65000);

        ArrayList<City> slutskDistrictCities = new ArrayList<City>();
        slutskDistrictCities.add(citySlutsk);
        slutskDistrictCities.add(cityLenino);
        District disSlutsk = new District("Slutskiy r-n", slutskDistrictCities, citySlutsk, 60000);

        ArrayList<District> minskRegionDistricts = new ArrayList<District>();
        minskRegionDistricts.add(disBorisov);
        minskRegionDistricts.add(disSlutsk);
        Region regMinsk = new Region("Minskaya obl.", cityMinsk, minskRegionDistricts);

        ArrayList<City> kobrinDistrictCities = new ArrayList<City>();
        kobrinDistrictCities.add(cityKobrin);
        kobrinDistrictCities.add(cityDivin);
        District disKobrin = new District("Kobrinskiy r-n", kobrinDistrictCities, cityKobrin, 65000);

        ArrayList<City> pinskDistrictCities = new ArrayList<City>();
        pinskDistrictCities.add(cityPinsk);
        pinskDistrictCities.add(cityGorodok);
        District disPinsk = new District("Pinskiy r-n", pinskDistrictCities, cityPinsk, 60000);

        ArrayList<District> brestRegionDistricts = new ArrayList<District>();
        brestRegionDistricts.add(disKobrin);
        brestRegionDistricts.add(disPinsk);
        Region regBrest = new Region("Brestskaya obl.", cityBrest, brestRegionDistricts);

        ArrayList<Region> countryRegions = new ArrayList<Region>();
        countryRegions.add(regBrest);
        countryRegions.add(regMinsk);
        Country countryBelarus = new Country("Belarus", cityMinsk, countryRegions);

        System.out.println(cityMinsk.getName() + " is the capital of " + countryBelarus.getCountryName());
        System.out.println("Count of regions: " + countryBelarus.getCountOfRegions());
        System.out.println("Country area: " + countryBelarus.getArea());
        System.out.print("Областные центры: ");
        ArrayList<String> regionNames = countryBelarus.getRegionNames();
        for (String name : regionNames) {
            System.out.print(name + " ");
        }
    }

}