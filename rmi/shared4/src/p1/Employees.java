/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p1;

/**
 *
 * @author Administrator
 */
public class Employees implements java.io.Serializable
{
    String eid,name,salary,mobile,doa,designation;

    public Employees() {
    }

    public Employees(String eid, String name, String salary, String mobile, String doa, String designation) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        this.mobile = mobile;
        this.doa = doa;
        this.designation = designation;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDoa() {
        return doa;
    }

    public void setDoa(String doa) {
        this.doa = doa;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
}
