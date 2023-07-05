package Model;

public class Customer {
    private String idCustomer;
    private String nameCustomer;
    private String phoneCustomer;
    private String emailCustomer;
    private String usernameCustomer;
    private String passwordCustomer;
    public Customer(String idCustomer, String nameCustomer, String emailCustomer, String phoneCustomer,
            String usernameCustomer, String passwordCustomer) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.usernameCustomer = usernameCustomer;
        this.passwordCustomer = passwordCustomer;
    }
    public String getIdCustomer() {
        return idCustomer;
    }
    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }
    public String getNameCustomer() {
        return nameCustomer;
    }
    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }
    public String getPhoneCustomer() {
        return phoneCustomer;
    }
    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }
    public String getEmailCustomer() {
        return emailCustomer;
    }
    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }
    public String getUsernameCustomer() {
        return usernameCustomer;
    }
    public void setUsernameCustomer(String usernameCustomer) {
        this.usernameCustomer = usernameCustomer;
    }
    public String getPasswordCustomer() {
        return passwordCustomer;
    }
    public void setPasswordCustomer(String passwordCustomer) {
        this.passwordCustomer = passwordCustomer;
    }
    @Override
    public String toString() {
        return "Customer [idCustomer=" + idCustomer + ", nameCustomer=" + nameCustomer  + ", emailCustomer=" + emailCustomer + ", phoneCustomer="
                + phoneCustomer+ ", usernameCustomer=" + usernameCustomer
                + ", passwordCustomer=" + passwordCustomer + "]" ;
    }
}
