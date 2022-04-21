package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reduction", schema = "pdvsolution_db", catalog = "")
public class ReductionEntity {
    private int reductionId;
    private Double percentValue;
    private String amountValue;
    private String name;

    @Id
    @Column(name = "reduction_id")
    public int getReductionId() {
        return reductionId;
    }

    public void setReductionId(int reductionId) {
        this.reductionId = reductionId;
    }

    @Basic
    @Column(name = "percent_value")
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

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReductionEntity that = (ReductionEntity) o;
        return reductionId == that.reductionId &&
                Objects.equals(percentValue, that.percentValue) &&
                Objects.equals(amountValue, that.amountValue) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reductionId, percentValue, amountValue, name);
    }
}
