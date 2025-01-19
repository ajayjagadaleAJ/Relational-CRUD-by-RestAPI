package com.data.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import com.data.Model.Product;
import com.data.Service.ProductService;

@RestController
@RequestMapping("/api/product/")
public class ProductController {

    @Autowired
    ProductService ps;

    @PostMapping("/savedata")
    public String saveProduct(@RequestBody Product pt) {
        ps.register(pt);
        return "Registration Successful";
    }

    @GetMapping("/getall")
    public Page<Product> getAllProducts(@RequestParam(defaultValue = "0") int page,
                                        @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return ps.getAllInfo(pageable);
    }

    @GetMapping("/getbyid/{id}")
    public Product getProductById(@PathVariable long id) {
        return ps.geCategorybyId(id);
    }

    @DeleteMapping("/deletebyId/{id}")
    public String deleteProduct(@PathVariable long id) {
        ps.deleteCategorybyId(id);
        return "Product deleted successfully";
    }

    @PutMapping("/updatebyId/{id}")
    public String updateProduct(@PathVariable long id, @RequestBody Product p1) {
        Product updatedProduct = ps.updateSingleCategory(p1, id);
        if (updatedProduct != null) {
            return "Record Updated Successfully";
        } else {
            return "Product Not Found";
        }
    }
}
