package View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.ContractContro;
import Controller.CustomerContro;
import Controller.ServiceContro;
import Model.Contract;
import Model.Customer;
import Model.Service;

public class CustomerView {
    Scanner scanner = new Scanner(System.in);
    ContractContro contractContro = new ContractContro();
    CustomerContro customerContro = new CustomerContro();
    ServiceContro serviceContro = new ServiceContro();
   
    public void Customerdisplay() throws IOException{
        //         contractContro.getAllContract();
        // customerContro.getAllCustomer();
        // serviceContro.getAllService();
         System.out.println("===Menu Customer===\n"
                + "1.View All Service\n"
                + "2.Make A Contract\n"
                + "3.Exit\n");
        int key = Integer.parseInt(scanner.nextLine());
        switch (key) {
            case 1:
                ViewAllServie();
                break;
            case 2:
                Rent();
                break;
            case 3:
                Login.login();
        
        }
    }
    private void Rent() throws IOException {
        //ViewAllServie();
        System.out.println("input your phone :");
        String phone = scanner.nextLine();
        System.out.println("input id service :");
        String idService = scanner.nextLine();
        System.out.println("input id constract :");
        String idContract = scanner.nextLine();
        Customer customer = customerContro.getCustomerByphone(phone); // Tạo đối tượng Customer từ dữ liệu
        Service service = serviceContro.getServicebyid(idService); // Tạo đối tượng Service từ dữ liệu
        System.out.println("input day Rent :");
        String dayRent = scanner.nextLine(); // Chuyển đổi sang kiểu dữ liệu số
        Contract contract = new Contract(idContract, customer, service, dayRent);
        contractContro.addContract(contract);

    }
    private void ViewAllServie() throws IOException {
        ArrayList<Service> sv = serviceContro.getAllService();
        for (Service service : sv) {
            System.out.println(service);
        }
    }
}
