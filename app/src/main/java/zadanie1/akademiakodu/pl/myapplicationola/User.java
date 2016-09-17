package zadanie1.akademiakodu.pl.myapplicationola;

/**
 * Created by Ale on 2016-09-16.
 */
public class User {

    private String login;
    private String password;



    public User(String login)
    {
        this.login=login;
        password=password+" dsjfns";

    }

    public String getPassword() {
        return password;
    }
    public String getLogin() {
        return login;
    }


    public void setPassword(String password) {
        this.password = password;
    }
    public void setLogin(String login) {
        this.login = login;
    }

}
