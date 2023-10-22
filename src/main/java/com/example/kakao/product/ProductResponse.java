package com.example.kakao.product;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.example.kakao.user.User;
import com.example.kakao.user.UserRequest.LoginDTO;

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
        private int id;
        private String productName;
        private Integer price;
        private String category;
        private String productPicUrl;
        private String content;

        private LoginDTO user;

        public FindByIdDTO(Product product) {
            this.id = product.getId();
            this.productName = product.getProductName();
            this.price = product.getPrice();
            this.category = product.getCategory();
            this.productPicUrl = product.getProductPicUrl();
            this.content = product.getContent();
            this.user = new LoginDTO(product.getUser());
        }

        @Getter
        @Setter
        class LoginDTO {
            private Integer id;
            private String username;
            private String userPicUrl;
            private String location;

            public LoginDTO(User user) {
                this.id = user.getId();
                this.username = user.getUsername();
                this.userPicUrl = user.getUserPicUrl();
                this.location = user.getLocation();
            }
        }
    }
}
