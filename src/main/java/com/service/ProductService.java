package com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Service;

import com.entity.Product;
import com.entity.Product;
import com.entity.Role;
import com.exception.CommonException;
import com.repository.ProductRepository;
import com.repository.ProductRepository;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService implements IProductService {

	// Dependency injection
	@Autowired
	private ProductRepository productRepo;

	public ProductService(ProductRepository productRepo) {
		super();
		this.productRepo = productRepo;
	}

	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Product> productOptional = productRepo.findById(id);
		Product product = null;
		if (productOptional.isPresent()) {
			product = productOptional.get();
		} else {
			throw new RuntimeException(" Product not found for id : " + id);
		}
		return product;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		// Here it gives me an error
		return (List<Product>) productRepo.findAll();

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		productRepo.deleteById(id);

	}

	@Override
	public Page<Product> findPaginated(int pageNo, int pageSize) {
		PageRequest pageable = PageRequest.of(pageNo - 1, pageSize);
		return this.productRepo.findAll(pageable);
	}

}
