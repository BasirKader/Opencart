package steps;

import Pages.UserLoginPage;
import Pages.UserRegistrationPage;

public class PageInitializer {

    public static UserRegistrationPage userRegistration;
    public static UserLoginPage userLoginPage;

          public static void pageInitializer(){

        userRegistration = new UserRegistrationPage();

        userLoginPage = new UserLoginPage();
    }
}
