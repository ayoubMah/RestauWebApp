package org.company.restau.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuID;

    @OneToMany(mappedBy = "menu")
    private Set<MenuItem> menuItems = new HashSet<>();

    // Getters and Setters

    public Long getMenuID() {
        return menuID;
    }

    public void setMenuID(Long menuID) {
        this.menuID = menuID;
    }

    public Set<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(Set<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
