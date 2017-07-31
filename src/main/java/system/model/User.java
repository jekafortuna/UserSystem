package system.model;

/**
 * Created by Evgeniy on 28.07.2017.
 * Model unit of MVC pattern
 */
public class User {
    /**
     * login of user
     */
    private String login;
    /**
     * password of user
     */
    private String password;

    public User() {}

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User {" + "login = '" + login + '\'' + ", password = '" + password + '\'' + '}';
    }
}
