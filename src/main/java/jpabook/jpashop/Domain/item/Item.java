package jpabook.jpashop.Domain.item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {
    @Id @GeneratedValue
    private Long id;
}