package com.example.kakao.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ProductResponse {

    // (기능1) 상품 목록보기
    @ToString
    @Getter
    @Setter
    public static class FindAllDTO {

        private int id;

        private String productName;

        private Integer price;

        private String category;

        private String productPicUrl;

        public FindAllDTO(Product product) {
            this.id = product.getId();
            this.productName = product.getProductName();
            this.price = product.getPrice();
            this.category = product.getCategory();
            this.productPicUrl = product.getProductPicUrl();
        }

    }

    // (기능2) 상품 상세보기
    @ToString
    @Getter
    @Setter
    public static class FindByIdDTO {

    }

}
