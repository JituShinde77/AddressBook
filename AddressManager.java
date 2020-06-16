import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.FileWriter;
import java.io.*;

public class AddressManage{
	public static void main(String[] ars)throws Exception{
                int choice = 1;
                Scanner sc = new Scanner(System.in);
                AddressBook addressBook = new AddressBook();
                addressBook.readData();
                while(choice != 0){
                        System.out.println("\n Enter your Choice:");
                        System.out.println("1. Add Person \n2. Delete Person \n3. Edit Person \n4. Show Address Book \n5. Sort \n6. Save \n0. Exit");
                        choice = sc.nextInt();
                        if (choice == 1)
                                addressBook.addPerson();
                        if (choice == 2)
                                addressBook.deletePerson();
                        if(choice == 3)
                                addressBook.editPerson();
                        if (choice == 4)
                                addressBook.displayData();
                        if (choice == 5)
                                addressBook.sortAddressBook();
                        if (choice == 6)
                                addressBook.save();
                        if(choice == 0)
                                break;
                }
        }
}
