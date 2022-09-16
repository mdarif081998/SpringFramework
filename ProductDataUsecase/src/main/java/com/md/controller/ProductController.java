package com.md.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.md.entity.Product;
import com.md.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	
	@RequestMapping("/insert")
	public String insert() {
		return "register";
	}
	
	@RequestMapping("/register")
	public String addProduct(@ModelAttribute("product") Product product, ModelMap model) {
		int res=service.InsertProduct(product);
		model.addAttribute("Result", "Product Added Successfully with Id: " + res);
		return "result";
	}
	
	@RequestMapping("/updateid")
	public String updateid() {
		return "updateid";
	}
	
	@RequestMapping("/updating")
	public String updating(@RequestParam("id") int id, ModelMap model) {
		Product product = service.getProductById(id);
		model.addAttribute(product);
		return "updateform";
	}
	@RequestMapping("/update")
	public String update(@ModelAttribute("product") Product product, ModelMap model) {
		service.updateProduct(product);
		int id= product.getId();
		model.addAttribute("Result", "Product Updated Successfully with Id: " + id);
		return "result";
	}
	
	@RequestMapping("/deleting")
	public String delete() {
		return "delete";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int id, ModelMap model) {
		service.deleteProduct(id);
		model.addAttribute("Result", "Product Deleted Successfully with Id: " + id);
		return "result";
	}
	
	@RequestMapping("/productId")
	public String getProduct() {
		return "productid";
	}
		
	@RequestMapping("/product")
	public String getProduct(@RequestParam("id") int id, ModelMap model) {
		Product product = service.getProductById(id);
		model.addAttribute("Product", product);
		return "details";
	}
	
	@RequestMapping("/products")
	public String getAllProducts(ModelMap model) {
		List<Product> products = service.getAllProducts();
		model.addAttribute("Products", products);
		return "allproducts";
	}
	

	public ProductService getService() {
		return service;
	}

	public void setService(ProductService service) {
		this.service = service;
	}
	


}
