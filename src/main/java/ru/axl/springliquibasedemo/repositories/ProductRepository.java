package ru.axl.springliquibasedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.axl.springliquibasedemo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
