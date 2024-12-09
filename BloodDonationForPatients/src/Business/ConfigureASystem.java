package Business;

import Business.BloodTypes.PersonBloodTypes;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Requests.PatientRequest;
import Business.Requests.PatientRequestDirectory;
import Business.Role.CaseManagerRole;
import Business.Role.GovernmentAgentRole;
import Business.Role.LabEmployeeRole;
import Business.Role.LocalClinicStaffRole;
import Business.Role.LogisticsOfficerRole;
import Business.Role.SystemAdminRole;
import Business.Statuses.BloodRequestStatuses;
import Business.UserAccount.UserAccount;

/**
 * This class configures the initial EcoSystem environment with sample data.
 * 
 * The idea is to set up a basic structure of:
 * - A network and its enterprises (headquarters, government, logistics, local clinics, labs).
 * - Organizations under these enterprises.
 * - Basic employees and user accounts for administration and operations.
 * 
 * After configuration, we could also add sample request data if desired.
 * 
 * The code simulates a small ecosystem where different stakeholders 
 * (like case managers, government agents, lab employees, etc.) can 
 * work together in a structured environment.
 */
public class ConfigureASystem {

    /**
     * Adds some sample patient request data to the system.
     * 
     * Currently, it adds a single sample request to illustrate how the 
     * request directory can be populated.
     * 
     * @param system The EcoSystem object into which the data will be inserted.
     */
    public static void addSampleRequestData(EcoSystem system) {
        // Get the directory that holds all patient requests.
        PatientRequestDirectory prd = system.getPatientRequestDirectory();

        // Create a sample patient request to demonstrate data population.
        PatientRequest sampleRequest = new PatientRequest(prd);
        sampleRequest.setName("Jack");
        sampleRequest.setAge(35);
        sampleRequest.setCity("Boston");
        sampleRequest.setEmailID("jack@northeastern.edu");

        // Add this sample request to the global request directory.
        prd.addPatientRequest(sampleRequest);
    }

