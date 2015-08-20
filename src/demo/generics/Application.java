package demo.generics;

import demo.generics.service.Service;
import demo.generics.service.ServiceImpl;
import demo.generics.dao.Table;
import demo.generics.domain.Person;
import demo.generics.domain.Student;
import demo.generics.util.ServiceUtil;

/**
 * Created by Atkalikar on 20-08-2015.
 */
public class Application {
    public static void main(String[] args) {
        Service<Person> personService = new ServiceImpl<>();
        personService.setTable(new Table<>());

        personService.insert(new Person("person1", 25));
        personService.insert(new Person("person2", 35));
        ServiceUtil.printList(personService.getAll());

        Service<Student> studentService = new ServiceImpl<>();
        studentService.setTable(new Table<>());
        studentService.insert(new Student("student1", 18, "school1"));
        studentService.insert(new Student("student2", 20, "school2"));
        ServiceUtil.printList(studentService.getAll());
    }
}
