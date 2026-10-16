List<Vehicle> availability = dealership().stream()
  .flatMap(dealer->dealer.getInventory())
  .filter(vehicle->vehicle.getModel().equals("SUV") && vehicle.isAvailable());

Set<Vehicle> features = dealrship().stream()
  .flatMap(vehicle->vehicle.getFeatures().stream()
           .collect(Colletors.toSet());

Optional<Allocation> order = orderRepository.findById(orderId)
  .flatMap(Order::getAllocation)
  .flatMap(Allocation::getCarrier);












  
