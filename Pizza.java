import java.util.LinkedList;

public class Pizza {

    private String customerName;
    private String pizzaSize;
    private String name;
    private int quantity;
    private String topings;
     private String address;
     final int price=300;

    LinkedList pizzaList =new LinkedList();

    public Pizza() {
        quantity=1;
        pizzaSize="small";
    }

    public Pizza(String customerName, String size, String name, int quantity, String address) {
        this.customerName = customerName;
        this.pizzaSize = size;
        this.name = name;
        this.quantity = quantity;
         this.address = address;
        }

    @Override
    public String toString() {
        return "Pizza{" +
                "customerName='" + customerName + '\'' +
                ", size='" + pizzaSize + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", topings='" + topings + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", list=" + pizzaList +
                '}';
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTopings() {
        return topings;
    }

    public void setTopings(String topings) {
        this.topings = topings;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public LinkedList getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(LinkedList pizzaList) {
        this.pizzaList = pizzaList;
    }

    public LinkedList placeInCart(String name){

        pizzaList.add(name);
        setName(name);;
        return pizzaList;
    }

     public LinkedList removeFromCart(String item){
          pizzaList.remove(item);
          return pizzaList;

     }
   public void orderPizza(Pizza l){
       System.out.println("Your order is placed!!!"+l.customerName+ " It is in process");


   }

   public void bill(Pizza k){

       int bill =k.quantity*300;
       System.out.println("+++++++++++PIZZA BILL++++++++++++++");
       System.out.println("   Thanks for your order "+k.customerName+"\n" +
               "   Your order is "+k.quantity +" "+ k.name +"\n   With Extra Toppings "+k.topings+"\n   Total bill is: "+k.quantity*300+" /- Only \n   Visit again Sir/Madam");
       System.out.println("+++++++++++PIZZA BILL++++++++++++++");

   }




}
