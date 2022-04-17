import java.util.Random;
import java.util.Scanner;

public class Gift {
    private String idGift;
    private String nameGift;

    private final Random random = new Random();
    private final Employee employee = new Employee();
    private final Scanner sc = new Scanner(System.in);

    public Gift(String idGift, String nameGift) {
        this.idGift = idGift;
        this.nameGift = nameGift;
    }

    public Gift() {
    }

    public String getIdGift() {
        return idGift;
    }

    public void setIdGift(String idGift) {
        this.idGift = idGift;
    }

    public String getNameGift() {
        return nameGift;
    }

    public void setNameGift() {
        this.nameGift = employee.getNameEmployee();
    }

    public void inputGift(Employee employee){
        idGift = "G" + String.valueOf(random.nextInt(50));
        nameGift = employee.getNameEmployee();
    }

    public void outputGift(){
        System.out.format("\n%-5s %-20s", idGift, nameGift);
    }
}
