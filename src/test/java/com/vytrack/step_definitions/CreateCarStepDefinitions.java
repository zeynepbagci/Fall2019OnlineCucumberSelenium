package com.vytrack.step_definitions;

import com.vytrack.pages.fleet.VehiclesPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class CreateCarStepDefinitions {

    VehiclesPage vehiclesPage = new VehiclesPage();

    @Then("user clicks on create a car button")
    public void user_clicks_on_create_a_car_button() {

        System.out.println("User clicks on create a car button");
        vehiclesPage.clickToCreateCar();

    }



    @Then("user creates a car with following info:")
    public void user_creates_a_car_with_following_info(List<Map<String,String>> dataTable) {

        /**
         *  Then user creates a car with following info:
         *     | Licence Plate | Driver   | Location  | Model Year | Color |
         *     | SDET          | Pro Racer| Rome,Italy| 2020       | Red   | )row
         *
         *     ilk row sayilmiyor
         *
         *     ben gelip direk olusturdugum tablodan value lari cagirip  varolan methodumla set etmis oldum.
         */
        System.out.println(dataTable);

        vehiclesPage.setLicencePlateInput(dataTable.get(0).get("Licence Plate"));

        vehiclesPage.setDriverInput(dataTable.get(0).get("Driver"));

        vehiclesPage.setLocationInput(dataTable.get(0).get("Location"));

        vehiclesPage.setModelYear(dataTable.get(0).get("Model Year"));

        vehiclesPage.setColor(dataTable.get(0).get("Color"));

        vehiclesPage.clickOnSaveAndClose();


    }

    @Then("user verifies that car info is displayed")
    public void user_verifies_that_car_info_is_displayed(List<Map<String,String>> dataTable) {

        for(Map<String,String> row : dataTable){
            Assert.assertEquals(row.get("Licence Plate"), vehiclesPage.getCarGeneralInfo("Licence Plate"));
            Assert.assertEquals(row.get("Driver"),vehiclesPage.getCarGeneralInfo("Driver"));
            Assert.assertEquals(row.get("Location"),vehiclesPage.getCarGeneralInfo("Location"));
            Assert.assertEquals(row.get("Model Year"),vehiclesPage.getCarGeneralInfo("Model Year"));
            Assert.assertEquals(row.get("Color"),vehiclesPage.getCarGeneralInfo("Color"));
        }


    }



}
