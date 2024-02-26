package com.anu.restaurantmenu.repository;

import com.anu.restaurantmenu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

    List<Menu> findAllByIsActive(boolean isActive);
}
