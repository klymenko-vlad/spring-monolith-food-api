package com.klymenko.foodapp.carts.repository;

import com.klymenko.foodapp.carts.entity.Cart;
import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Optional<Cart> findCartByUser_Id(Long userId, Limit limit);

}
