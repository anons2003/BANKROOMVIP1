package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Model.Service;

public class ServiceContro {
    ArrayList<Service> sv = new ArrayList<>();

    public ArrayList<Service> getAllService() throws IOException {
        sv.clear();
        FileReader file = new FileReader("Model//Service.txt");
        BufferedReader buffer = new BufferedReader(file);
        String result;
        while ((result = buffer.readLine()) != null) {
            String[] ServiceData = result.split(",");
            if (ServiceData.length != 4) {
                // Xử lý lỗi hoặc bỏ qua dòng dữ liệu không hợp lệ
                continue;
            }
            String idService = ServiceData[0];
            String nameService = ServiceData[1];
            String priceService = ServiceData[2];
            String statusService = ServiceData[3];
            Service service = new Service(idService, nameService, priceService, statusService);
            sv.add(service);
        }
        buffer.close();
        file.close();
        return this.sv;
    }

    public void WriteCN(Service service) throws IOException {
        FileWriter fw = new FileWriter("Model//Service.txt", true); // Chế độ ghi tiếp
        BufferedWriter bw = new BufferedWriter(fw);
        String CnStr = "";

        CnStr = service.getIdService() + "," + service.getNameService() + ","
                + service.getPriceService() + "," + service.getStatusService() ;

        bw.write(CnStr);
        bw.newLine();
        bw.close();
        fw.close();
    }

    public Service getServicebyid(String idServices) throws IOException {
        sv.clear();
        Service service = null;
        FileReader file = new FileReader("Model//Service.txt");
        BufferedReader buffer = new BufferedReader(file);
        String result;
        while ((result = buffer.readLine()) != null) {
            String[] ServiceData = result.split(",");
            String idService = ServiceData[0];
            String nameService = ServiceData[1];
            String priceService = ServiceData[2];
            String statusService = ServiceData[3];

            if (idService.equals(idServices)) {
                service = new Service(idService, nameService, priceService, statusService);
                break;
            }

        }
        buffer.close();
        file.close();
        return service;

    }

    public void addService(Service service) throws IOException {
        this.sv.add(service);
        WriteCN(service);
        System.out.println("ok");
    }
}
