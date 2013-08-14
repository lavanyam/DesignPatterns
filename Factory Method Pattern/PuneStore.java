class PuneStore extends PizzaStore{
  Pizza createPizza(String type){
    if(type.equals("Cheese"))
      return new PuneStyleCheesePizza();
    else if (type.equals("Veggie"))
      return  new PuneStyleVeggiePizza();
    else
      return null;
  }
}

