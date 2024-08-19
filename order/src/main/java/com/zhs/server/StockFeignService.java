package com.zhs.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by 89704 on 2024/8/14.
 */


@FeignClient(name = "stockService", path = "/stock")
public interface StockFeignService {

    @PostMapping("/deductStock")
    String deductStock();
}
