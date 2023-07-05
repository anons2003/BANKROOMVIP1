package Model;

public class Manager {
    @Override
    public String toString() {
        return "Manager [idManager=" + idManager + ", nameManager=" + nameManager + ", phoneManager=" + phoneManager
                + ", emailManager=" + emailManager + ", usernameManager=" + usernameManager + ", passwordManager="
                + passwordManager + "]";
    }
    public Manager(String idManager, String nameManager, String phoneManager, String emailManager, String usernameManager,
            String passwordManager) {
        this.idManager = idManager;
        this.nameManager = nameManager;
        this.phoneManager = phoneManager;
        this.emailManager = emailManager;
        this.usernameManager = usernameManager;
        this.passwordManager = passwordManager;
    }
    private String idManager;
    private String nameManager;
    private String phoneManager;
    private String emailManager;
    private String usernameManager;
    private String passwordManager;
    public String getIdManager() {
        return idManager;
    }
    public void setIdManager(String idManager) {
        this.idManager = idManager;
    }
    public String getNameManager() {
        return nameManager;
    }
    public void setNameManager(String nameManager) {
        this.nameManager = nameManager;
    }
    public String getPhoneManager() {
        return phoneManager;
    }
    public void setPhoneManager(String phoneManager) {
        this.phoneManager = phoneManager;
    }
    public String getEmailManager() {
        return emailManager;
    }
    public void setEmailManager(String emailManager) {
        this.emailManager = emailManager;
    }
    public String getUsernameManager() {
        return usernameManager;
    }
    public void setUsernameManager(String usernameManager) {
        this.usernameManager = usernameManager;
    }
    public String getPasswordManager() {
        return passwordManager;
    }
    public void setPasswordManager(String passwordManager) {
        this.passwordManager = passwordManager;
    }

}
