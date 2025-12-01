import java.util.Scanner;

public class LoginMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================================================================");
        System.out.println("  *******  *       *  *       *  *******  *      *  *******  *******  *******  *     *  ");
        System.out.println("     *     * *     *   *     *   *        * *    *     *     *     *  *     *   *   *   ");
        System.out.println("     *     *   *   *    *   *    *******  *   *  *     *     *     *  *  *        *     ");
        System.out.println("     *     *     * *     * *     *        *    * *     *     *     *  *   *       *     ");
        System.out.println("  *******  *       *      *      *******  *      *     *     *******  *     *     *     ");
        System.out.println("========================================================================================");  
        System.out.println("                     INVENTORY MANAGEMENT SYSTEM                                        ");  
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("                             Group Members                                              ");
        System.out.println("                        FA25-BDS-006: Aleena                                            ");
        System.out.println("                        FA25-BDS-008: Alishba                                           ");
        System.out.println("========================================================================================");
        System.out.println();

        int choice;

        do {
            System.out.println("+--------------------------------------+");
            System.out.println("|              LOGIN MENU              |");
            System.out.println("+--------------------------------------+");
            System.out.println("|    1 --> Admin Login                 |");
            System.out.println("|    2 --> Staff Login                 |");
            System.out.println("|    3 --> Exiting..Good Bye!!         |");
            System.out.println("+--------------------------------------+");
            System.out.println();
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (adminLogin(sc)) {
                        adminMenu(sc);
                    }
                    break;
                //case 2:
                    //if (staffLogin(sc)) {
                    //    staffMenu(sc);
                    //}
                    //break;
                case 3:
                    System.out.println("Exiting..Good Bye!!");
                    break;
                default:
                    System.out.println("Invalid choice....Please Retry!!");
            }
        }
        while (choice != 2);
        sc.close();
    }

    public static boolean adminLogin(Scanner sc) {
        final String adminUsername = "admin";
        final String adminPassword = "admin1234";

        System.out.println("=========================================");
        System.out.println("||            ADMIN LOGIN              ||");
        System.out.println("=========================================");
        System.out.println("||      1. Username:_______________    ||");
        System.out.println("||      2. Password:_______________    ||");
        System.out.println("||      3. Exit the System.            ||");
        System.out.println("=========================================");

        System.out.println("Enter Admin Username: ");
        String username = sc.nextLine();
        System.out.println("Enter Admin login Password: ");
        String password = sc.nextLine();

        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            System.out.println("Admin Login Successful! Let's run this system.");
            System.out.println();
            return true;
        }
        else {
            System.out.println("Oops! Login failed. try again!!");
            return false;
        }
    }

    public static void adminMenu(Scanner sc) {
        int option;
        do {
            System.out.println("******************************************");
            System.out.println("*               ADMIN MENU               *");
            System.out.println("*----------------------------------------*");
            System.out.println("*Select the option you'd like to explore *");
            System.out.println("*      (Options range from 1 to 6)       *");
            System.out.println("*                                        *");
            System.out.println("*   1. Manage Categories                 *");
            System.out.println("*   2. Manage Products                   *");
            System.out.println("*   3. Manage Customers                  *");
            System.out.println("*   4. Manage Sales Orders               *");
            System.out.println("*   5. Manage Suppliers                  *");
            System.out.println("*   6. Logout                            *");
            System.out.println("******************************************");
            System.out.println();
    
            System.out.println("Enter your choice: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    manageCatogeriesMenu(sc);
                    break;
                case 2:
                    manageProductsMenu(sc); 
                    break;
                case 3:
                    manageCustomersMenu(sc);
                    break;
                case 4:
                    manageSalesOrdersMenu(sc);
                    break;
                case 5:
                    manageSuppliersMenu(sc);
                    break;
                case 6:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        while (option != 6);
    }

    public static void manageCatogeriesMenu(Scanner sc) {
        System.out.println("====MANAGE CATEGORIES====");
        System.out.println("       1-> Add           ");
        System.out.println("       2-> View          ");
        System.out.println("       3-> Delete        ");
        System.out.println("       4-> Back          ");
        System.out.println("=========================");
        System.out.println();
    }

        public static void manageProductsMenu(Scanner sc) {
        System.out.println("====MANAGE PRODUCTS====");
        System.out.println("       1-> Add         ");
        System.out.println("       2-> View        ");
        System.out.println("       3-> Delete      ");
        System.out.println("       4-> Back        ");
        System.out.println("=======================");
        System.out.println();
    }

        public static void manageCustomersMenu(Scanner sc) {
        System.out.println("====MANAGE CUSTOMERS====");
        System.out.println("       1-> Add          ");
        System.out.println("       2-> View         ");
        System.out.println("       3-> Delete       ");
        System.out.println("       4-> Back         ");
        System.out.println("========================");
        System.out.println();
    }

        public static void manageSalesOrdersMenu(Scanner sc) {
        System.out.println("====MANAGE SALES ORDERS====");
        System.out.println("       1-> Add             ");
        System.out.println("       2-> View            ");
        System.out.println("       3-> Delete          ");
        System.out.println("       4-> Back            ");
        System.out.println("===========================");
        System.out.println();
    }

        public static void manageSuppliersMenu(Scanner sc) {
        System.out.println("====MANAGE SUPPLIERS====");
        System.out.println("       1-> Add          ");
        System.out.println("       2-> View         ");
        System.out.println("       3-> Delete       ");
        System.out.println("       4-> Back         ");
        System.out.println("========================");
        System.out.println();
    
    }
}

    