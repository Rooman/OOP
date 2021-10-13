import javax.print.attribute.HashDocAttributeSet;
import java.beans.beancontext.BeanContextServiceProviderBeanInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        var value = 12;


    }

    static void print(Cat cat) {
        System.out.print("This is the cat! ");
        System.out.print("id = " + cat.id);
        System.out.print(", age = " + cat.age);
        System.out.print(", name = " + cat.name);
        System.out.print(", weight = " + cat.weight);
        System.out.println(", isHungry = " + cat.hungry);
    }
}

class Person {
    String name;
    int age;

}

class Employee extends Person {
    double payedTaxes;
    String inn;
}

class LuxoftEmployee extends Employee {
    String position;
    String project;
    String lineManager;
    int tableTennisLevel;
}

class OPPTest {
    public static void main(String[] args) {
        LuxoftEmployee luxoftEmployee = new LuxoftEmployee();
        Employee employee = luxoftEmployee;
        Person person = new Person();

        if (person instanceof LuxoftEmployee) {
            LuxoftEmployee luxoftEmployeeLink = (LuxoftEmployee) person;
        }


    }
}