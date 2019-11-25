package app;

import app.Controller.WelcomeViewController;

public class App {

    public static void main(String[] args) { setupInitialViewController(); }

    private static void setupInitialViewController() {
        new WelcomeViewController();
    }

}
