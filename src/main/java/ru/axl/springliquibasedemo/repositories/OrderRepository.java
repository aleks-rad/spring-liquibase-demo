package ru.axl.springliquibasedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.axl.springliquibasedemo.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
