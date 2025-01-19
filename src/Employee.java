import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    String firstName;
    int age;

    public Employee(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee("Ajay", 35);
        Employee e2 = new Employee("Vijay", 50);
        Employee e3 = new Employee("Vijay", 30);
        Employee e4 = new Employee("David", 51);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);


        List<Employee> sortedList = employeeList
                .stream().sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getAge))
                .collect(Collectors.toList());

        System.out.println(sortedList);


        List<Employee> sortedListGreaterThan40 = employeeList
                .stream()
                .filter(e -> e.getAge() > 40)
                .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getAge))
                .collect(Collectors.toList());

        System.out.println(sortedListGreaterThan40);


        employeeList.stream()
                .filter(e -> e.getAge() > 40)
                .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getAge))
                .forEach(System.out::println);


    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
