package com.luv2code.ecommerce.dao;


import com.luv2code.ecommerce.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productType", path="product-type")

public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {
}
