package com.example.database.services;

import com.example.database.models.StudentModel;
import com.example.database.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    @Autowired
    StudentRepo repo;

    public List<StudentModel> getAllStudent() {
        return repo.findAll();
    }

    public StudentModel getById(int rolno){
        return repo.findById(rolno).orElse(new StudentModel());
    }

    public StudentModel addStudent(StudentModel student) {
        return repo.save(student);
    }

    public StudentModel updateStudent(StudentModel student) {
        return repo.save(student);
    }

    public String deleteStudent(int rolno) {
        repo.deleteById(rolno);
        return "success";
    }


    public ResponseEntity<List<StudentModel>> getByTechnology(String technology) {
        List<StudentModel> students = repo.findByTechnology(technology);
        System.out.println(technology+" "+students);
        if(students.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(students,HttpStatus.OK);
    }

    public List<StudentModel> getByGenderAndTechnology(String gender, String technology) {
        return repo.findByGenderAndTechnology(gender,technology);
    }
}
