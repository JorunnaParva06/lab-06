package com.example.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {

    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns whether a list of cities has a specific city in it
     * @param city
     *      This is a candidate city to be checked for
     * @return
     *      Return true if it contains specified city, otherwise false
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This removes a city from the list if the city exists
     * @param city
     *      This is a candidate city to remove
     */
    public void delete(City city) {
        if (hasCity(city)) {
            cities.remove(city);
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * This returns the number of cities in a list
     * @return
     *      Return the number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }

}
