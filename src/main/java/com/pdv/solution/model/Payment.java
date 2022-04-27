package com.pdv.solution.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "payment", schema = "pdvsolution_db", catalog = "")
public class Payment {
    private int paymentId;
    private PaymentType paymentTypeByPaymentTypeId;

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
        Payment that = (Payment) o;
        return paymentId == that.paymentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId);
    }

    @ManyToOne
    @JoinColumn(name = "payment_type_id", referencedColumnName = "payment_type_id")
    public PaymentType getPaymentTypeByPaymentTypeId() {
        return paymentTypeByPaymentTypeId;
    }

    public void setPaymentTypeByPaymentTypeId(PaymentType paymentTypeByPaymentTypeId) {
        this.paymentTypeByPaymentTypeId = paymentTypeByPaymentTypeId;
    }
}
