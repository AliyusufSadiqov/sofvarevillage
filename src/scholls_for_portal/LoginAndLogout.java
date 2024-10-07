package scholls_for_portal;

import java.util.*;

public class LoginAndLogout {
    String userName;
    String password;
    HashMap<String, String> usernameAndPassword = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void login() {
        System.out.println("please enter username: ");
        userName = scanner.nextLine();
        System.out.println("please enter password: ");
        password = scanner.nextLine();
        usernameAndPassword.put(userName, password);

        for (Map.Entry<String, String> entry : usernameAndPassword.entrySet()) {
            System.out.println("username: " + entry.getKey() + " password: " + entry.getValue());

        }

    }

    public static void main(String[] args) {
        LoginAndLogout lg = new LoginAndLogout();
        lg.login();
    }
}
