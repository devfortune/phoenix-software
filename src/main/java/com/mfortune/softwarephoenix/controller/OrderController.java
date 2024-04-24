package com.mfortune.softwarephoenix.controller;

import com.mfortune.softwarephoenix.dto.OrderDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PutMapping
    public ResponseEntity<?> saveOrder(OrderDto orderDto) {

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
