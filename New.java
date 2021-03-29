import java.io.IOException;
import java.lang.String;
//
class New{
    public static void main(String[] args) throws IOException {
        System.out.println("enter ur age");
        UserProfile DanilProfile = new UserProfile();
        DanilProfile.setUserAge((byte) 24);
        DanilProfile.setUserName( "Daniil");
        DanilProfile.setUserEMail( "dk@yandex.ru");

        char aa = (char) System.in.read();
        if (aa == 'g'){
            DanilProfile.getUserAge();
            DanilProfile.getUserName();
            DanilProfile.getUserEMail();
        }


    }
}