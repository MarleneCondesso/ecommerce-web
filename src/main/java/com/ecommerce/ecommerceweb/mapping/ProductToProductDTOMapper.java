package com.ecommerce.ecommerceweb.mapping;

import com.ecommerce.ecommerceweb.dto.ProductDTO;
import com.ecommerce.ecommerceweb.model.Category;
import com.ecommerce.ecommerceweb.model.Product;
import org.mapstruct.Mapper;

@Mapper
public class ProductToProductDTOMapper {



    public ProductDTO Map(Product product, Category category){

        ProductDTO productDTO = new ProductDTO();

        productDTO.setId(product.getId());
        productDTO.setDescription(product.getDescription());
        productDTO.setName(product.getName());
        productDTO.setImage(product.getImage());
        productDTO.setPrice(product.getPrice());
        productDTO.setCategory_id(category.getId());

        return productDTO;
    }
}
