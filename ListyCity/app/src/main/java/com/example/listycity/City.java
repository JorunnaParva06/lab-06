package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable {
    private String city;
    private String province;

    /**
     * This is a constructor for a City object
     * @param city This is the name of the city
     * @param province This is the province where the city is located
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This returns the name of the City object
     * @return Return the name of the City object
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This returns the province of the City object
     * @return Return the province of the City object
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This compares 2 city names lexicographically for sorting
     * @param o This is another City to be compared
     * @return Return 0 if both city names are lexicographically equal, negative if this city's name is less, positive if greater
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

}