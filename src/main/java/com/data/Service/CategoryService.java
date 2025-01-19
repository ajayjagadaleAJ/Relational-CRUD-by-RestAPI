package com.data.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.data.Model.Category;

public interface CategoryService {
    
   public void register(Category c1);
    
   public Page<Category> getAllInfo(Pageable pageable);
    
   public Category geCategorybyId(long id);
    
   public void deleteCategorybyId(long id);
    
   public Category updateSingleCategory(Category category, long id);
}
