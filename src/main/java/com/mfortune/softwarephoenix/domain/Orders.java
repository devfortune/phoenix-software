package com.mfortune.softwarephoenix.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Orders extends AbstractEntity {

    private String productName;
    private Long quantity;
    private String deliveryAddress;
    private String phoneNumber;

}
