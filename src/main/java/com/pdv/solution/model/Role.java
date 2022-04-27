package com.pdv.solution.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "role", schema = "pdvsolution_db", catalog = "")
public class Role {
    private byte roleId;
    private String roleName;

    @Id
    @Column(name = "role_id")
    public byte getRoleId() {
        return roleId;
    }

    public void setRoleId(byte roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role that = (Role) o;
        return roleId == that.roleId &&
                Objects.equals(roleName, that.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName);
    }
}
