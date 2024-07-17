package kc.ecommerce.product.repository;

import kc.ecommerce.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin({"http://localhost:4200", "http://frontend-ecommerce:80"})
public interface ProductRepository extends JpaRepository<Product, Long> {
}
