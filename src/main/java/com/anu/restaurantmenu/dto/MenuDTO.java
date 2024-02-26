package com.anu.restaurantmenu.dto;

import java.math.BigDecimal;

public record MenuDTO(Long id, String itemName, BigDecimal price) {
}
