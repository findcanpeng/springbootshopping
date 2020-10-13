package edu.sicau.shopping.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tbclass {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String address;
    private String qq;
    private String email;
}
