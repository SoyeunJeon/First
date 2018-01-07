package rmit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by CoT on 10/12/17.
 */
public class MainApplication {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        EmployeeApplication employeeApplication = context.getBean(EmployeeApplication.class);


        // get employees is not a void and returns string value
        String employees = employeeApplication.employeeService.getEmployees();
        System.out.println(employees);

        // payemployees and leavebalance is both void and print out the string by itself
        employeeApplication.employeeService.payEmployees();
        employeeApplication.salaryService.leaveBalance();

        //exercise:
        // define a new Service called SalaryService. it has a method called leaveBalance()
        // define this as a member of EmployeeApplication
        // inect salaryService to EmployeeApplication
    }
}
