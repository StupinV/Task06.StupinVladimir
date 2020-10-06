package Task05_01;

import java.util.*;

import static java.util.Collections.*;
 
public class Test {
	
    public static void main(String[] args) {
    	
        Shop megamarket = new Shop("Megamarket");
        megamarket.addCustomerToShopList(new Customer("Дарья", "Донцова", "Книга_Донцовой", "Сегмент", 2010));
        megamarket.addCustomerToShopList(new Customer("Андрей", "Фамильян", "Погохопер", "Белпост", 2005));
        megamarket.addCustomerToShopList(new Customer("Богдан", "Мурахоедов", "Мрангенштуйн", "Роспост", 2018));
        
        System.out.println("\nsort by Author:");
        List<Customer> listSortByAutor = megamarket.getListByAutor("Дарья", "Донцова");
        for (Customer c : listSortByAutor) {
            System.out.println(c);
        }
 
        System.out.println("\nsort by Publicator:");
        List<Customer> listSortByPublicator = megamarket.getListByPublicator("Сегмент");
        for (Customer c : listSortByPublicator) {
            System.out.println(c);
        }
 
        System.out.println("\nprint customers by Year:");
        List<Customer> listSortByYear = megamarket.getListByYear(2007, 2100);
        for (Customer c : listSortByYear) {
            System.out.println(c);
        }
 
 
    }
}
 
class Shop {
    private String shopName;
    private ArrayList<Customer> customersList = new ArrayList<>();
 
    Shop(String shopName) {
        this.shopName = shopName;
    }
 
    void addCustomerToShopList(Customer customer) {
        customersList.add(customer);
    }
 
    List<Customer> getListByAutor(String Author1, String Author2) {
        List<Customer> list = new ArrayList<>();
        for (Customer c : customersList) {
            if (c.getName() == Author1 && c.getName2() == Author2) {
                list.add(c);
            }
        }
        return list;
    }
 
    List<Customer> getListByPublicator(String publicator) {
        List<Customer> list = new ArrayList<>();
        for (Customer c : customersList) {
                    if (c.getPublicator() == publicator) {
                        list.add(c);
                    }
                }
        return list;
    }
 
    List<Customer> getListByYear(int diapazonStart, int diapazonEnd) {
        List<Customer> list = new ArrayList<>();
        for (Customer c : customersList) {
            if (c.getYear() >= diapazonStart && c.getYear() <=diapazonEnd) {
                list.add(c);
            }
        }
 
        return list;
    }
 
 
 
}
 
class Customer {
    {
        idGenerator++;
    }
 
    private static int idGenerator = 0;
    private int id = idGenerator;
    private String Author;
    private String Author2;
    private String Book;
    private String Publicator;
    private int Year;

    Customer(String Author, String Author2, String Book, String Publicator, int Year) {
        this.Author = Author;
        this.Author2 = Author2;
        this.Book = Book;
        this.Publicator = Publicator;
        this.Year = Year;
    }
 
    public String getName() {
        return Author;
    }
 
    public String getName2() {
        return Author2;
    }
 
    public String getName3() {
        return Book;
    }
 
    public String getPublicator() {
        return Publicator;
    }
 
    public int getYear() {
        return Year;
    }
 
    public String toString() {
        return String.format("ID: %d\t Author: %s\t Author2: %s\t Book %s \t Publicator: %s\t Year %d\t ",
                id, Author, Author2, Book, Publicator, Year);
    }
 
}
