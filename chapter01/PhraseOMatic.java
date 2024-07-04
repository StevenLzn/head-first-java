public class PhraseOMatic {
  public static void main(String[] args){
    String[] wordListOne = {"agnostic", "opinionated", "voice activated", "AI enabled", "strongly typed"};
    String[] wordListTwo = {"asynchronous", "event driven", "service oriented", "IoT", "cloud native"};
    String[] wordListThree =  {"framework", "library", "REST API", "pipeline", "repository"};
    
    int listOneLength = wordListOne.length;
    int listTwoLength = wordListTwo.length;
    int listThreeLength = wordListThree.length;
    
    java.util.Random randomGenerator = new java.util.Random();
    int randOne = randomGenerator.nextInt(listOneLength);
    int randTwo = randomGenerator.nextInt(listTwoLength);
    int randThree = randomGenerator.nextInt(listThreeLength);

    String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];
	
    System.out.println("What we need is a " + phrase);
  }
}