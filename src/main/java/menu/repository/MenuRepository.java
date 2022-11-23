package menu.repository;

import menu.Menu;
import menu.MenuItem;

public interface MenuRepository {

    void saveMenu(Menu menu);

    Menu getMenu(int menuId);

    MenuItem getMenuItem(int menuId, String menuName);
}
