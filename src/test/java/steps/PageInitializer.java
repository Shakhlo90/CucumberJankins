package steps;

import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.EmployeeListPage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage login;
public  static DashboardPage dashboardPage;
public static AddEmployeePage addEmployee;
public static EmployeeListPage employeeList;
    public static void initializePageObjects() {
        login = new LoginPage();
        dashboardPage=new DashboardPage();
        addEmployee= new AddEmployeePage();
        employeeList=new EmployeeListPage();
    }
}