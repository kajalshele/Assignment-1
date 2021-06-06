public class mainPizzaOrder {
    public static void main(String[] args) {
      Pizza p=new Pizza("Reshma","small","magherita",2,"Navi mumbai");
      System.out.println(p.placeInCart("magherita"));
      p.placeInCart("babyCorn");
      p.setTopings("Mushroom,corn,onion");
      p.orderPizza(p);
      p.bill(p);
      System.out.println(p+"/n");
      
      Pizza pi=new Pizza();
      pi.setCustomerName("Maria");
      pi.placeInCart("Baby Corn");
      pi.setTopings("Mushroom,Paneer");
      pi.setAddress("Mumbai");
      pi.orderPizza(pi);
      pi.bill(pi);
      System.out.println(pi);
      System.out.println("----------------------------");

      BurgerPizza bu=new BurgerPizza();
      bu.setCustomerName("Rohit");
      bu.placeInCart("BurgerPizza");
      bu.setTopings("Cheese,Chicken");
      bu.setAddress("Mumbai");
      bu.orderPizza(bu);
      bu.bill(bu);
      System.out.println(bu);
      System.out.println("----------------------------");



    }
}
