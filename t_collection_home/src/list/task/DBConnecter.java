package list.task;

import java.util.ArrayList;

import list.task.fruit.Fruit;
import list.task.product.Customer;
import list.task.product.Product;
import list.task.user.User;
import list.task.food.Food;

public class DBConnecter {
	protected DBConnecter() {;}
	public static ArrayList<User> users = new ArrayList<User>();
	public static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	public static ArrayList<Food> foods = new ArrayList<Food>();
	public static ArrayList<Product> products = new ArrayList<Product>();
	public static ArrayList<Customer> customers = new ArrayList<Customer>();
}
