class Model{
  private String modelType;
  private String variant;
  private double price;

Model(String modelType, String variant, double price){
  this.modelType=modelType;
  this.variant = variant;
  this.price=price;
  }

public String getModelType(){
  return modelType;
}

public String getVariant(){
  return variant;
}

public double getPrice(){
  return price;
}

}
