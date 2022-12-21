package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.entity.Size;
import com.service.SizeService;

import java.util.List;

@RestController
@RequestMapping("/api/size") // http://localhost:8080/api/size
public class SizeController {

	@Autowired
	private SizeService sizeService;

	// http://localhost:8080/api/size
	@PostMapping
	public Size addSize(Size c) {
		return sizeService.create(c);
	}

	@PutMapping("/{sizeId}") // http://localhost:8080/api/size/10 PUT
	public Size updateSize() {
		return null;
	}

	@GetMapping // http://localhost:8080/api/size GET
	public List<Size> getAllSize() {
		return null;
	}

	@GetMapping("/{sizeId}") // http://localhost:8080/api/size GET
	public Size getSizeById() {

		return null;
	}

	@DeleteMapping("/{sizeId}") // http://localhost:8080/api/size DELETE
	public void deleteSize() {

	}
}