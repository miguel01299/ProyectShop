package com.serviceslayer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entitylayer.Product;
import com.repositorylayer.ProductRepository;
import java.util.Optional;


@Service
public class ProductService implements IProductService{
 
	//Dependency injection
	@Autowired
	private ProductRepository productRepo;
	
	
	@Override
	public Product create(Product Product) {
		// TODO Auto-generated method stub
		return productRepo.save(Product);
	}

	@Override
	public Product update(Product Product) {
		// TODO Auto-generated method stub
		return productRepo.save(Product);
	}

	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Product> ProductOptional= productRepo.findById(id);
		return ProductOptional.orElse(null);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		//Here it gives me an error
		return (List<Product>) productRepo.findAll();
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		productRepo.deleteById(id);
		
	}

}
