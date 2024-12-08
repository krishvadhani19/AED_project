/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GovernmentAgentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nitin
 */
public class GovernmentOrganization extends Organization{

    public GovernmentOrganization(String name, OrganizationDirectory parent) {
        super(name == null ? Organization.Type.Government.getValue() : name, parent);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentAgentRole());
        return roles;
    }
     
}