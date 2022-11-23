package menu;

import menu.repository.JavaMenuRepository;
import menu.repository.MenuRepository;

public class JavaMenuService implements MenuService {

    private final MenuRepository menuRepository = new JavaMenuRepository();

    @Override
    public void createMenu() {
        menuRepository.saveMenu(new Menu());
    }

    @Override
    public MenuItem getMenuItem(int menuId, String menuName) {
        return menuRepository.getMenuItem(menuId, menuName);
    }

    @Override
    public Menu getMenu(int menuId) {
        return menuRepository.getMenu(menuId);
    }
}
