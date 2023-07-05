package Model;

public class Service {
    public Service(String idService, String nameService, String priceService, String statusService) {
        this.idService = idService;
        this.nameService = nameService;
        this.priceService = priceService;
        this.statusService = statusService;
    }
    private String idService;
    private String nameService;
    private String priceService;
    private String statusService;
   
    public String getIdService() {
        return idService;
    }
    public void setIdService(String idService) {
        this.idService = idService;
    }
    public String getNameService() {
        return nameService;
    }
    public void setNameService(String nameService) {
        this.nameService = nameService;
    }
    public String getPriceService() {
        return priceService;
    }
    public void setPriceService(String priceService) {
        this.priceService = priceService;
    }
    public String getStatusService() {
        return statusService;
    }
    public void setStatusService(String statusService) {
        this.statusService = statusService;
    }
    @Override
    public String toString() {
        return "Service [idService=" + idService + ", nameService=" + nameService + ", priceService=" + priceService
                + ", statusService=" + statusService + "]";
    }
   
}
