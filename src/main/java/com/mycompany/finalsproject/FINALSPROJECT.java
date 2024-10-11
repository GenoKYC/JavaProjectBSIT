package com.mycompany.finalsproject;
import java.util.Scanner;

public class FINALSPROJECT {
   
    static String[] usernames = new String[100];  
    static String[] passwords = new String[100];
    static String[] fullnames = new String[100];
    static String[] studentNumbers = new String[100];
    static String[] sections = new String[100];
    static int userCount = 0;                     

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("\nWELCOME TO ECHOES ON NU-D");
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            option = scn.nextInt();
            scn.nextLine();  

            if (option == 1) {
                signup(scn);
            } else if (option == 2) {
                login(scn);
            } else if (option == 3) {
                System.out.println("Exititing, Thank you!");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
        scn.close();
    }

    public static void signup(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        String password;
        while (true) {
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (password.length() < 6) {
                System.out.println("Password too short. It should be at least 6 characters.");
            } else if (!password.matches(".*\\d.*")) {
                System.out.println("Password should contain at least one digit.");
            } else if (!password.contains("@")) {
                System.out.println("Password should contain at least one special character (@).");
            } else {
                System.out.println("Your password is strong.");
                break;
            }
        }

        
        System.out.print("Enter full name: ");
        String fullname = scanner.nextLine();
        System.out.print("Enter student number: ");
        String studentNumber = scanner.nextLine();
        System.out.print("Enter section: ");
        String section = scanner.nextLine();

        
        usernames[userCount] = username;
        passwords[userCount] = password;
        fullnames[userCount] = fullname;
        studentNumbers[userCount] = studentNumber;
        sections[userCount] = section;
        userCount++;

        System.out.println("Signup successful! Returning to the main menu...\n");
        
    }

    public static void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

       
        for (int i = 0; i < userCount; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                System.out.println("Login successful!");
                
                MainMenu();
            }
            else{
                System.out.println("Invalid username or password.");
                }
        }
        
    }
    public static void MainMenu(){
        int menu;

       do {  
           Scanner scan = new Scanner(System.in); 
           System.out.println("\nMain Menu: ");
           System.out.println("[1] Freedom Wall");
           System.out.println("[2] Profile");
           System.out.println("[3] Logout");
           System.out.print("Enter your choice: ");
           menu = scan.nextInt();

           switch (menu) {
               case 1:
                   System.out.println("Freedom Wall");
                   FreedomWallMenu();  
                   break;
               case 2:
                   System.out.println("Profile");
                   ProfileMenu();  
                   break;
               case 3:
                   System.out.println("Logout");
                   System.out.println("Thank you!");
                   break;
               default:
                   System.out.println("Invalid choice! Please choose again.");
           }
       } while (menu != 3);  
   }

   public static void FreedomWallMenu() {
       int fdmenu;
       Scanner scan = new Scanner(System.in);  

       System.out.println("\nFreedom Wall!");
       System.out.println("[1] Create");
       System.out.println("[2] Edit");
       System.out.println("[3] Delete");
       System.out.println("[4] Search");
       System.out.println("[5] Feed");
       System.out.println("[6] Back to Menu");

       System.out.print("Enter your choice: ");
       fdmenu = scan.nextInt();

       switch (fdmenu) {
           case 1:
               System.out.println("Create");
               break;
           case 2:
               System.out.println("Edit");
               break;
           case 3:
               System.out.println("Delete");
               break;
           case 4:
               System.out.println("Search");
               break;
           case 5:
               System.out.println("Feed");
               break;
           case 6:
               System.out.println("Back to Menu!");
               break;  
           default:
               System.out.println("Invalid choice! Please choose again.");
       }
   }

   public static void ProfileMenu() {
       int promenu;
       Scanner scn = new Scanner(System.in);  

       System.out.println("\nProfile");
       System.out.println("[1] Username");
       System.out.println("[2] Fullname");
       System.out.println("[3] Student No.");
       System.out.println("[4] Section");
       System.out.println("[5] Edit");
       System.out.println("[6] Back to Menu!");

       System.out.print("Enter your choice: ");
       promenu = scn.nextInt();

       switch (promenu) {
           case 1:
               System.out.println("Username");
               break;
           case 2:
               System.out.println("Fullname");
               break;
           case 3:
               System.out.println("Student No.");
               break;
           case 4:
               System.out.println("Section");
               break;
           case 5:
               System.out.println("Edit");
               break;
           case 6:
               System.out.println("Back to menu!");
               break; 
           default:
               System.out.println("Invalid choice! Please choose again.");

               scn.close();
       }
   }
}
