import menu.JavaMenuService;
import menu.Menu;
import menu.MenuInterface;
import menu.MenuService;
import presentation.UserInterface;

import java.util.Scanner;

public class CafeJavaApplication {
    public static void main(String[] args) {
//        Menu menu = new Menu();
//        MenuItem menuItem = menu.getMenuItem("아메리카노");
//        System.out.println(menuItem.getName());
//
//        MenuRepository menuRepository = new JavaMenuRepository();
//
//        menuRepository.saveMenu(menu);
//        menuRepository.saveMenu(menu);
//        menuRepository.saveMenu(menu);
//        System.out.println(menuRepository.getMenu(1).getMenuItem("아메리카노").getName());
        UserInterface UI = new UserInterface();
        UI.run();

        MenuService menuService = new JavaMenuService();


        while (true) {
            Scanner input = new Scanner(System.in);
            String firstInput = input.next();
            if (firstInput.equals("1")) {
                menuService.createMenu();
            } else if (firstInput.equals("2")) {
                Menu menu = menuService.getMenu(1);
                new MenuInterface(menu);
            } else if (firstInput.equals("q")) {
                System.out.println("시스템 종료");
                System.exit(0);
            }
        }
    }
}
