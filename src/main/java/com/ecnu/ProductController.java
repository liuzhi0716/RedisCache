package com.ecnu;

import com.ecnu.dao.domain.Product;
import com.ecnu.dao.domain.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by admin on 2017/7/10.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductMapper productMapper;
  @GetMapping("{id}")
  public Product getProductInfo(
          @PathVariable("id")
                  Long productId) {
      // TODO
      return productMapper.select(productId);
  }
    @PutMapping("/{id}")
    public Product updateProductInfo(@PathVariable("id")Long productId,
            @RequestBody Product newProduct) {
        // TODO
        Product product = productMapper.select(productId);
        if (product == null) {
            throw new ProductNotFoundException(productId);
        }
        product.setName(newProduct.getName());
        product.setPrice(newProduct.getPrice());
        productMapper.update(product);
        return product;
    }

}
