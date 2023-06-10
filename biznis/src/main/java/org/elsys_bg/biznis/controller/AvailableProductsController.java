package org.elsys_bg.biznis.controller;

import org.elsys_bg.biznis.entity.AvailableProducts;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/available-products")
public class AvailableProductsController {
    private final AvailableProducts availableProducts;

    public AvailableProductsController(AvailableProducts availableProducts) {
        this.availableProducts = availableProducts;
    }

    @PostMapping
    public void addProduct(@RequestParam Long productId, @RequestParam int quantity) {
        availableProducts.addProduct(productId, quantity);
    }

    @DeleteMapping("/{productId}")
    public void removeProduct(@PathVariable Long productId) {
        availableProducts.removeProduct(productId);
    }

    @GetMapping("/{productId}")
    public boolean hasProduct(@PathVariable Long productId) {
        return availableProducts.hasProduct(productId);
    }

    @GetMapping("/{productId}/quantity")
    public int getProductQuantity(@PathVariable Long productId) {
        return availableProducts.getProductQuantity(productId);
    }

    @GetMapping
    public Map<Long, Integer> getAllProducts() {
        return availableProducts.getAllProducts();
    }
}
