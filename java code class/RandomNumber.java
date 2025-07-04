import java.util.random;


public class RandomNumber{
    public static void main (string args[]){
        Random random = new Random();


        //create a variable to store the random number generated.
        int randomNew = random.nextInt();

        //print the random number
        system.out.printf("Random number is : %d%n",randomNum);

        //generating a number within a range
        int randomNumInRange = random.nextInt(20) + 1;
        system.out.printf("Random Number in range is :%d%n", randomNumInRange);


        //generating a float point or decimal number
        double floatPointNum = random.nextDouble();
        system.out.printf("Random Number in range is :%.2f%n", floatPointNum);

        //generating a float point value within the range
        double min = 10.0;
        double max = 20.0;

        double randomFloatPointIntNumInRange = min + (max - min)* random.nextDouble();

        //print
        system.out.printf("Random double number in range is : %.2f%n"RandomFloatPointInRange);

        //GENERATE A RANDOM BOOLEAN VALUE
        BOOLEAN BOOLEANValue = random.nextBoolean();

        //print
        system.out.printf("Random boolean value is :%b%n", booleanValue);98
    }
}

