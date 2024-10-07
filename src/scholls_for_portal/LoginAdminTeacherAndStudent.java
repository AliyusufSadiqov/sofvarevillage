package scholls_for_portal;

import java.util.Scanner;

public class LoginAdminTeacherAndStudent extends LoginAndLogout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginAndLogout loginAndLogout = new LoginAndLogout();
        StudentPortalMethod st = new StudentPortalMethod();
        while (true) {

            System.out.println("please enter role.");
            System.out.println("1.admin");
            System.out.println("2.teacher");
            System.out.println("3.student");
            System.out.print("Select role: ");
            while (true) {

                String role = scanner.nextLine();

                //Admin ucun login;

                if (role.equalsIgnoreCase("1")) {
                    while (true) {
                        System.out.println("Your have account ?");
                        System.out.println("1. Yes\n2. No ");
                        System.out.println("Exit for < 0 > ....");
                        String yesNo = scanner.nextLine();

                        switch (yesNo) {
                            case "1":
                                if (usernameAndPassword.isEmpty()) {
                                    System.out.println("First of all of the registration");
                                    loginAndLogout.loginRegister();
                                }
                                System.out.println(loginAndLogout.loginEntered());
                                st.adminPortal();
                                break;

                            case "2":
                                System.out.println(loginAndLogout.loginRegister());

                                break;
                            case "0":
                                return;
                            default:
                                System.out.println("The number can be 1 or 2...!");

                        }
                    }

                    // Muellim ucun login;

                } else if (role.equalsIgnoreCase("2")) {
                    while (true) {
                        System.out.println("Your have account ?");
                        System.out.println("1. Yes\n2. No ");
                        System.out.println("Exit for < 0 > ....");
                        String yesNo = scanner.nextLine();

                        switch (yesNo) {
                            case "1":
                                if (usernameAndPassword.isEmpty()) {
                                    System.out.println("First of all of the registration");
                                    loginAndLogout.loginRegister();
                                }
                                System.out.println(loginAndLogout.loginEntered());
                                st.teacherPortal();
                                break;

                            case "2":
                                System.out.println(loginAndLogout.loginRegister());
                                break;
                            case "0":
                                return;
                            default:
                                System.out.println("The number can be 1 or 2...!");

                        }
                    }


                } else {
                    System.out.println("There is no such role.");
                }

            }
        }
    }
}
