package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pdv_device", schema = "pdvsolution_db", catalog = "")
public class PdvDeviceEntity {
    private int pdvDeviceId;
    private EmployeeEntity employeeByEmployeeId;

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
        PdvDeviceEntity that = (PdvDeviceEntity) o;
        return pdvDeviceId == that.pdvDeviceId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pdvDeviceId);
    }

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    public EmployeeEntity getEmployeeByEmployeeId() {
        return employeeByEmployeeId;
    }

    public void setEmployeeByEmployeeId(EmployeeEntity employeeByEmployeeId) {
        this.employeeByEmployeeId = employeeByEmployeeId;
    }
}
