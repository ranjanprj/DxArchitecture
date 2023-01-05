/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ranjanprj.dxarchitecture;

import lombok.Data;

/**
 *
 * @author prj
 */
@Data
public class CustomerDTO {
    private Long id;
    private String firstName,lastName;

    public CustomerDTO() {
    }

    
    
    public CustomerDTO(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


  
    
}
