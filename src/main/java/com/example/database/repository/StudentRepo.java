package com.example.database.repository;

import com.example.database.models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<StudentModel,Integer> {

    List<StudentModel> findByTechnology(String technology);

    @Query(nativeQuery = true,value = "SELECT * FROM student_model WHERE gender = :gender AND technology = :technology")
    List<StudentModel> findByGenderAndTechnology(String gender,String technology);
}
