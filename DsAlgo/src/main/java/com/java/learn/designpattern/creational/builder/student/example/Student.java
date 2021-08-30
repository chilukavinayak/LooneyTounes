package com.java.learn.designpattern.creational.builder.student.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Address{
    private String firstLine;
    private String secondLine;
    private String landMark;
    private String city;
    private String state;
    private String Country;
    private String pinCode;

    public Address() {
    }

    public Address(String firstLine, String secondLine, String landMark, String city, String state, String country, String pinCode) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.landMark = landMark;
        this.city = city;
        this.state = state;
        Country = country;
        this.pinCode = pinCode;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstLine='" + firstLine + '\'' +
                ", secondLine='" + secondLine + '\'' +
                ", landMark='" + landMark + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", Country='" + Country + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}

public class Student {
    private Integer id;
    private List<Address> addresses;
    private String stream;
    private Integer standard;
    private String firstName;
    private String lastName;

    private Student(StudentBuilder studentBuilder) {
        this.addresses = Collections.unmodifiableList(studentBuilder.addresses);
        this.id = studentBuilder.id;
        this.stream = studentBuilder.stream;
        this.firstName = studentBuilder.firstName;
        this.lastName = studentBuilder.lastName;
        this.standard = studentBuilder.standard;
    }

    public Integer getId() {
        return id;
    }

    public Collection<Address> getAddresses() {
        return Collections.unmodifiableCollection(addresses);
    }

    public String getStream() {
        return stream;
    }

    public int getStandard() {
        return standard;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public static StudentBuilder studentBuilder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder{
        private Integer id;
        private List<Address> addresses;
        private String stream;
        private Integer standard;
        private String firstName;
        private String lastName;

        public StudentBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setAddresses(List<Address> addresses) {
            this.addresses = addresses;
            return this;
        }

        public StudentBuilder setStream(String stream) {
            this.stream = stream;
            return this;
        }

        public StudentBuilder setStandard(int standard) {
            this.standard = standard;
            return this;
        }

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", addresses=" + addresses +
                ", stream='" + stream + '\'' +
                ", standard=" + standard +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

class DriverClass{
    public static void main(String[] args) {

        Address address = new Address();
        address.setFirstLine("Locale address 1");
        address.setSecondLine("Locale address 2");
        address.setCity("Nizamabad");
        address.setCountry("India");
        address.setState("Telangana");
        address.setPinCode("503224");

        Student student = Student.studentBuilder()
                .setId(10)
                .setFirstName("Vinayak")
                .setLastName("Chiluka")
                .setStream("CSE")
                .setAddresses(Arrays.asList(address))
                .build();

        System.out.println(student);
    }
}
