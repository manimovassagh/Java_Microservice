package com.github.manimovassagh.customer.models;


import lombok.*;

@Data
@Builder
public class Customer {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

}
