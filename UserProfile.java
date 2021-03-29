import java.lang.String;
public class UserProfile {
    private byte userAge;
    private String userName;
    private String userEMail;

    public byte getUserAge(){
        return userAge;
    }

    public String getUserName(){
        return userName;
    }

    public String getUserEMail(){
        return userEMail;
    }

    public void setUserAge(byte userAge){
        this.userAge = userAge;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setUserEMail(String userEMail){
        this.userEMail = userEMail;
    }
}