package com.pdv.solution.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order", schema = "pdvsolution_db", catalog = "")
public class Order {
    private int orderId;
    private String status;
    private Customer customerByCustomerId;
    private Employee employeeByEmployeeId;
    private Payment paymentByPaymentId;
    private Store storeByStoreId;
    private Provider providerByProviderId;
    private Reduction reductionByReductionId;

    @Id
    @Column(name = "order_id")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order that = (Order) o;
        return orderId == that.orderId &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, status);
    }

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    public Customer getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(Customer customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    public Employee getEmployeeByEmployeeId() {
        return employeeByEmployeeId;
    }

    public void setEmployeeByEmployeeId(Employee employeeByEmployeeId) {
        this.employeeByEmployeeId = employeeByEmployeeId;
    }

    @ManyToOne
    @JoinColumn(name = "payment_id", referencedColumnName = "payment_id")
    public Payment getPaymentByPaymentId() {
        return paymentByPaymentId;
    }

    public void setPaymentByPaymentId(Payment paymentByPaymentId) {
        this.paymentByPaymentId = paymentByPaymentId;
    }

    @ManyToOne
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    public Store getStoreByStoreId() {
        return storeByStoreId;
    }

    public void setStoreByStoreId(Store storeByStoreId) {
        this.storeByStoreId = storeByStoreId;
    }

    @ManyToOne
    @JoinColumn(name = "provider_id", referencedColumnName = "provider_id")
    public Provider getProviderByProviderId() {
        return providerByProviderId;
    }

    public void setProviderByProviderId(Provider providerByProviderId) {
        this.providerByProviderId = providerByProviderId;
    }

    @ManyToOne
    @JoinColumn(name = "reduction_id", referencedColumnName = "reduction_id")
    public Reduction getReductionByReductionId() {
        return reductionByReductionId;
    }

    public void setReductionByReductionId(Reduction reductionByReductionId) {
        this.reductionByReductionId = reductionByReductionId;
    }
}
