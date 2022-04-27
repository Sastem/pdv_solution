package com.pdv.solution.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pdv_device", schema = "pdvsolution_db", catalog = "")
public class PdvDevice {
    private int pdvDeviceId;
    private Employee employeeByEmployeeId;

    @Id
    @Column(name = "pdv_device_id")
    public int getPdvDeviceId() {
        return pdvDeviceId;
    }

    public void setPdvDeviceId(int pdvDeviceId) {
        this.pdvDeviceId = pdvDeviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PdvDevice that = (PdvDevice) o;
        return pdvDeviceId == that.pdvDeviceId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pdvDeviceId);
    }

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    public Employee getEmployeeByEmployeeId() {
        return employeeByEmployeeId;
    }

    public void setEmployeeByEmployeeId(Employee employeeByEmployeeId) {
        this.employeeByEmployeeId = employeeByEmployeeId;
    }
}
