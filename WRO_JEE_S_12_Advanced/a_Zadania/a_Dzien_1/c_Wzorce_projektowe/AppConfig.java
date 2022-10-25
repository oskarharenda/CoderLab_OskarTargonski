package a_Zadania.a_Dzien_1.c_Wzorce_projektowe;

public class AppConfig {
    private String password;
    private String login;
    private String host;

    private static AppConfig INSTANCE;

    private AppConfig(){
        password = "tajne123";
        login = "admin";
        host = "localhost";
    }

    public static synchronized AppConfig getAppConfig(){
        if(INSTANCE == null) {
            INSTANCE = new AppConfig();
        }
        return INSTANCE;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}