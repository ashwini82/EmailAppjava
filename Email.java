import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int mailboxCapacity = 500;
    private String email;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String companySuffix = "srccompany.com";

    // costructor for firstname and lastname//
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // System.out.println("Email generated:" + this.firstName + " " +
        // this.lastName);

        // call method to ask department//
        this.department = setDepartment();
        System.out.println("New worker is : " + firstName + " , " + "Department is : " + this.department);
        // call method to generate random password//
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is : " + this.password);
        // combine elements to generate email//
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        // System.out.println("Your Email is :" + email);
    }

    // Ask for department//
    private String setDepartment() {
        System.out.print(
                "DEPARTMENT CODES : \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\n Enter the code : ");
        Scanner scan = new Scanner(System.in);
        int userAns = scan.nextInt();
        if (userAns == 1) {
            return "Sales";
        } else if (userAns == 2) {
            return "Development";
        } else if (userAns == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    // Generate random password//
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@&$%#";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // setmailbox capacity//
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // getmailbox capacity//
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    // set alternate email//
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // get alternate email//
    public String getAlternateEmail() {
        return alternateEmail;
    }

    // change password//
    public void changePassword(String password) {
        this.password = password;
    }

    public String getChangePassword() {
        return password;
    }

    // method to display info//
    public String displayInfo() {
        return "DISPLAY NAME : " + firstName + " " + lastName + "\nCOMPANY EMAIL : " + email + "\nMAILBOX CAPACITY : "
                + mailboxCapacity + "mb";
    }

}
