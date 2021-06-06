public class BurgerPizza extends Pizza{
    public void setPrice(){
        final int burgerPizzaPrice=200;
  }

    @Override
    public void bill(Pizza k) {
        k.setName("BurgerPizza");
        int bill =k.getQuantity()*200;
        System.out.println("+++++++++++PIZZA BILL++++++++++++++");
        System.out.println("   Thanks for your order "+k.getCustomerName()+"\n" +
                "   Your order is "+k.getQuantity() +" "+ k.getName()+"\n   With Extra Toppings "+k.getTopings()+"\n   Total bill is: "+bill+" /- Only \n   Visit again Sir/Madam");
        System.out.println("+++++++++++PIZZA BILL++++++++++++++");

    }
}
