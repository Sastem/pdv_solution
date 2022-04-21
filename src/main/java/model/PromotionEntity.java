package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "promotion", schema = "pdvsolution_db", catalog = "")
public class PromotionEntity {
    private int promotionId;
    private String name;
    private Double percentValue;
    private String amountValue;

    @Id
    @Column(name = "promotion_id")
    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
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
    @Column(name = "percent _value")
    public Double getPercentValue() {
        return percentValue;
    }

    public void setPercentValue(Double percentValue) {
        this.percentValue = percentValue;
    }

    @Basic
    @Column(name = "amount_value")
    public String getAmountValue() {
        return amountValue;
    }

    public void setAmountValue(String amountValue) {
        this.amountValue = amountValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromotionEntity that = (PromotionEntity) o;
        return promotionId == that.promotionId &&
                Objects.equals(name, that.name) &&
                Objects.equals(percentValue, that.percentValue) &&
                Objects.equals(amountValue, that.amountValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promotionId, name, percentValue, amountValue);
    }
}