    /**
     * Configures the entire EcoSystem with:
     * - A main network representing a country or region.
     * - Various enterprises (Headquarters, Government Agency, Logistics, Local Clinics, Laboratories).
     * - Organizations within each enterprise type.
     * - Employees and user accounts within these organizations.
     * 
     * The method ensures that the system has a well-defined starting point, 
     * complete with sample data and administrative roles.
     * 
     * @return The fully configured EcoSystem object.
     */
    public static EcoSystem configure() {
        // Retrieve a singleton instance of the EcoSystem.
        EcoSystem system = EcoSystem.getInstance();

        // Create the primary network for the system, representing a US network.
        Network worldCordNetwork = system.createAndAddNetwork();
        worldCordNetwork.setName("Wordcord US Network");
        worldCordNetwork.setCountry("US");

        // Create main enterprises under this network:
        // Headquarters for top-level admins, Government Agency, Logistics, Local Clinics, and Laboratories.
        Enterprise hq = worldCordNetwork.getEnterpriseDirectory().createAndAddEnterprise("US Headquarters", Enterprise.EnterpriseType.Headquarter);
        Enterprise government = worldCordNetwork.getEnterpriseDirectory().createAndAddEnterprise("Government Agency", Enterprise.EnterpriseType.Government);
        Enterprise logistics = worldCordNetwork.getEnterpriseDirectory().createAndAddEnterprise("Logistics", Enterprise.EnterpriseType.Logistics);
        Enterprise localClinic = worldCordNetwork.getEnterpriseDirectory().createAndAddEnterprise("Local Clinics", Enterprise.EnterpriseType.LocalClinic);
        Enterprise laboratory = worldCordNetwork.getEnterpriseDirectory().createAndAddEnterprise("Laboratories", Enterprise.EnterpriseType.Laboratory);

        // Create employees and user accounts for each enterprise with SystemAdminRoles.
        // These are top-level admins who can manage their respective enterprises.
        Employee officeAdminEmployee = hq.getEmployeeDirectory().createEmployee("Office Administrator");
        UserAccount officeadmin = hq.getUserAccountDirectory().createUserAccount("officeadmin", "password", officeAdminEmployee, new SystemAdminRole());

        Employee governmentAdminEmployee = government.getEmployeeDirectory().createEmployee("Government Admin");
        UserAccount governmentAdmin = government.getUserAccountDirectory().createUserAccount("governmentadmin", "password", governmentAdminEmployee, new SystemAdminRole());

        Employee logisticsGuyEmployee = logistics.getEmployeeDirectory().createEmployee("Logistics Admin");
        UserAccount logisticsGuy = logistics.getUserAccountDirectory().createUserAccount("logisticsguy", "password", logisticsGuyEmployee, new SystemAdminRole());

        Employee localClinicAdminEmployee = localClinic.getEmployeeDirectory().createEmployee("Local Clinic Admin");
        UserAccount localClinicAdmin = localClinic.getUserAccountDirectory().createUserAccount("localclinicadmin", "password", localClinicAdminEmployee, new SystemAdminRole());

        Employee labAdminEmployee = laboratory.getEmployeeDirectory().createEmployee("Lab Admin");
        UserAccount labAdmin = laboratory.getUserAccountDirectory().createUserAccount("labadmin", "password", labAdminEmployee, new SystemAdminRole());

        // Create organizations under each enterprise to define their structure more granularly.
        // For instance, Headquarters organization, Government organization, etc.
        Organization hqOrg = hq.getOrganizationDirectory().createOrganization(Organization.Type.Headquarter, "US Headquarters Organization");
        Organization governmentOrg = government.getOrganizationDirectory().createOrganization(Organization.Type.Government, "Government Organization");
        Organization logisticsOrg = logistics.getOrganizationDirectory().createOrganization(Organization.Type.Logistics, "Logistics Organization");
        Organization localClinicOrg = localClinic.getOrganizationDirectory().createOrganization(Organization.Type.LocalClinic, "Local Clinics Organization");
        Organization laboratoryOrg = laboratory.getOrganizationDirectory().createOrganization(Organization.Type.Laboratory, "Laboratories Organization");

        // Create specific employees and assign them roles that define their function within the organization.
        // For instance, a case manager at HQ, a government agent at the government enterprise, etc.
        Employee hqEmployee = hqOrg.getEmployeeDirectory().createEmployee("Case Manager");
        UserAccount caseManager = hqOrg.getUserAccountDirectory().createUserAccount("casemanager", "password", hqEmployee, new CaseManagerRole());

        Employee governmentEmployee = governmentOrg.getEmployeeDirectory().createEmployee("Government Agent");
        UserAccount govAgent = governmentOrg.getUserAccountDirectory().createUserAccount("governmentagent", "password", governmentEmployee, new GovernmentAgentRole());

        Employee logisticsEmployee = logisticsOrg.getEmployeeDirectory().createEmployee("Logistics Officer");
        UserAccount logisticsOfficer = logisticsOrg.getUserAccountDirectory().createUserAccount("logisticsofficer", "password", logisticsEmployee, new LogisticsOfficerRole());

        Employee localClinicEmployee = localClinicOrg.getEmployeeDirectory().createEmployee("Local Clinic Staff");
        UserAccount localClinicStaff = localClinicOrg.getUserAccountDirectory().createUserAccount("localclinicuser", "password", localClinicEmployee, new LocalClinicStaffRole());

        Employee laboratoryEmployee = laboratoryOrg.getEmployeeDirectory().createEmployee("Lab Employee");
        UserAccount labEmployee = laboratoryOrg.getUserAccountDirectory().createUserAccount("labemployee", "password", laboratoryEmployee, new LabEmployeeRole());

        // Create a system-level admin (sysadmin) who can oversee everything.
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        // If you want to add sample request data, you can uncomment the following line:
        // addSampleRequestData(system);

        // Return the fully configured system.
        return system;
    }

}
