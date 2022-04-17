import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Employee {
    private String idEmployee;
    private String nameEmployee;

    private String strRegistrationDate;
    private String strDayToGo;
    Date registrationDate = null;
    Date dayToGo = null;
    Calendar registrationDateCal = Calendar.getInstance();
    Calendar dayToGoCal = Calendar.getInstance();

    private final Random random = new Random();
    private final Scanner sc = new Scanner(System.in);

    public Employee() {
    }

    public Employee(String idEmployee, String nameEmployee) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public void inputEmployee() {
        idEmployee = "E" + String.valueOf(random.nextInt(50));
        System.out.print("\nName employee: ");
        nameEmployee = sc.nextLine();
    }

    public void outputEmployee() {
        System.out.format("\n%-15s %-20s", idEmployee, nameEmployee);
    }
}
