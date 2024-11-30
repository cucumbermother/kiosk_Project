import com.koreait.coffee.view.MainView;

import java.time.LocalDateTime;

public class AppStart {
    public static void main (String[] args) {
        MainView mainView = new MainView();
        System.out.println(LocalDateTime.now());
        mainView.mainView();
    }
}
