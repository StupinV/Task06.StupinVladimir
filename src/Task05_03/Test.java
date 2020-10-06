package Task05_03;

import java.util.*;
 
public class Test {
	
    public static void main(String[] args) {
    	
        Shop megamarket = new Shop("Megamarket");
        megamarket.addCustomerToShopList(new Customer("Москва", "Понедельник", 18_15_20));
        megamarket.addCustomerToShopList(new Customer("Минск", "Вторник", 15_13_12));
        megamarket.addCustomerToShopList(new Customer("Киев", "Среда", 10_5_15));
        
        System.out.println("\nsort by End_Place:");
        List<Customer> listSortByEndPlace = megamarket.getListByEndPlace("Минск");
        for (Customer c : listSortByEndPlace) {
            System.out.println(c);
        }
        
        System.out.println("\nprint customers by day:");
        List<Customer> listSortByDay = megamarket.getListByDay("Вторник");
        for (Customer c : listSortByDay) {
            System.out.println(c);
        }
        
        System.out.println("\nsort by Time:");
        List<Customer> listSortByTime = megamarket.getListByTime(18_15_20);
        for (Customer c : listSortByTime) {
            System.out.println(c);
        }
    }
}
 
class Shop {
    private ArrayList<Customer> customersList = new ArrayList<>();
 
    Shop(String shopName) {
    }
 
    void addCustomerToShopList(Customer customer) {
        customersList.add(customer);
    }
 
    List<Customer> getListByDay(String Day) {
        List<Customer> list = new ArrayList<>();
        for (Customer c : customersList) {
            if (c.getDay() == Day ) {
                list.add(c);
            }
        }
        return list;
    }
 
    List<Customer> getListByEndPlace(String EndPlace) {
        List<Customer> list = new ArrayList<>();
        for (Customer c : customersList) {
                    if (c.getEndPlace() == EndPlace) {
                        list.add(c);
                    }
                }
        return list;
    }
 
    List<Customer> getListByTime(int time) {
        List<Customer> list = new ArrayList<>();
        for (Customer c : customersList) {
            if (c.getTime() > 16_19_20) {
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
    private String EndPlace;
    private String Day;
    private int Time;

    Customer(String EndPlace, String Day, int Time) {
        this.EndPlace = EndPlace;
        this.Day = Day;
        this.Time = Time;
    }
 
    public String getEndPlace() {
        return EndPlace;
    }
 
    public String getDay() {
        return Day;
    }
 
    public int getTime() {
        return Time;
    }
 
    public String toString() {
        return String.format("ID: %d\t End_Place: %s\t Day: %s\t Time %d\t ",
                id, EndPlace, Day, Time);
    }
 
}