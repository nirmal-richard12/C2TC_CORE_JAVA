package com.tns.ifet.assignments2;
import com.tns.ifet.assignments2.employee.Manager;
import com.tns.ifet.assignments2.employee.Developer;

import com.tns.ifet.assignments2.employeeutilities.EmployeeUtilities;
public class AssignmentMain {
 public static void main(String[] args) {
 Manager manager = new Manager("John", 101, 90000, "Sales");
 Developer developer = new Developer("Alice", 102, 80000, "Java");
 EmployeeUtilities.printEmployeeDetails(manager);
 EmployeeUtilities.printEmployeeDetails(developer);
 }
}