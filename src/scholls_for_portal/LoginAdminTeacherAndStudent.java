package scholls_for_portal;

import java.util.Scanner;

public class LoginAdminTeacherAndStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yesNo=scanner.nextLine();
        LoginAndLogout loginAndLogout = new LoginAndLogout();
        StudentPortalMethod st = new StudentPortalMethod();

        while (true) {
            System.out.println("please enter role.");
            System.out.println("1.admin");
            System.out.println("2.teacher");
            System.out.println("3.student");
            System.out.print("Select role: ");

            String role = scanner.nextLine();

            if (role.equalsIgnoreCase("1")) {
                System.out.println("Your have account ?");
                System.out.println("1. Yes\n2. No ");

            }else if(yesNo.equals("1")){
                loginAndLogout.loginEntered();
                System.out.println("Welcome to classPortal \n");
                st.adminPortal();

            } else if (role.equalsIgnoreCase("2")) {
                loginAndLogout.loginEntered();
                System.out.println("Welcome to classPortal \n");
                st.teacherPortal();

            } else {
                System.out.println("There is no such role.");
            }

        }
    }
}
