package com.example.database.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@AllArgsConstructor
@Data
@Entity
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rolno;
    @NotNull(message = "name can't be empty")
    @Size(min=3,max=64,message = "name length must within the range of 3 to 64")
    private String name;
    @NotBlank(message = "technology required")
    private String technology;
    private String gender;
    public StudentModel(){

    }
}
