package com.data.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.data.Model.Category;
import com.data.Repository.CategoryRepository;
import com.data.Service.CategoryService;

@Service
public class CategoryDao implements CategoryService {

    @Autowired 
    CategoryRepository cr;

    @Override
    public void register(Category c1) {
        cr.save(c1);
    }

    @Override
    public Page<Category> getAllInfo(Pageable pageable) {
        return cr.findAll(pageable);
    }

    @Override
    public Category geCategorybyId(long id) {
        return cr.findById(id).orElse(null);
    }

    @Override
    public void deleteCategorybyId(long id) {
        cr.deleteById(id);
    }

    @Override
    public Category updateSingleCategory(Category category, long id) {
        Category existingCategory = cr.findById(id).orElse(null);
        if (existingCategory != null) {
            existingCategory.setName(category.getName());
            cr.save(existingCategory);
        }
        return existingCategory;
    }
}
