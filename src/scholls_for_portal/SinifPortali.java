package scholls_for_portal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SinifPortali {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinifElaveEtVeSil sinifElaveEtVeSil = new SinifElaveEtVeSil();
        MuellimDaxiletveSil muellimDaxiletveSil = new MuellimDaxiletveSil();
        StudentAddDelete studentAddDelete = new StudentAddDelete();

        while (true) {
            System.out.println("========== Məktəb Portalı ==========");
            System.out.println("1. Sinif əlavə et");
            System.out.println("2. Sinif sil");
            System.out.println("3. Bütün siniflərə bax");
            System.out.println("4. Müəllim əlavə et");
            System.out.println("5. Müəllim sil");
            System.out.println("6. Bütün müəllimlərə bax");
            System.out.println("7. Tələbə əlavə et");
            System.out.println("8. Tələbə sil");
            System.out.println("0. Çıxış");
            System.out.print("Zəhmət olmasa seçim edin: ");

            int portalNomresi;
            try {
                portalNomresi = scanner.nextInt();
            } catch (InputMismatchException e) {

                System.out.println("❌ Yalniz reqem daxil edin: ");
                scanner.next();
                continue;
            }
            switch (portalNomresi) {
                case 1:
                    System.out.println(sinifElaveEtVeSil.sinifElaveEt());
                    break;
                case 2:
                    System.out.println(sinifElaveEtVeSil.sinifSil());
                    break;
                case 3:
                    System.out.println(sinifElaveEtVeSil.siniflereBax());
                    break;
                case 4:
                    System.out.println(muellimDaxiletveSil.muellimDaxilEt());
                    break;
                case 5:
                    System.out.println(muellimDaxiletveSil.muellimiSil());
                    break;
                case 6:
                    System.out.println(muellimDaxiletveSil.muellimgoster());
                    break;
                case 7:
                    System.out.println(studentAddDelete.StudentAddDelete());
                    break;
                case 8:
                    System.out.println(studentAddDelete.studentDelete());
                    break;
                case 0:
                    break;
            }

        }
    }
}