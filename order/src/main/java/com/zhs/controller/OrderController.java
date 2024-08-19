package com.zhs.controller;

import com.zhs.server.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 89704 on 2024/8/14.
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    StockFeignService stockFeignService;

    @PostMapping("/addOrder")
    public String addOrder() {
        System.out.println("添加订单成功！OrderController_addOrder()_invoke. ");

        return stockFeignService.deductStock();
    }
}
