package scholls_for_portal;

import java.util.*;

public class LoginAndLogout {
    String userName;
    String password;
    HashMap<String, String> usernameAndPassword = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void loginRegister() {
        System.out.println("please enter username: ");
        userName = scanner.nextLine();
        System.out.println("please enter password: ");
        password = scanner.nextLine();
        usernameAndPassword.put(userName, password);


        System.out.println("Successfully entered ✔");
    }

    public void loginEntered() {
        System.out.print("Please enter username:  ");
        userName = scanner.nextLine();
        System.out.print("Please enter password:  ");
        password = scanner.nextLine();
        for (Map.Entry<String, String> entry : usernameAndPassword.entrySet()) {
            if (userName.equals(entry.getValue()) && password.equals(entry.getKey())) {
                System.out.println("successfully entered ✔");
            }else{
                System.out.println("No such register ...!");
            }
        }
    }

    public static void main(String[] args) {
        LoginAndLogout lg = new LoginAndLogout();
        lg.loginRegister();
        lg.loginEntered();
    }
}
