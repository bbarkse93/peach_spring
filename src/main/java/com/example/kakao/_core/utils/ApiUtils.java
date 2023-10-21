package com.example.kakao._core.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

public class ApiUtils {

    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<>(1, "response", data);
    }

    public static ApiResult<?> error(String message, HttpStatus status) {
        return new ApiResult<>(-1, null, new ApiError(message, status.value()));
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class ApiResult<T> {
        private final int code;
        private final String msg;
        private final T data;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class ApiError {
        private final String message;
        private final int status;
    }
}