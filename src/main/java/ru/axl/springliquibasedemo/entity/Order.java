package ru.axl.springliquibasedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "order_items",
        joinColumns = @JoinColumn(name = "order_id", referencedColumnName = "order_id"),
        inverseJoinColumns = @JoinColumn(name = "item_id", referencedColumnName = "item_id"))
    private Collection<Item> items;

}
