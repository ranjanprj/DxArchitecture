/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ranjanprj.dxarchitecture;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author prj
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private KafkaTemplate<Long, String> kafkaTemplate;

    @Override
    public Long createCustomer(CustomerDTO customerDto) {
        Customer c = new Customer(customerDto.getFirstName(), customerDto.getLastName());
        return customerRepository.save(c).getId();

    }

    @Override
    @Transactional
    public void updateCustomer(CustomerDTO customerDto) {
        customerRepository.findById(customerDto.getId()).ifPresent(
                customer -> {
                    customer.setFirstName(customerDto.getFirstName());
                    customer.setLastName(customerDto.getLastName());
                    this.raiseEvent(customerDto);
                }
        );
    }

    private void raiseEvent(CustomerDTO customerDto) {
        try {
            String value = OBJECT_MAPPER.writeValueAsString(customerDto);
            System.out.println("UPDATE EVENT");
            System.out.println(value);
            this.kafkaTemplate.sendDefault(customerDto.getId(), value);
            System.out.println("SENT TO KAFKA");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     @KafkaListener(topics = "command-event")
    public void consume(String customerStr) {
        try{
            System.out.println("Command Processor");
             System.out.println("RECEIVED FROM KAFKA !!!!!!!!!!!!");
             System.out.println(customerStr);
            CustomerDTO custDto = OBJECT_MAPPER.readValue(customerStr, CustomerDTO.class);
           
            System.out.println(custDto);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
