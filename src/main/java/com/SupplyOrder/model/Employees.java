package com.SupplyOrder.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Jason on 1/4/16.
 */
@Entity
public class Employees {

    @Id
    private Long employeeId;

    @NotNull
    private String lastName;
    @NotNull
    private String firstName;
    @NotNull
    private String title;
    private String titleOfCourtesy;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date birthday;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date hireDate;
    @NotNull
    private String address;
    @NotNull
    private String city;
    @NotNull
    private String region;
    @NotNull
    private String postalCode;
    @NotNull
    private String country;
    @NotNull
    private String homePhone;
    private String extension;
    private byte[] photo;
    private String notes;
    @NotNull
    private Long reportsTo;


    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }

    public void setTitleOfCourtesy(String titelOfCourtesy) {
        this.titleOfCourtesy = titelOfCourtesy;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Long getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Long reportsTo) {
        this.reportsTo = reportsTo;
    }
}
