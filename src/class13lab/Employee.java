/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class13lab;

/**
 *
 * @author aquimby1
 */
public class Employee {
    private String name;
    private String Job;
    private String Id;

    public Employee(String name, String Job, String Id) {
        this.name = name;
        this.Job = Job;
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    
}
