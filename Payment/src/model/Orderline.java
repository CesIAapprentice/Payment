package model;
import java.util.HashMap;

public class Orderline {
	
	private HashMap<Product, Integer> orderDetail;

// ----------------------------------------------------------------
// CONSTRUCTOR		
	
	public Orderline() {
		this.orderDetail = new HashMap<Product, Integer>();
	}
	
// ----------------------------------------------------------------
// CONSTRUCTOR		

	public HashMap<Product, Integer> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(HashMap<Product, Integer> orderDetail) {
		this.orderDetail = orderDetail;
	}
}