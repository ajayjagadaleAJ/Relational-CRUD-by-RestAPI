package com.data.Service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.data.Model.Product;

public interface ProductService {
   
	public void register(Product p1);
   
	public Page<Product> getAllInfo(Pageable pageable); 
   
	public Product geCategorybyId(long id);
    
    public void deleteCategorybyId(long id);
   
    public Product updateSingleCategory(Product product, long id);
}
