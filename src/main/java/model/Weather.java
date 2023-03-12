package model;

public class Weather {

    private String city;
    private String country;
    private int temp;

    public Weather(String city, String country, int temp) {
        this.city = city;
        this.country = country;
        this.temp = temp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", temp=" + temp +
                '}';
    }
}
