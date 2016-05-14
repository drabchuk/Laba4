package ua.kpi.tef.model.entities;

/**
 * Created by Денис on 11.05.2016.
 */
public class Address {
    private static final String STREET = "street: ";
    private static final String BUILDING = ", building: ";
    private static final String APARTMENT = ", apartment: ";
    private static final String CITY = "\ncity: ";
    private static final String ZIP = "\nzip: ";


    private String zip;
    private String city;
    private String street;
    private String building;
    private String apartment;

    public Address(String index, String city, String street, String houseNum,
                   String flatNum) {
        this.zip = index;
        this.city = city;
        this.street = street;
        this.building = houseNum;
        this.apartment = flatNum;
    }

    public String getPostalAddress() {
        StringBuilder sb = new StringBuilder();

        sb.append(STREET);
        sb.append(street);
        sb.append(BUILDING);
        sb.append(building);
        sb.append(APARTMENT);
        sb.append(apartment);
        sb.append(CITY);
        sb.append(city);
        sb.append(ZIP);
        sb.append(zip);

        return sb.toString();
    }

    public String getCommonAddress() {
        StringBuilder sb = new StringBuilder();

        sb.append(STREET);
        sb.append(street);
        sb.append(BUILDING);
        sb.append(building);
        sb.append(APARTMENT);
        sb.append(apartment);

        return sb.toString();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
