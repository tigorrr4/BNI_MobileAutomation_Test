package com.example.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.drivers.AndroidDriverInit;


public class AndroidDriverHook {

  @Before()
  public void beforeScenario() {
    AndroidDriverInit.initialize();}

  @After()
  public void afterScenario(Scenario scenario) {
    AndroidDriverInit.quit();
  }



}
