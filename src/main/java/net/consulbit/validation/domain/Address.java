package net.consulbit.validation.domain;

/**
 * Created by Piero on 26/01/2017.
 */
@net.consulbit.validation.constraint.Address
public class Address {

    private String street;
    private String zipCode;
    private String city;
    private String country;

    public Address() {
    }

    public Address(final String street, final String zipCode, final String city, final String country) {
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public void setZipCode(final String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (getStreet() != null ? !getStreet().equals(address.getStreet()) : address.getStreet() != null) return false;
        if (getZipCode() != null ? !getZipCode().equals(address.getZipCode()) : address.getZipCode() != null)
            return false;
        if (getCity() != null ? !getCity().equals(address.getCity()) : address.getCity() != null) return false;
        return getCountry() != null ? getCountry().equals(address.getCountry()) : address.getCountry() == null;

    }

    @Override
    public int hashCode() {
        int result = getStreet() != null ? getStreet().hashCode() : 0;
        result = 31 * result + (getZipCode() != null ? getZipCode().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        result = 31 * result + (getCountry() != null ? getCountry().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
