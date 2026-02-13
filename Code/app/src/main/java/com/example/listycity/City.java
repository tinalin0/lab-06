package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * Constructor for City
     * @param city
     *      Name of the city
     * @param province
     *      Name of the province
     */
    City (String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name
     * @return
     *      City name
     */
    String getCityName () {
        return this.city;
    }

    /**
     * Returns the province name
     * @return
     *      Province name
     */
    String getProvinceName () {
        return this.province;
    }

    /**
     * Compares cities by their names
     * @param o
     *      The city to compare to
     * @return
     *      Comparison result
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }

    /**
     * Checks if two cities are equal based on name and province
     * @param o
     *      The object to compare
     * @return
     *      True if equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) &&
                Objects.equals(province, city1.province);
    }

    /**
     * Generate hash code for the city
     * @return
     *      hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}