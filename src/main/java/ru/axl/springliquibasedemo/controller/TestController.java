package ru.axl.springliquibasedemo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.axl.springliquibasedemo.entity.DataBaseChangeLog;
import ru.axl.springliquibasedemo.entity.Item;
import ru.axl.springliquibasedemo.entity.Order;
import ru.axl.springliquibasedemo.entity.Product;
import ru.axl.springliquibasedemo.repositories.DataBaseChangeLogRepository;
import ru.axl.springliquibasedemo.repositories.OrderRepository;
import ru.axl.springliquibasedemo.repositories.ProductRepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class TestController {

    private ProductRepository productRepository;
    private OrderRepository orderRepository;
    private DataBaseChangeLogRepository dataBaseChangeLogRepository;

    @GetMapping("/product/all")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/order/all")
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/order/create")
    public Order createOrder() {
        Product product1 = productRepository.findById(1L)
                .orElseThrow(() -> new RuntimeException("Не найден товар с id = 1"));
        Product product2 = productRepository.findById(2L)
                .orElseThrow(() -> new RuntimeException("Не найден товар с id = 2"));
        Product product3 = productRepository.findById(3L)
                .orElseThrow(() -> new RuntimeException("Не найден товар с id = 3"));

        Order order = new Order();
        order.setItems(List.of(
                Item.builder().product(product1).build(),
                Item.builder().product(product2).build(),
                Item.builder().product(product3).build()
        ));

        return orderRepository.save(order);
    }

    @GetMapping("/liquibase/changelog")
    public List<DataBaseChangeLog> getChangelog() {
        return dataBaseChangeLogRepository.findAll();
    }

}
