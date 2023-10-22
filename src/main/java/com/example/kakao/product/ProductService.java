package com.example.kakao.product;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.kakao._core.errors.exception.Exception404;
import com.example.kakao.product.ProductResponse.FindByIdDTO.LoginDTO;
import com.example.kakao.user.User;
import com.example.kakao.user.UserJPARepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class ProductService {

    private final ProductJPARepository productJPARepository;
    private final UserJPARepository userJPARepository;

    // (기능1) 상품 목록보기
    public List<ProductResponse.FindAllDTO> findAll() {
        List<Product> dtos = productJPARepository.findAll();

        List<ProductResponse.FindAllDTO> responseDTO = dtos.stream()
                .map(t -> new ProductResponse.FindAllDTO(t))
                .collect(Collectors.toList());

        return responseDTO;
    }

    // (기능2) 상품 상세보기
    public ProductResponse.FindByIdDTO findById(int id) {
        Product productPS = productJPARepository.findById(id)
                .orElseThrow(() -> new Exception404("해당 id의 상품을 찾을 수 없습니다 : " + id));

        return new ProductResponse.FindByIdDTO(productPS);
    }
}
