
import java.util.*;
class LibraryMember {

    String Category;
    int memberID;
    String department;
    int NoOfBooks;

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNoOfBooks() {
        return NoOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        NoOfBooks = noOfBooks;
    }
}

public class LibraryApplication{

    public static void borrowBook(LibraryMember L){
        int n= L.getNoOfBooks();
        n++;
        L.setNoOfBooks(n);
    }

    public static void returnBook(LibraryMember L){
        int n= L.getNoOfBooks();
        n--;
        L.setNoOfBooks(n);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        LibraryMember M= new LibraryMember();
        M.setCategory("Comp");
        M.setMemberID(1435);
        M.setDepartment("Sci");
        M.setNoOfBooks(54);

        String choice;
        System.out.println("Enter the choice: (B for Borrowed, R for Return and E for Exit)");
        do {
            choice=sc.nextLine();
            switch (choice) {
                case "B":
                    borrowBook(M);
                    break;
                case "R":
                    returnBook(M);
                    break;
                case "E":
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (!choice.equals("E"));


        System.out.println("The Category is "+M.getCategory());
        System.out.println("The ID is "+M.getMemberID());
        System.out.println("The Department is "+M.getDepartment());
        System.out.println("The No of Books Borrow is "+M.getNoOfBooks());

        sc.close();
    }



}

