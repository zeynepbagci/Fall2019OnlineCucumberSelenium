package com.vytrack.step_definitions;

import com.vytrack.pages.activities.CalendarEventsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ViewCalendarEventsStepDefinitions {

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    @Then("view per page menu should have following options")
    public void view_per_page_menu_should_have_following_options(List<String> dataTable) {

        System.out.println("Expected values: "+dataTable);
        Assert.assertEquals(dataTable, calendarEventsPage.getViewPerPageOptions());

    }


}
