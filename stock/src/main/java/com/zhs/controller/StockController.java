package com.zhs.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 89704 on 2024/8/14.
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @PostMapping("/deductStock")
    public String deductStock() {
        System.out.println("扣减库存成功！");
        return "StockController_deductStock()_invoke. ";
    }

}