/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.usermanagement;

import java.util.Objects;

/**
 *
 * @author The Bright
 */
public class Role {
    
    private String roleID;
    private String roleName;
    
    public Role(String roleID, String roleName){
        this.roleID=roleID;
        this.roleName=roleName;
    }

    /**
     * @return the roleID
     */
    public String getRoleID() {
        return roleID;
    }

    /**
     * @param roleID the roleID to set
     */
    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    /**
     * @return the roleName
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName the roleName to set
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Role other = (Role) obj;
        return Objects.equals(roleID, other.roleID); // Compare based on roleID
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleID); // Hash based on roleID (consistent with equals())
    }
    
}
