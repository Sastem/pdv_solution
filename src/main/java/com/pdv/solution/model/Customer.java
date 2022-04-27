package com.pdv.solution.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "customer", schema = "pdvsolution_db", catalog = "")
public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private Integer postcode;
    private String city;
    private String country;
    private String district;
    private String location;
    private Timestamp creationDate;
    private Timestamp lastModified;
    private CategoryCustomer categoryCustomerByCategoryCustomerId;
    private Reward rewardByRewardId;
    private Store storeByStoreId;

    @Id
    @Column(name = "customer_id")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "postcode")
    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "creation_date")
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "last_modified")
    public Timestamp getLastModified() {
        return lastModified;
    }

    public void setLastModified(Timestamp lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer that = (Customer) o;
        return customerId == that.customerId &&
                Objects.equals(name, that.name) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(address, that.address) &&
                Objects.equals(postcode, that.postcode) &&
                Objects.equals(city, that.city) &&
                Objects.equals(country, that.country) &&
                Objects.equals(district, that.district) &&
                Objects.equals(location, that.location) &&
                Objects.equals(creationDate, that.creationDate) &&
                Objects.equals(lastModified, that.lastModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, name, email, phone, address, postcode, city, country, district, location, creationDate, lastModified);
    }

    @ManyToOne
    @JoinColumn(name = "category_customer_id", referencedColumnName = "category_customer_id")
    public CategoryCustomer getCategoryCustomerByCategoryCustomerId() {
        return categoryCustomerByCategoryCustomerId;
    }

    public void setCategoryCustomerByCategoryCustomerId(CategoryCustomer categoryCustomerByCategoryCustomerId) {
        this.categoryCustomerByCategoryCustomerId = categoryCustomerByCategoryCustomerId;
    }

    @ManyToOne
    @JoinColumn(name = "reward_id", referencedColumnName = "reward_id")
    public Reward getRewardByRewardId() {
        return rewardByRewardId;
    }

    public void setRewardByRewardId(Reward rewardByRewardId) {
        this.rewardByRewardId = rewardByRewardId;
    }

    @ManyToOne
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    public Store getStoreByStoreId() {
        return storeByStoreId;
    }

    public void setStoreByStoreId(Store storeByStoreId) {
        this.storeByStoreId = storeByStoreId;
    }
}
