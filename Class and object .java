public class Car {
  String colour;
  String model;
  int year;
  void displayDetails(){
    System.out.println("Model=" +model);
    Systen.out.println("Colour=" +colour);
    System.out.println("Year=" +year);
  }
  public static void main (string[] args){
    Car mycar=new Car();
    mycar.colour="Red";
    mycar.model="Toyota";
    mycar.year=2020;
    mycar.displayDetails();
  }
}
