package com.mfortune.softwarephoenix.dto;

public class OrderDto {
    private String product;
    private Integer quantity;
    private String deliveryAddress;
    private String phoneNumber;

    public OrderDto() {
    }

    public OrderDto(String product, Integer quantity, String deliveryAddress, String phoneNumber) {
        this.product = product;
        this.quantity = quantity;
        this.deliveryAddress = deliveryAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
