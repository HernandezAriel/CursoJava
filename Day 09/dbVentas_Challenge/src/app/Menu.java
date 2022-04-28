package app;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

import database.*;
import models.*;

public class Menu {

    public static void menu(Store store)
    {
        DbClientControl dbClient = new DbClientControl();
        DbProductControl dbProduct = new DbProductControl();
        DbVendorControl dbVendor = new DbVendorControl();
        DbBillsControl dbBill = new DbBillsControl();
        Scanner scan = new Scanner(System.in);
        int option;
        boolean flag = true;


        while(flag)
        {
            System.out.println("-------- Menu -------- ");
            System.out.println("1- Insert Products");
            System.out.println("2- Insert Vendors");
            System.out.println("3-Insert Clients");
            System.out.println("4- Insert billing");
            System.out.println("5- Filter by Vendor");
            System.out.println("6- Filter Billings by Date");
            System.out.println("7- Exit");
            option = scan.nextInt();
            switch(option) {
                case 1:
                    double price;
                    int stock,minstock;

                    for(int i = 0; i<10; i++)
                    {

                        System.out.println("Enter the product price: ");
                        price = scan.nextDouble();

                        System.out.println("Stock: ");
                        stock = scan.nextInt();

                        System.out.println("Minimun Stock: ");
                        minstock = scan.nextInt();


                        dbProduct.insertProduct(new Product(price, stock, minstock));

                    }

                    break;

                case 2:

                    int day, month,year;
                    Date date;

                    for(int i = 0; i<5; i++)
                    {
                        Vendor  vendor = new Vendor();
                        System.out.println("Enter vendor First Name: ");
                        scan.nextLine();
                        vendor.setFirstName(scan.nextLine());
                        System.out.println("Enter vendor Last Name: ");
                        vendor.setLastName(scan.nextLine());
                        System.out.println("Enter vendor DNI: ");
                        vendor.setDni(scan.nextLine());
                        System.out.println("Enter vendor Address: ");
                        vendor.setAddress(scan.nextLine());
                        System.out.println("Enter vendor Salary: ");
                        vendor.setSalary(scan.nextDouble());
                        System.out.println("Enter vendor birthDate day: ");
                        day = scan.nextInt();
                        System.out.println("Enter vendor birthDate month: ");
                        month = scan.nextInt();
                        System.out.println("Enter vendor birthDate year: ");
                        year = scan.nextInt();
                        LocalDate birth = LocalDate.of(year, month, day);

                        date = Date.valueOf(birth);

                        vendor.setBirthSQL(date);

                        dbVendor.insertVendor(vendor);

                    }
                    break;
                case 3:


                    for(int i = 0; i<5; i++)
                    {
                        Client  client = new Client();

                        System.out.println("Enter client First Name: ");
                        scan.nextLine();
                        client.setFirstName(scan.nextLine());
                        System.out.println("Enter client Last Name: ");
                        client.setLastName(scan.nextLine());
                        System.out.println("Enter client DNI: ");
                        client.setDni(scan.nextLine());
                        System.out.println("Enter client Address: ");
                        client.setAddress(scan.nextLine());

                        System.out.println("Enter client birthDate day: ");
                        day = scan.nextInt();
                        System.out.println("Enter client birthDate month: ");
                        month = scan.nextInt();
                        System.out.println("Enter client birthDate year: ");
                        year = scan.nextInt();
                        LocalDate birth = LocalDate.of(year, month, day);

                        date = Date.valueOf(birth);
                        client.setBirthSQL( date);

                        dbClient.insertClient(client);
                    }
                    break;
                case 4:

                    int opt = 0;
                    for(int i = 1; i<=5; i++) {
                        for(int j = 0; j<3; j++)
                        {
                            boolean flag2 = true;
                            Bill bill = new Bill();
                            System.out.println("Client " +i + ": ");
                            bill.setClient(i);

                            System.out.println("Insert a Vendor  ID: ");
                            bill.setVendor(scan.nextInt());
                            System.out.println("PRODUCTS:  ");
                            while(flag2)
                            {

                                System.out.println("1- Add Product");
                                System.out.println("2- Continue");
                                opt = scan.nextInt();
                                switch(opt)
                                {
                                    case 1: 	System.out.println("Insert a product ID: ");
                                        bill.insertProducts(scan.nextInt());
                                        break;
                                    case 2:
                                        flag2 = false;
                                        break;
                                    default:
                                        System.out.println("Invalid Option");
                                        break;
                                }

                            }

                            dbBill.insertBill(bill);
                        }
                    }

                case 5:
                    int opv;
                    System.out.println("Enter vendor ID: ");
                    opv = scan.nextInt();
                    dbBill.selectBillVendor(opv);


                    break;
                case 6:
                    System.out.println("Enter  Year");
                    year = scan.nextInt();
                    System.out.println("Enter  Month");
                    month = scan.nextInt();
                    System.out.println("Enter Day");
                    day = scan.nextInt();
                    dbBill.selectBillByDate(year, month, day);

                    break;
                case 7: flag = false;
                    break;
                default: System.out.println("Invalid Option");
                    break;
            }
        }

    }

}