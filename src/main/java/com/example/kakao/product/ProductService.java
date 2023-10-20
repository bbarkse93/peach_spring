package com.example.kakao.product;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.kakao._core.errors.exception.Exception404;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class ProductService {

    private final ProductJPARepository productJPARepository;

    // (기능1) 상품 목록보기
    public List<ProductResponse.FindAllDTO> findAll() {


        return null;
    }

    // (기능2) 상품 상세보기
    public ProductResponse.FindByIdDTO findById() {

        return null;
    }
}
