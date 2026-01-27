import java.util.ArrayList;
import java.util.List;

public class Exam3 {
public static void main(String[] args) {
    List<Employee> list = new ArrayList<>();
    list.add(Employee.("後藤", 30));
    list.add(Employee.("後藤", 30));
    list.add(Employee.("後藤", 30));
    list.add(Employee.("後藤", 30));

    for (Employee employee : list) {
        System.out.println(employee.getName);
    }


}
}

// ("後藤", 30);
//     list.add("山田", 28);
//     list.add("佐藤", 25);
//     list.add("田中", 19);
