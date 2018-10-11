package model;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Customer {
	
	private HashMap<Order, Orderline> orders;
	private Order tempOrder;
	
	private String name ;
	private String deliveryAddress;
	private String phone;
	
// ----------------------------------------------------------------
// CONSTRUCTOR	
	
	public Customer(String name, String deliveryAddress, String phone) {
		this.name = name;
		this.deliveryAddress = deliveryAddress;
		this.phone = phone;
		
		this.orders = new HashMap<Order, Orderline>();
		this.tempOrder = createNewOrder();
	}
	
// ----------------------------------------------------------------
// METHODS
	
	public boolean buyProduct(Product product, Integer quantity) {
		Orderline tempOrderline = tempOrder.getOrderline();
		HashMap<Product, Integer> tempOrderdetail = tempOrderline.getOrderDetail();
		tempOrderdetail.put(product, quantity);
		return true;
	}
	
	public Order createNewOrder() {
		String orderNumber = String.valueOf(this.orders.size());
		Date now = Calendar.getInstance().getTime();
		return new Order(now , false, orderNumber, 0);
	}
	
	public boolean closeOrder() {
		this.orders.put(tempOrder, tempOrder.getOrderline());
		tempOrder.updatePrice();
		this.tempOrder = createNewOrder();
		return true;
	}
	
// ----------------------------------------------------------------
// GETTERS & SETTERS
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public HashMap<Order, Orderline> getOrders() {
		return orders;
	}

	public void setOrders(HashMap<Order, Orderline> orders) {
		this.orders = orders;
	}
}