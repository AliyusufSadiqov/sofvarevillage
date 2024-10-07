package scholls_for_portal;

import java.util.Scanner;

public class LoginAdminTeacherAndStudent {
    public static void main(String[] args) {
        LoginAndLogout loginAndLogout = new LoginAndLogout();
        StudentPortalMethod st = new StudentPortalMethod();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("please enter role.");
            System.out.println("1.admin");
            System.out.println("2.teacher");
            System.out.println("3.student");
            System.out.print("Select role: ");

            String role = scanner.nextLine();
            if (role.equalsIgnoreCase("admin")) {
                loginAndLogout.login();
                System.out.println("Welcome to classPortal \n");
                st.adminPortal();

            } else if (role.equalsIgnoreCase("Teacher")) {
                loginAndLogout.login();
                System.out.println("Welcome to classPortal \n");
                st.teacherPortal();

            } else {
                System.out.println("There is no such role.");
            }

        }
    }
}
