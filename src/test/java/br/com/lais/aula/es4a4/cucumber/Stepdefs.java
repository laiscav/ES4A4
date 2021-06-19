package br.com.lais.aula.es4a4.cucumber;

import cucumber.api.java.en.Given;

public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        HelloWorld belly = new HelloWorld("");
        belly.sayHi();
    }
}
