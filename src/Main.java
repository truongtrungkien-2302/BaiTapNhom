import java.util.*;

public class Main {
    private static final List<Employee> employeeList = new ArrayList<>();
    private static final List<Gift> giftList = new ArrayList<>();
    private static final List<Customer> customerList = new ArrayList<>();
    private static final List<TravelingStaff> travelingStaffList = new ArrayList<>();
    private static final Random random = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inforCustomer();
        int key = -1;
        do {
            System.out.println("\n\n================================================================");
            System.out.println("┌──────────────────────────────────────────────────────────────┐");
            System.out.println("│                  	      Menu                                 │");
            System.out.println("├──────────────────────────────────────────────────────────────┤");
            System.out.println("│ 1. Them khach hang                                           │");
            System.out.println("│ 2. Sua khach hang                                            │");
            System.out.println("│ 3. Xoa khach hang                                            │");
            System.out.println("│ 4. Tim kiem khach hang                                       │");
            System.out.println("│ 5. Sap xep khach hang                                        │");
            System.out.println("│ 0. Thoát                                                     │");
            System.out.println("└──────────────────────────────────────────────────────────────┘");
            System.out.print("\nNhap lua chon: ");
            try {
                key = sc.nextInt();
            } catch (Exception e) {
                key = -1;
            }
            sc.nextLine();
            switch (key) {
                case 1: {
                    findCustomerByID();
//                    addCustomer();
                    break;
                }
                case 2: {
//                    editCustomer();
                    break;
                }
                case 3: {
//                    removeCustomer();
                    break;
                }
                case 4: {
//                    searchCustomer();
                    break;
                }
                case 5: {
                    sortCustomerBySales();
                    System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    sortCustomerByID();
                    break;
                }
                default:
                    System.err.println("Thông tin nhập vào sai, thử nhập lại!");
            }
        } while (key != 0);

//        inforEmployee();
//        sortCustomerBySales();
    }

    private static void sortCustomerBySales() {
        Comparator<Customer> customerComparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getSales() > o2.getSales() ? 1 : -1;
            }
        };
        customerList.sort(customerComparator);
        System.out.print("\n\n\t\tSort customer by sales");
        showListCustomer();
    }

    private static void sortCustomerByID() {
        customerList.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getIdCustomer().compareTo(o2.getIdCustomer());
            }
        });
        System.out.print("\n\n\t\tSort customer by ID");
        showListCustomer();
    }

    private static void findCustomerByID() {
        System.out.print("\nID customer: ");
        String keyID = sc.nextLine();
        for (Customer customer : customerList) {
            if (keyID.compareTo(customer.getIdCustomer()) == 0)
                showListCustomer();
        }
    }

    private static void inforCustomer() {
        Customer[] customers;
        System.out.print("\nSo khach hang trong cong ty TrueLove: ");
        int sizeCustomer = sc.nextInt();
        customers = new Customer[sizeCustomer];
        for (int i = 0; i < sizeCustomer; i++) {
            System.out.print("\n\tNHAP THONG TIN KHACH HANG THU " + (i + 1) + " TRONG CONG TY TRUELOVE");
            customers[i] = new Customer();
            inputCustomer(customers[i]);
        }
        showListCustomer();
    }

    private static void showListCustomer() {
        showTitleCustomer();
        for (Customer customer : customerList) {
            customer.outputeCustomer();
        }
    }

    private static void inforEmployee() {
        Employee[] emp;
        System.out.print("\nSo nhan vien trong cong ty TrueLove: ");
        int sizeEmployees = sc.nextInt();
        emp = new Employee[sizeEmployees];
        for (int i = 0; i < sizeEmployees; i++) {
            System.out.print("\n\tNHAP THONG TIN NHAN VIEN THU " + (i + 1) + " TRONG CONG TY TRUELOVE");
            emp[i] = new Employee();
            inputEmployee(emp[i]);
        }
        showListEmployee();
    }

    private static void showListEmployee() {
        showTitleEmployee();
        for (Employee employee : employeeList) {
            employee.outputEmployee();
        }
    }

    private static void inputEmployee(Employee employee) {
        employee.inputEmployee();
        employeeList.add(employee);
    }

    private static void inputCustomer(Customer customer) {
        customer.inputeCustomer();
        customerList.add(customer);
    }

    private static void showTitleEmployee() {
        System.out.printf("\n\n%-15s %-20s \n", "ID Employee", "Name Employee");
    }

    private static void showTitleGift() {
        System.out.printf("\n\n%-15s %-20s \n", "ID Gift", "Name Gift");
    }

    private static void showTitleCustomer() {
        System.out.printf("\n%-15s %-20s %-15s", "ID Customer", "Name Customer", "Sales");
    }

}
