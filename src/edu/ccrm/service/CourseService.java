
package edu.ccrm.service;

import edu.ccrm.domain.Course;
import edu.ccrm.domain.Semester;
import java.util.*;
import java.util.stream.Collectors;

public class CourseService {
    private final Map<String, Course> courses = new LinkedHashMap<>(); // code->course

    public Course add(Course c){ courses.put(c.getCode(), c); return c; }
    public Optional<Course> find(String code){ return Optional.ofNullable(courses.get(code)); }
    public List<Course> listAll(){ return new ArrayList<>(courses.values()); }

    public List<Course> filterByInstructorName(String name){
        return courses.values().stream().filter(c -> c.getInstructor()!=null && c.getInstructor().getFullName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }

    public List<Course> filterByDept(String dept){
        return courses.values().stream().filter(c -> c.getDepartment().equalsIgnoreCase(dept)).collect(Collectors.toList());
    }

    public List<Course> filterBySemester(Semester sem){
        return courses.values().stream().filter(c -> c.getSemester()==sem).collect(Collectors.toList());
    }
}
