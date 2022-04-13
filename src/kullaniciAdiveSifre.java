import java.util.Scanner;

public class kullaniciAdiveSifre {
    public static void main(String[] args) {
        String userName, password, yes, password1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();
        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("dev123")) {
            System.out.print("Giriş yaptınız !");
        } else {
            System.out.print("Şifreniz yanlış sıfırlamak için 1 yazınız : ");
            yes = inp.nextLine();
            String newPassword;
            if (yes.equals("1")) {
                System.out.print("Yeni şifrenizi giriniz : ");
                password1 = inp.nextLine();

                if (password1.equals(password)) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.print("Yeni şifreniz başarıyla oluşturuldu.");
                }
            }
        }
    }
}
