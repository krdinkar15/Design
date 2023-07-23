package designPatterns.structural.adapter.cardDesigner;

public class Main {
    public static void main(String[] args) {
        // Using class / Two-way adapter :
        EmployeeClassAdapter employeeClassAdapter=new EmployeeClassAdapter();
        populateEmployeeData(employeeClassAdapter);
        BusinessCardDesigner designer=new BusinessCardDesigner();
        String card=designer.designCard(employeeClassAdapter);
        System.out.println(card);

        // Using Object adapter
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter=new EmployeeObjectAdapter(employee);
        card=designer.designCard(objectAdapter);
        System.out.println(card);
    }

    public static void populateEmployeeData(Employee employee)
    {
        employee.setFullName("Raj kr");
        employee.setJobTitle("SDE-1");
        employee.setOfficeLocation("Gurgaon");
    }

}
