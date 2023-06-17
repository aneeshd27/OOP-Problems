
public class Order 
{
	private int orderId;
	private String orderedFoods;
	private double totalPrice;
	 static String status;
	public Order(int orderId, String orderedFoods, double totalPrice, String status) {
		super();
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
		this.totalPrice = totalPrice;
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(String orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public static String getStatus() {
		return status;
	}
	public static void setStatus(String status) {
		Order.status = status;
	}
	public double calculateUnitPrice(int unitPrice)
	{
		totalPrice=totalPrice+(0.05*unitPrice);
		return totalPrice;
	}
	

}



import junit.framework.TestCase;

public class OrderTest extends TestCase 
{
	public static void main(String args[])
	{
		Order obj=new Order(101,"Burger",30,"Ordered");
		System.out.println("Order ID "+obj.getOrderId());
		System.out.println("Ordered Food "+obj.getOrderedFoods());
		System.out.println("Order ID "+obj.getStatus());
		System.out.println("Order ID "+obj.calculateUnitPrice(35));
		
	}

}
