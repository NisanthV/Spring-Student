package com.example.database.controller;
import com.example.database.models.StudentModel;
import com.example.database.services.StudentServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class StudentController {

    @Autowired
    StudentServices services;

    @GetMapping("/student")
    public List<StudentModel> getAllStudent(){
        return services.getAllStudent();
    }

    @GetMapping("/student/{rolno}")
    public StudentModel getById(@PathVariable int rolno){
        return services.getById(rolno);
    }

    @GetMapping("/student/technology/{tech}")
    public ResponseEntity<List<StudentModel>> getByTechnology(@PathVariable("tech") String technology){
        return services.getByTechnology(technology);
    }

    @GetMapping("/student/tg")
    public List<StudentModel> getByGenderAndTechnology(@RequestParam("gender") String gender,@RequestParam("technology") String technology){
        return services.getByGenderAndTechnology(gender,technology);
    }

    @PostMapping("/student")
    public StudentModel addStudent(@Valid @RequestBody StudentModel student){
        return services.addStudent(student);
    }

    @PutMapping("/student")
    public StudentModel updateStudent(@Valid @RequestBody StudentModel student){
        return services.updateStudent(student);
    }

    @DeleteMapping("/student/{rolno}")
    public String deleteStudent(@PathVariable int rolno){
        return services.deleteStudent(rolno);
    }
}
