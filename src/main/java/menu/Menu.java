package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<MenuItem> menuItems = new ArrayList<>();

    public Menu() {
        this.menuItems.add(new MenuItem("아메리카노", 1000));
        this.menuItems.add(new MenuItem("라떼", 1500));
        this.menuItems.add(new MenuItem("밀크티", 2000));
        this.menuItems.add(new MenuItem("밀크쉐이크", 3000));
        this.menuItems.add(new MenuItem("캐모마일", 4000));
    }

    public List<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public MenuItem getMenuItem(String menuName) {
        for (MenuItem menuItem : this.menuItems) {
            if (menuItem.getName().equals(menuName)) {
                return menuItem;
            }
        }

        throw new IllegalArgumentException("존재하지 않는 메뉴입니다.");
    }
}
