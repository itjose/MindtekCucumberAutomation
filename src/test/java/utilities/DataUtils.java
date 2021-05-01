package utilities;

import java.util.Random;

public class DataUtils {

    //this method will generate random emails.

    public static String getRandomEmail(){


        String email = "abc";
        Random random = new Random();
        int number = random.nextInt(10000);
        return email+number+"@gmail.com";
    }



}
