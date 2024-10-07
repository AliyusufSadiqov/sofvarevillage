package scholls_for_portal;

import java.util.*;

public class LoginAndLogout {
    String userName;
    String password;

    static public HashMap<String, String> usernameAndPassword = new HashMap<>();
    StudentPortalMethod stp = new StudentPortalMethod();
    Scanner scanner = new Scanner(System.in);

    public String loginRegister() {
        System.out.println("please enter username: ");
        userName = scanner.nextLine();
        System.out.println("please enter password: ");
        password = scanner.nextLine();
        usernameAndPassword.put(userName, password);


        System.out.println("Successfully register ✔");

        return "";
    }

    public String loginEntered() {
        System.out.print("Please enter username to login:  ");
        userName = scanner.nextLine();
        System.out.print("Please enter password to login:  ");

        password = scanner.nextLine();
        for (Map.Entry<String, String> entry : usernameAndPassword.entrySet()) {
            if (userName.equals(entry.getValue()) && password.equals(entry.getKey())) {
                System.out.println();
                System.out.println("successfully entered ✔");
                System.out.println();
                //stp.adminPortal();

            } else {
                System.out.println("No such account ...!");

            }
        }
        return "";
    }

    public static void main(String[] args) {
        LoginAndLogout lg = new LoginAndLogout();
        lg.loginRegister();
        lg.loginEntered();
    }
}
