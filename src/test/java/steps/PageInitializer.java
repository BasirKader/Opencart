package steps;

import Pages.UserRegistrationPage;

public class PageInitializer {

    public static UserRegistrationPage userRegistration;


    public static void pageInitializer(){

        userRegistration = new UserRegistrationPage();

    }
}
