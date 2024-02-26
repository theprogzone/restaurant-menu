package com.anu.restaurantmenu.controller;

import com.anu.restaurantmenu.dto.MenuDTO;
import com.anu.restaurantmenu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/menu")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping
    public ResponseEntity<List<MenuDTO>> getMenu() {
        return new ResponseEntity<>(menuService.getMenu(), HttpStatus.OK);
    }
}
