class MumbaiStore extends PizzaStore{
  public Pizza createPizza(String type){
    if(type.equals("Cheese"))
      return new MumbaiStyleCheesePizza();
    else
      return null;
  }
}

