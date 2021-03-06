package com.mercadolivro.controller

import com.mercadolivro.controller.DTO.PostCustomerRequest
import com.mercadolivro.model.CustomerModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customer")
class CustomerController {

    @GetMapping
    fun getCustomer(): CustomerModel {
        return CustomerModel("1", "alan", "teste@teste@.com")
    }

    @PostMapping
    fun create(@RequestBody customer: PostCustomerRequest) {
        print(customer)
    }
}