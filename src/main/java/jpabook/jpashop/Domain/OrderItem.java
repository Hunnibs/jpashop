package jpabook.jpashop.Domain;

import jpabook.jpashop.Domain.item.Item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderItem {
    @Id @GeneratedValue
    private Long id;

    private Item item;

    private Order order;

    private int orderPrice;
    private int count;
}
