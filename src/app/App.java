package app;

import app.Controller.ViewController;
import app.Controller.WelcomeViewController;

public class App {

    public static void main(String[] args) {
        setupInitialViewController();
    }

    public static void setupInitialViewController() {
        ViewController root = new WelcomeViewController();
    }

}
