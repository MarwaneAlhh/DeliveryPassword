package DeliveryPassword.Main;

import java.util.Scanner;


/**
 * main
 */
public class DeliveryPassword {

    public static void main(String[] args) {
        System.out.println("Can you enter the value");
        Scanner sc = new Scanner(System.in);
        String account = sc.nextLine();
        String finall = Generateexts(account,account,account);
        System.out.println(finall);
        sc.close();
    }


    static String Generateexts(String userId, String password, String emailFrasers) {
        return "Hello,\nAccount " + userId + "\n" + "Password : " + password + "\n" + "Email: " + emailFrasers + "\n"
                + "Have a nice day !";
    }
}