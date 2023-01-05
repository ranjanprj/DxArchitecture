/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ranjanprj.dxarchitecture;

/**
 *
 * @author prj
 */
public interface CustomerService {
    Long createCustomer(CustomerDTO customerDto);
    void updateCustomer(CustomerDTO customerDto);
}