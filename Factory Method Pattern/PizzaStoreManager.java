class PizzaStoreManager{
  public static void main(String[] a){
  	
  	System.out.println("\nOrdering for Veggie Pizza from the Pune Store:");
    PizzaStore puneStore = new PuneStore();
    puneStore.orderPizza("Veggie");

    System.out.println("==================");

    System.out.println("Ordering for Cheese Pizza from the Mumbai Stores:");
    PizzaStore mumbaiStore = new MumbaiStore();
    mumbaiStore.orderPizza("Cheese");
  }
}

