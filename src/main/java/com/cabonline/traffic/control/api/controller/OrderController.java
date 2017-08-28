package com.cabonline.traffic.control.api.controller;

import com.cabonline.traffic.control.model.OrderSearch;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.cabonline.traffic.control.api.ApiController.ORDER_API_PATH;

@RestController
@RequestMapping(ORDER_API_PATH)
public class OrderController {

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ResponseEntity findByEmail(@RequestBody OrderSearch orderSearch) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}

