package id.kawahedukasi.model;

public class Address {
    private String street;
    private String district;
    private String city;
    private String province;

    // Konstruktor kelas Address
    public Address(String street, String district, String city, String province) {
        this.street = street;
        this.district = district;
        this.city = city;
        this.province = province;
    }

    // Getter dan setter untuk atribut street
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    // Getter dan setter untuk atribut district
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    // Getter dan setter untuk atribut city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter dan setter untuk atribut province
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return  "Jalan = " + street + '\'' +
                ", Kecamatan ='" + district + '\'' +
                ", Kabupaten/Kota ='" + city + '\'' +
                ", Provinsi ='" + province + '\'' +
                '}';
    }
}