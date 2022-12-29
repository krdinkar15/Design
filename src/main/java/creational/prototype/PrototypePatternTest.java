package creational.prototype;

import java.util.List;

public class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException {
    Employees employees=new Employees();
    employees.loadData();

    Employees empNew1=(Employees) employees.clone();
    Employees empNew2=(Employees) employees.clone();
    List<String> lst1=empNew1.getEmpList();
    lst1.add("john");

    List<String> lst2=empNew2.getEmpList();
    lst2.remove("Pankaj");

        System.out.println(employees.getEmpList());
        System.out.println(lst1);
        System.out.println(lst2);
    }
}
