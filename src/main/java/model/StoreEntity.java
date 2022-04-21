package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "store", schema = "pdvsolution_db", catalog = "")
public class StoreEntity {
    private int storeId;
    private String name;
    private String phone;
    private String address;
    private Integer postcode;
    private String city;
    private String country;
    private String district;
    private CategoryStoreEntity categoryStoreByCategoryStoreId;

    @Id
    @Column(name = "store_id")
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreEntity that = (StoreEntity) o;
        return storeId == that.storeId &&
                Objects.equals(name, that.name) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(address, that.address) &&
                Objects.equals(postcode, that.postcode) &&
                Objects.equals(city, that.city) &&
                Objects.equals(country, that.country) &&
                Objects.equals(district, that.district);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId, name, phone, address, postcode, city, country, district);
    }

    @ManyToOne
    @JoinColumn(name = "category_store_id", referencedColumnName = "category_id")
    public CategoryStoreEntity getCategoryStoreByCategoryStoreId() {
        return categoryStoreByCategoryStoreId;
    }

    public void setCategoryStoreByCategoryStoreId(CategoryStoreEntity categoryStoreByCategoryStoreId) {
        this.categoryStoreByCategoryStoreId = categoryStoreByCategoryStoreId;
    }
}
