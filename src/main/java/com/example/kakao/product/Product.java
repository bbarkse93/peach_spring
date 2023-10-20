package com.example.kakao.product;

import lombok.*;

import java.sql.Timestamp;
import javax.persistence.*;



@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="product_tb")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false)
    private String productName;

    private Integer price;

    private String category;

    @Column(length = 1000, nullable = false)
    private String content;

    private String productPicUrl;

    private Timestamp createdAt;


    @Builder
    public Product(int id, String productName, Integer price, String category, String content, String productPicUrl, Timestamp createdAt) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.content = content;
        this.productPicUrl = productPicUrl;
        this.createdAt = createdAt;
    }
}
