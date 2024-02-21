package com.example.test.model;

import lombok.*;
import java.time.LocalDate;

@Data
@Builder
public class User {
    @NonNull
    private String nameOfAccount;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    @NonNull
    private String email;
    private int age;
}
