package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "payment", schema = "pdvsolution_db", catalog = "")
public class PaymentEntity {
    private int paymentId;
    private PaymentTypeEntity paymentTypeByPaymentTypeId;

    @Id
    @Column(name = "payment_id")
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentEntity that = (PaymentEntity) o;
        return paymentId == that.paymentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId);
    }

    @ManyToOne
    @JoinColumn(name = "payment_type_id", referencedColumnName = "payment_type_id")
    public PaymentTypeEntity getPaymentTypeByPaymentTypeId() {
        return paymentTypeByPaymentTypeId;
    }

    public void setPaymentTypeByPaymentTypeId(PaymentTypeEntity paymentTypeByPaymentTypeId) {
        this.paymentTypeByPaymentTypeId = paymentTypeByPaymentTypeId;
    }
}
