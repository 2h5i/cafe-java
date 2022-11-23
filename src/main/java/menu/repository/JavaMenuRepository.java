package menu.repository;

import menu.Menu;
import menu.MenuItem;

import java.util.HashMap;

public class JavaMenuRepository implements MenuRepository {

    private HashMap menuDB = new HashMap();

    @Override
    public void saveMenu(Menu menu) {
        int menuId = menuDB.size() + 1;
        this.menuDB.put(menuId, menu);
    }

    @Override
    public Menu getMenu(int menuId) {
        Menu menu = (Menu) this.menuDB.get(menuId);
        if (menu == null) throw new IllegalArgumentException("해당하는 메뉴가 없습니다.");

        return menu;
    }

    @Override
    public MenuItem getMenuItem(int menuId, String menuName) {
        Menu menu = (Menu) this.menuDB.get(menuId);
        if (menu == null) throw new IllegalArgumentException("메뉴가 존재하지 않습니다. 메뉴를 등록해주세요.");

        return menu.getMenuItem(menuName);
    }
}
