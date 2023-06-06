package org.elsys_bg.biznis.controller;

import lombok.RequiredArgsConstructor;
import org.elsys_bg.biznis.service.impl.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class ProductController{
    private final ProductServiceImpl productService;

    @GetMapping("/getAll")
    public ResponseEntity<String> getAllProducts(){
        String htmlContent = "";

        try{
            htmlContent = productService.findAll().toString();
        }catch(Exception e){
            System.out.println(e);
            return new ResponseEntity<>("Error 500: Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(htmlContent, HttpStatus.OK);
    }
}