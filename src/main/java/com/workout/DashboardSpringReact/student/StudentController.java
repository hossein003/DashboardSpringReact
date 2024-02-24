package com.workout.DashboardSpringReact.student;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> getAllStudents(){
        List<Student> students = Arrays.asList(
                new Student(
                        1L,
                        "Hossein",
                        "hossein@gmail.com",
                        Gender.MALE ),
                new Student(
                        2L,
                        "John",
                        "John@gmail.com",
                        Gender.MALE ),
                new Student(
                        3L,
                        "Alex",
                        "Alex@gmail.com",
                        Gender.FEMALE )
        );
        return students;

    }
}
