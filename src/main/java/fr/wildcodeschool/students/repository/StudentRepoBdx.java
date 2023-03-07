package fr.wildcodeschool.students.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.wildcodeschool.students.models.Student;

@Repository
public class StudentRepoBdx implements StudentDao {

    List<Student> students = new ArrayList<>(
        Arrays.asList(
        new Student("Bdx1"),
        new Student("Bdx2"),
        new Student("Bdx3")));
    
    @Override
    public List<Student> findAll(){
        return students;
    }
}
