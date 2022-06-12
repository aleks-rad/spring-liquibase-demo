package ru.axl.springliquibasedemo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.axl.springliquibasedemo.entity.Item;
import ru.axl.springliquibasedemo.entity.Order;
import ru.axl.springliquibasedemo.entity.Product;
import ru.axl.springliquibasedemo.repositories.OrderRepository;
import ru.axl.springliquibasedemo.repositories.ProductRepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class TestController {

    private ProductRepository productRepository;
    private OrderRepository orderRepository;

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
        Product product = productRepository.findById(1L)
                .orElseThrow(() -> new RuntimeException("Не найден товар с id = 1"));

        Item item = new Item();
        item.setProduct(product);

        Order order = new Order();
        order.setItems(List.of(item));

        return orderRepository.save(order);
    }

}
