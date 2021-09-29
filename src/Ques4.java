interface EmployeeDetails{
    Employee makeEmp(String name,Integer age,String dept);
}
class Employee{
    String name;
    Integer age;
    String dept;
    public Employee(String name, Integer age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                '}';
    }
}
public class Ques4 {
    public static void main(String[] args) {
        EmployeeDetails employeeRef = Employee::new;
        Employee emp=employeeRef.makeEmp("Awanish ",22,"QualityEngineering");
        System.out.println(emp.toString());
        Employee emp2=new Employee("Ashish", 23 ,".Net");
        System.out.println(emp2.toString());
    }
}
