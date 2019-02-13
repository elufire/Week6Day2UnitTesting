package com.example.week6day2unittesting;

import java.util.HashMap;

public class CalculatePayroll {
    private Employee employee;

    public CalculatePayroll(Employee employee) {
        this.employee = employee;
    }

    public CalculatePayroll() {
    }

    public HashMap toHashMap(){
        HashMap<String, String> hmap = new HashMap<>();

        hmap.put("name", employee.getFullName().getFirstName()+ " " + employee.getFullName().getLastname());
        hmap.put("address", employee.getAddress().getStreet() + " " +
                employee.getAddress().getCity() + " " + employee.getAddress().getState() + " " +
                employee.getAddress().getCountry() + " " + employee.getAddress().getPostal());

        if(employee.getTimeSheet().isHourly()){
            Float temp = employee.getTimeSheet().getPayrate()*employee.getTimeSheet().getHoursWorked();
            hmap.put("pay", temp.toString());
        }else{
            Float temp = employee.getTimeSheet().getPayrate()*40;
            hmap.put("pay", temp.toString());
        }
        return hmap;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
