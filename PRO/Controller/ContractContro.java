package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Model.Contract;
import Model.Customer;
import Model.Service;

public class ContractContro {
    ArrayList<Contract> ct = new ArrayList<>();
    CustomerContro customerContro = new CustomerContro();
    ServiceContro serviceContro = new ServiceContro();

public ArrayList<Contract> getAllContract() throws IOException {
    ct.clear();
    FileReader file = new FileReader("Model//Contract.txt");
    BufferedReader buffer = new BufferedReader(file);
    String result;
    while ((result = buffer.readLine()) != null) {
        String[] contractData = result.split(";");
        if (contractData.length != 4) {
            // Xử lý lỗi hoặc bỏ qua dòng dữ liệu không hợp lệ
            continue;
        }
        String idContract = contractData[0];
        
        // Lấy số điện thoại của Customer từ chuỗi dữ liệu
        String customerData = contractData[1];
        int phoneStartIndex = customerData.indexOf("phoneCustomer=") + 14;
        int phoneEndIndex = customerData.indexOf(",", phoneStartIndex);
        String phoneCustomer = customerData.substring(phoneStartIndex, phoneEndIndex);

        // Lấy ID của Service từ chuỗi dữ liệu
        String serviceData = contractData[2];
        int serviceIdStartIndex = serviceData.indexOf("idService=") + 10;
        int serviceIdEndIndex = serviceData.indexOf(",", serviceIdStartIndex);
        String serviceId = serviceData.substring(serviceIdStartIndex, serviceIdEndIndex);

        // Gán số điện thoại vào Customer và lấy Service bằng ID
        Customer customer = customerContro.getCustomerByphone(phoneCustomer);
        Service service = serviceContro.getServicebyid(serviceId);

        String dayRent = contractData[3];
        Contract contract = new Contract(idContract, customer, service, dayRent);
        
        ct.add(contract);
    }
    buffer.close();
    file.close();
    return ct;
}


    public void WriteCN(Contract contract) throws IOException {
        FileWriter fw = new FileWriter("Model//Contract.txt", true); // Chế độ ghi tiếp
        BufferedWriter bw = new BufferedWriter(fw);
        String CnStr = "";

        CnStr = contract.getIdContract() + ";" + contract.getCustomer() + ";"
                + contract.getService() + ";" + contract.getDayrent() + "\n";

        bw.write(CnStr);
        bw.newLine();
        bw.close();
        fw.close();
    }

    public void addContract(Contract contract) throws IOException {
        this.ct.add(contract);
        WriteCN(contract);
        System.out.println("ok");
    }
}
