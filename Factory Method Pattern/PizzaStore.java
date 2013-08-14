abstract class PizzaStore{
  Pizza pizza;
  void orderPizza(String type){
    pizza = createPizza(type);
    pizza.bake();
    pizza.cut();
    pizza.box();
  }
  abstract Pizza createPizza(String type);
}

