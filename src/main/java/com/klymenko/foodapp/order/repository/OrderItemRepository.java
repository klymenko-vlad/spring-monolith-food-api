package com.klymenko.foodapp.order.repository;

import com.klymenko.foodapp.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    @Query("Select Case WHEN count(OrderItem) > 0 THEN true ELSE false end " +
            "FROM OrderItem OrderItem " +
            "WHERE OrderItem.order.id = :orderId AND OrderItem.menu.id = :menuId"
    )
    boolean existsOrderItemByIdAndMenuId(
            @Param("orderId") Long orderId,
            @Param("menuId") Long menuId
    );
}
