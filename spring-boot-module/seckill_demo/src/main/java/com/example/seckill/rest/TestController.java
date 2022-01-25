package com.example.seckill.rest;

import com.example.seckill.service.ProductService;
import com.example.seckill.util.Result;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KPQ
 * @date 2022/1/24
 */
@RestController
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final ProductService productService;

    @PostMapping("createOrder")
    public ResponseEntity createOrder(int prodId) {
        //1、方法加锁
//        productService.useLock(prodId);
        //2、普通方式
//        productService.createOrder(prodId);
        //3、数据库行锁
        productService.useDataBaseLock(prodId);
        return Result.success(null);
    }

}