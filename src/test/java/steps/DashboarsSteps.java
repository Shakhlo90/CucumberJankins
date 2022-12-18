package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class DashboarsSteps extends CommonMethods {
    @Then("user verify dashboard page")
    public void user_verify_dashboard_page() {
        System.out.println("Batch14 is happy now");
    }
        @Then("user verify all the dashboard tabs")
        public void user_verify_all_the_dashboard_tabs(DataTable dataTable) {
        List<String>actual=dataTable.asList();
        List<String>expected=new ArrayList<>();
        for (WebElement element:dashboardPage.dashboardTabs){
        expected.add(element.getText());}
            System.out.println(actual);
            System.out.println(expected);
            Assert.assertTrue(expected.equals(actual));}
        }


