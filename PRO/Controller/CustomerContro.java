package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Model.Customer;

public class CustomerContro {
    ArrayList<Customer> cs = new ArrayList<>();

    public ArrayList<Customer> getAllCustomer() throws IOException {
        cs.clear();
        FileReader file = new FileReader("Model//Customer.txt");
        BufferedReader buffer = new BufferedReader(file);
        String result;
        while ((result = buffer.readLine()) != null) {
        //      String[] contractData = result.split(";");
        // if (contractData.length != 4) {
        //     // Xử lý lỗi hoặc bỏ qua dòng dữ liệu không hợp lệ
        //     continue;
        // }
            String idCustomer = result.split(",")[0];
            String nameCustomer = result.split(",")[1];
            String emailCustomer = result.split(",")[2];
             String phoneCustomer = result.split(",")[3];
            String usernameCustomer = result.split(",")[4];
            String passwordCustomer = result.split(",")[5];
            Customer customer = new Customer(idCustomer, nameCustomer,  emailCustomer,phoneCustomer, usernameCustomer,
                    passwordCustomer);
            cs.add(customer);
        }
        buffer.close();
        file.close();
        return this.cs;
    }
     public void addCustomer(Customer customer) throws IOException {
        this.cs.add(customer);
        WriteCN(customer);
        System.out.println("ok");
    }

   public void WriteCN(Customer customer) throws IOException {
    FileWriter fw = new FileWriter("Model//Customer.txt", true); // Chế độ ghi tiếp
    BufferedWriter bw = new BufferedWriter(fw);
    String line = "";
    line = customer.getIdCustomer() + "," + customer.getNameCustomer() + ","
            + customer.getEmailCustomer() + "," + customer.getPhoneCustomer() + ","
            + customer.getUsernameCustomer() + "," + customer.getPasswordCustomer();

    bw.write(line);
    bw.newLine();
    bw.close();
    fw.close();
}



    public Customer getCustomerByphone(String phone) throws IOException {
        Customer customer = null;
        FileReader file = new FileReader("Model//Customer.txt");
        BufferedReader buffer = new BufferedReader(file);
        String result;
        while ((result = buffer.readLine()) != null) {
            String[] customerData = result.split(",");
            String idCustomer = customerData[0];
            String nameCustomer = customerData[1];
            String emailCustomer = customerData[2];
            String phoneCustomer = customerData[3];
            String usernameCustomer = customerData[4];
            String passwordCustomer = customerData[5];
            if (phoneCustomer.equals(phone)) {
                customer = new Customer(idCustomer, nameCustomer,emailCustomer, phoneCustomer, usernameCustomer,
                        passwordCustomer);
                break;
            }
        }
        buffer.close();
        file.close();
        return customer;
    }

   
    public String[] getUsernameAndPasswordCustomerbyphone(String phone) throws IOException {
        String[] credentials = new String[2];
        FileReader file = new FileReader("Model//Customer.txt");
        BufferedReader buffer = new BufferedReader(file);
        String result;
        while ((result = buffer.readLine()) != null) {
            String[] customerData = result.split(",");
            String phoneCustomer = customerData[3];
            String usernameCustomer = customerData[4];
            String passwordCustomer = customerData[5];
            if (phoneCustomer.equals(phone)) {
                credentials = new String[2];
                credentials[0] = usernameCustomer;
                credentials[1] = passwordCustomer;
                break;
            }
        }
        buffer.close();
        file.close();
        return credentials;
    }

}
