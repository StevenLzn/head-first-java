public class Player {
  int number;
  
  public void guess(){
    java.util.Random randomGenerator = new java.util.Random();
    number = randomGenerator.nextInt(10);
  }
}