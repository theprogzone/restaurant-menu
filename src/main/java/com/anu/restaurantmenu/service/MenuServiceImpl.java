package com.anu.restaurantmenu.service;

import com.anu.restaurantmenu.dto.MenuDTO;
import com.anu.restaurantmenu.entity.Menu;
import com.anu.restaurantmenu.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;

    @Override
    public List<MenuDTO> getMenu() {
        List<Menu> menuList = menuRepository.findAllByIsActive(true);
        return menuList.stream().map(m -> new MenuDTO(m.getId(), m.getItemName(), m.getPrice())).toList();
    }
}
