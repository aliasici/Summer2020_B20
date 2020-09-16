package Office_Hours.Practice_09_08_2020;

public class Credentials {
    private String userName = "Ali";
    private String password = "Yilmaz";

    public String getUserName(){ //MUST BE RETURN METHOD,  READ ONLY
        return userName;
    }

    public void setUserName(String userName){ // MUST HAVE PARAMETER, Modify private data
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

