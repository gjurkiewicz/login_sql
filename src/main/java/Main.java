import jurkiewicz.grzegorz.repository.UserRepo;
import jurkiewicz.grzegorz.view.GUI;

public class Main {
    public static void main(String[] args) {
        GUI.helloScreen();
        UserRepo.initFakeData();
    }
}
