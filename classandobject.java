import java.util.ArrayList;
import java.util.Scanner;
public class classandobject {
    private static ArrayList<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean stop = false;
        while (!stop) {
            System.out.println("Choose an option:");
            System.out.println("1.create user");
            System.out.println("2.show users");
            System.out.println("3.stop");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    showUsers();
                    break;
                case 3:
                    stop = true;
                    break;
                default:
                    System.out.println("Invalid choice.Please enter again: ");
            }
        }
    }

    private static void createUser() {
        System.out.println("please enter user details:");
        System.out.print("id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("username: ");
        String userName = scanner.nextLine();
        System.out.print("password: ");
        String password = scanner.nextLine();
        System.out.print("email: ");
        String email = scanner.nextLine();
        System.out.println("please enter user details:");
        System.out.print("account id: ");
        int accountId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("account balance: ");
        double accountBalance = scanner.nextDouble();

        Account account = new Account(accountId, accountNumber, accountBalance);
        User user = new User(id, userName, password, email, account);
        users.add(user);
        System.out.println("user created sucessfully.");
    }

    private static void showUsers() {
        if (users.isEmpty()) {
            System.out.println("No users details available.");
        } else {
            System.out.println("user list:");
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}
class Account {
    private int id;
    private String accountNumber;
    private double accountBalance;

    public Account(int id, String accountNumber, double accountBalance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "id: " + id + ", account Number: " + accountNumber + ", balance: " + accountBalance;
    }
}

class User {
    private int id;
    private String userName;
    private String password;
    private String email;
    private Account account;

    public User(int id, String userName, String password, String email, Account account) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.account = account;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Username: " + userName + ", Email: " + email + "\nAccount Details: " + account.toString();
    }
}
