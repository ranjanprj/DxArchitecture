/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ranjanprj.dxarchitecture;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author prj
 */
@RestController
public class CommandController {

    @Autowired
    CustomerServiceImpl custService;

    @GetMapping("/hello")
    public String hello() {
        CustomerDTO cDto = new CustomerDTO(0l, "john", "Bauer");
        Long id = custService.createCustomer(cDto);
        cDto = new CustomerDTO(id, "PPPPPPPPPP", "Bauer");

        custService.updateCustomer(cDto);

        System.out.println("DONE");
        return "hello there how arsdsde you" + cDto;
    }

    @PostMapping("/command")
    public ResponseEntity command(@RequestBody Map<String, Object> payload) {
        // validate
        System.out.println(payload);
        System.out.println(payload.get("name"));

        // write to kafka stream
        return ResponseEntity.ok().build();
    }
}
