package com.data.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import com.data.Model.Category;
import com.data.Service.CategoryService;

@RestController
@RequestMapping("/api/categories/")
public class CategoryController {

    @Autowired
    private CategoryService cs;

  
    @PostMapping("/savedata")
    public String saveCategory(@RequestBody Category cg) {
        cs.register(cg);
        return "Category saved successfully";
    }

   
    @GetMapping("/getall")
    public Page<Category> getAllCategories(@RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return cs.getAllInfo(pageable);
    }

  
    @GetMapping("/getbyid/{id}")
    public Category getCategoryById(@PathVariable long id) {
        return cs.geCategorybyId(id);
    }

 
    @DeleteMapping("/deletebyId/{id}")
    public String deleteCategory(@PathVariable long id) {
        cs.deleteCategorybyId(id);
        return "Category deleted successfully";
    }

   
    @PutMapping("/updatebyId/{id}")
    public String updateCategory(@PathVariable long id, @RequestBody Category c1) {
        Category existingCategory = cs.geCategorybyId(id);
        if (existingCategory == null) {
            return "Category not found";
        }

        if (c1.getName() != null) {
            existingCategory.setName(c1.getName());
        }

        cs.register(existingCategory);
        return "Record updated successfully";
    }
}
