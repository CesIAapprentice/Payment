package model;
import java.util.Date;
import java.util.HashMap;

public class Order {
	
	private Orderline orderline;

	private Date dateReceived;
	private Boolean isPrepaid;
	private String num;
	private Integer price;
	
// ----------------------------------------------------------------
// CONSTRUCTOR	
	
	public Order(Date dateReceived, Boolean isPrepaid, String num, Integer price) {
		this.dateReceived = dateReceived;
		this.isPrepaid = isPrepaid;
		this.num = num;
		this.price = price;
		this.orderline = new Orderline();
	}
	
// ----------------------------------------------------------------
// METHODS
	
	public void updatePrice() {
		HashMap<Product, Integer> orderDetail = this.orderline.getOrderDetail(); 
		for(Product product : orderDetail.keySet()) {
			this.price += orderDetail.get(product) * product.getPrice();
		}
	}
	
	public boolean dispatch() {
		return false;
	}
	
// ----------------------------------------------------------------
// GETTERS & SETTERS	

	public Date getDateReceived() {
		return dateReceived;
	}

	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}

	public Boolean getIsPrepaid() {
		return isPrepaid;
	}

	public void setIsPrepaid(Boolean isPrepaid) {
		this.isPrepaid = isPrepaid;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}


	public Orderline getOrderline() {
		return orderline;
	}


	public void setOrderline(Orderline orderline) {
		this.orderline = orderline;
	}	
}