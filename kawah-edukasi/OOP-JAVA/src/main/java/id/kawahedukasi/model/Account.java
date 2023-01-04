package id.kawahedukasi.model;

import java.time.LocalDate;

public class Account extends User {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String dob;
    private String pob;
    private Address address;

    // constructor dengan empty attribute
    public Account() {
        super("Anas","Anas1234");
    }

    // constructor dengan full attribute
    public Account(String username, String password, String fullName, String email, String phoneNumber, String dob, String pob, Address address) {
        super(username, password);

        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.pob = pob;
        this.address = address;
    }
    // Getter dan setter untuk atribut fullName
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Getter dan setter untuk atribut email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter dan setter untuk atribut phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter dan setter untuk atribut dob
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    // Getter dan setter untuk atribut pob
    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    // getter and setter untuk address
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}