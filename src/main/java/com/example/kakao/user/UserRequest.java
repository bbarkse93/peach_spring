package com.example.kakao.user;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class UserRequest {
    @Getter
    @Setter
    @ToString
    public static class JoinDTO {

        @NotEmpty
        @Email(message = "유효한 이메일 주소를 입력하세요.")
        private String email;

        @NotEmpty
        @Size(min = 8, max = 20, message = "8에서 20자 이내여야 합니다.")
        private String password;

        @NotEmpty
        private String username;

        private String userPicUrl;
        private String location;

        public User toEntity() {
            return User.builder()
                    .username(username)
                    .password(password)
                    .userPicUrl(userPicUrl)
                    .location(location)
                    .build();
        }
    }

    @Getter
    @Setter
    @ToString
    public static class LoginDTO {


        @Column(unique = true) // 중복된 이메일 주소를 막기 위한 설정
        private String username;

        @NotEmpty
        @Size(min = 8, max = 20, message = "8에서 20자 이내여야 합니다.")
        private String password;
    }
}