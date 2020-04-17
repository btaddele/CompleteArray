import java.util.Arrays;
public class completearray {
    public static void main(String[] args) {
        int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};
        int y = 0;



// Declare sum variable, assign it initial value of zero
      for (int sum = 0; sum < numbers.length; sum++  ){
            y = y + numbers[sum];

      }
        System.out.println("The sum of arrays= " + y);
      }
}
