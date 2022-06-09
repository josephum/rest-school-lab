package com.cydeo.dto;

import com.cydeo.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    private Long id;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String username;

    private String password;

    private LocalDate birthDay;

    private Status status;

    private AddressDTO address;

    private ParentDTO parent;

}