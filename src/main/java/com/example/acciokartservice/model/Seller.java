package com.example.acciokartservice.model;

import com.example.acciokartservice.Enum.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Seller {
//    declaration of entity class
    @Id
    int id;
    String name;
    String mobileNumber;
    int age;
    Gender gender;
    String panNo;
//    String city;
}

