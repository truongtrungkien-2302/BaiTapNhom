import java.util.Random;
import java.util.Scanner;

public class Customer {
    private String idCustomer;
    private String nameCustomer;
    private long sales;

    private static final Random random = new Random();
    private final Scanner sc = new Scanner(System.in);

    public Customer(String idCustomer, String nameCustomer, long sales) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.sales = sales;
    }

    public Customer() {
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public long getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public void inputeCustomer() {
        idCustomer = "C" + random.nextInt(50);
        System.out.print("\nName customer: ");
        nameCustomer = sc.nextLine();
        sales = random.nextInt(10000000);
    }

    public void outputeCustomer(){
        System.out.format("\n%-15s %-20s %-15s", idCustomer, nameCustomer, sales);
    }

}
