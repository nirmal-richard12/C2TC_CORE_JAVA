package com.tns.ifet.assignments1;
import com.tns.ifet.assignments1.employee.Developer;
import com.tns.ifet.assignments1.employee.Manager;
import com.tns.ifet.assignments1.employeeutilities.EmployeeUtilities;
public class AssignmentMain {
 public static void main(String[] args) {
 Manager manager = new Manager("John", 101, 90000, "Sales");
 Developer developer = new Developer("Alice", 102, 80000, "Java");
 EmployeeUtilities.printEmployeeDetails(manager);
 EmployeeUtilities.printEmployeeDetails(developer);
 }
}