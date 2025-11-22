package com.klymenko.foodapp.review.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.klymenko.foodapp.auth_users.entity.User;
import com.klymenko.foodapp.menu.entity.Menu;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewDTO {
    private Long id;

    private User user;

    private String userName;

    @NotNull(message = "Rating is required")
    @Min(1)
    @Max(10)
    private Integer rating;

    @Size(max=500, message = "Comment cannot exceed 500 characters")
    private String comment;

    private LocalDateTime createdAt;

    private Long orderId;
    private Long menuId;
}
