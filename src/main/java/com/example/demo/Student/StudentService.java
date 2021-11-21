package com.example.demo.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<Student> result = new ArrayList<>();
        result.add(
                new Student(
                        1L,
                                "mariam",
                                "mariam.jamal@gmail.com",
                        LocalDate.of(2000, Month.AUGUST, 10 ),
                        21



                                )

                                )
                                );

    /*return List.of  (""hello world")";*/
        return result;



}

