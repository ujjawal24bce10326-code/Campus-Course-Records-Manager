
package edu.ccrm.service;

import edu.ccrm.domain.Student;
import java.util.*;

public class StudentService {
    private final Map<String, Student> students = new LinkedHashMap<>(); // id->student

    public Student addStudent(String id, String regNo, String name, String email){
        Student s = new Student(id, regNo, name, email);
        students.put(id, s);
        return s;
    }

    public Optional<Student> findById(String id){ return Optional.ofNullable(students.get(id)); }
    public List<Student> listAll(){ return new ArrayList<>(students.values()); }

    public void deactivate(String id){
        Student s = students.get(id);
        if(s!=null) s.deactivate();
    }
}
