package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "category_customer", schema = "pdvsolution_db", catalog = "")
public class CategoryCustomerEntity {
    private int categoryCustomerId;
    private String categoryName;

    @Id
    @Column(name = "category_customer_id")
    public int getCategoryCustomerId() {
        return categoryCustomerId;
    }

    public void setCategoryCustomerId(int categoryCustomerId) {
        this.categoryCustomerId = categoryCustomerId;
    }

    @Basic
    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryCustomerEntity that = (CategoryCustomerEntity) o;
        return categoryCustomerId == that.categoryCustomerId &&
                Objects.equals(categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryCustomerId, categoryName);
    }
}
