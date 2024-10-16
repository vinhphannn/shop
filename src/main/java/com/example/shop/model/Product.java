package com.example.shop.model;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Cột 'id' trong bảng
    private String name; // Cột 'name' trong bảng
    private double price; // Cột 'price' trong bảng

    // Getters, Setters, Constructors
}
