package kc.ecommerce.product.repository;

import kc.ecommerce.product.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin({"http://localhost:4200", "http://frontend-ecommerce:80"})
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    List<Product> findByNameContainsIgnoreCase(@Param("name") String name, Pageable pageable);
}
