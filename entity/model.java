class car_model{
  private String model;
  private String variant;
  private double price;

car_model(String model, List<String> variant, double price){
  this.model=model;
  this.variant = variant;
  this.price=price;
  }

public String getModel(){
  return model;
}

public String getVariant(){
  return variant;
}

public double getPrice(){
  return price;
}

}
