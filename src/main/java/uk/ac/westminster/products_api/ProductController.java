package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @Service
public class ProductService {
        private List<Product> products = new ArrayList<>();

        public ProductService() {
            products.add(new Product(1L, "MUG", 8.50));
        }
    }
    @Component
    public class SlugGenerator {

    }
}
    @Component
    public class SlugGenerator {

    }
