package fr.wildcodeschool.students.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.wildcodeschool.students.models.Student;

@Repository
public class StudentRepoBdx implements StudentDao {

    @Override
    public List<Student> findAll(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Thomas"));
        students.add(new Student("Louis"));
        students.add(new Student("Mehdi"));
        return students;
    }
}
