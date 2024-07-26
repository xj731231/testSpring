package com.xj731231.testspring.controller;

import com.xj731231.testspring.entity.TacoOrder;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 * Author: jie.xu
 * Date: 2024/07/24 16:36
 */
@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/current")
    public String orderForm(Model model) {
        model.addAttribute("tacoOrder", new TacoOrder());
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid TacoOrder order, Errors errors) {
        if (errors.hasErrors()) {
            for (ObjectError error : errors.getAllErrors()) {
                log.info(error.getDefaultMessage());
            }
            return "orderForm";
        }
        log.info("Order submitted: " + order);
        return "redirect:/";
    }
}
