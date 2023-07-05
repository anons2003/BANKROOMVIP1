package View;

import java.io.IOException;
import java.util.Scanner;
import Controller.CustomerContro;
import Controller.ManagerContro;


public class Login {
    static Scanner scanner = new Scanner(System.in);
    // public static void main(String[] args) throws IOException  {
    //     login();
    // }
    
    public static void login() throws IOException {
        ManagerContro managerContro = new ManagerContro();
        CustomerContro customerContro = new CustomerContro();
        ManagerView managerView = new ManagerView();
        CustomerView customerView = new CustomerView();

        System.out.println("Who you are ?\n"
                + "1. Manager\n"
                + "2. Customer\n"
                + "3. Do you want to sign up Account for Customer ?\n");
        int key = Integer.parseInt(scanner.nextLine());
        switch (key) {
            case 1:
                System.out.println("Input your id :");
                String id = scanner.nextLine();
                String[] credentials = managerContro.getUsernameAndPasswordManager(id);

                String username1 = credentials[0];
                String password1 = credentials[1];
                System.out.println("input username :");
                String user1 = scanner.nextLine();
                System.out.println("input password :");
                String pass1 = scanner.nextLine();
                if (user1.equals(username1) && pass1.equals(password1)) {
                    while (true) {
                        managerView.Managerdisplay();
                    }
                } else {
                    System.out.println("UserName or PassWord not correct");
                }
                login();
                break;
            case 2:
                
                System.out.println("Input your phone number :");
                String phone = scanner.nextLine();
                String[] credentials1 = customerContro.getUsernameAndPasswordCustomerbyphone(phone);

                String username = credentials1[0];
                String password = credentials1[1];
                System.out.println("input username :");
                String user = scanner.nextLine();
                System.out.println("input password :");
                String pass = scanner.nextLine();
                if (user.equals(username) && pass.equals(password)) {
                    while (true) {
                        customerView.Customerdisplay();
                    }
                } else {
                    System.out.println("UserName or PassWord not correct");
                    login();
                }

                break;
            case 3:
                System.out.println("Create new account !");
                managerView.AddNewCustomer();
                System.out.println("ban da tao tai khoan thanh cong ");
                login();
                break;

        }
    }
}
