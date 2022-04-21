package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "payment_type", schema = "pdvsolution_db", catalog = "")
public class PaymentTypeEntity {
    private byte paymentTypeId;

    @Id
    @Column(name = "payment_type_id")
    public byte getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(byte paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentTypeEntity that = (PaymentTypeEntity) o;
        return paymentTypeId == that.paymentTypeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentTypeId);
    }
}
