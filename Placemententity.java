package placementservice;

 import jakarta.persistence.*;

 public class Placement {
 
     private Long id;

     private String companyName;
     private String jobRole;
     private double packageOffered;

     public Placement() {}

     public Placement(String companyName, String jobRole, double packageOffered) {
         this.companyName = companyName;
         this.jobRole = jobRole;
         this.packageOffered = packageOffered;
     }

     // Getters and Setters
     public Long getId() { return id; }
     public void setId(Long id) { this.id = id; }

     public String getCompanyName() { return companyName; }
     public void setCompanyName(String companyName) { this.companyName = companyName; }

     public String getJobRole() { return jobRole; }
     public void setJobRole(String jobRole) { this.jobRole = jobRole; }

     public double getPackageOffered() { return packageOffered; }
     public void setPackageOffered(double packageOffered) { this.packageOffered = packageOffered; }

 }