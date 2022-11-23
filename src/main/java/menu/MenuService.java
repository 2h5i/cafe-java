package menu;

public interface MenuService {
    void createMenu();

    MenuItem getMenuItem(int menuId, String menuName);

    Menu getMenu(int menuId);
}
