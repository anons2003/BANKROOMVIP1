package Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManagerContro {
    public String[] getUsernameAndPasswordManager(String customerId) throws IOException {
    String[] credentials = new String[2]; // Mảng chứa username và password
    FileReader file = new FileReader("Model//Manager.txt");
    BufferedReader buffer = new BufferedReader(file);
    String result;
    while ((result = buffer.readLine()) != null) {
        String[] customerData = result.split(",");
        String idCustomer = customerData[0];
        String usernameCustomer = customerData[4];
        String passwordCustomer = customerData[5];
        if (idCustomer.equals(customerId)) {
            
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
