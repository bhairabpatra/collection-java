package utilclass;

import java.util.*;

public class UtilClassDemo {

    public void UtilClassDemo() {

        //date, tokenizer, scanner, calender class
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter some value from KB");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        System.out.println("Result" + (i + j));
        scanner.close();


        StringTokenizer stringTokenizer = new StringTokenizer("We have blocked 73,889 ads for you!", " ");
        while ((stringTokenizer.hasMoreTokens())) {
            System.out.println(stringTokenizer.nextToken());
        }


        Date date = new Date();
        System.out.println(date.toString());


        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println(calendar.get(Calendar.DATE));


        int[] numbers = {5, 2, 8, 1, 6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println(index);


        List<String> names = Arrays.asList("Sanjay", "Nishanth", "Santosh", "Abhisek", "Zuli");
        Collections.shuffle(names);
        System.out.println("shuffle" + names);
        Collections.sort(names);
        System.out.println("sort" + names);


        Random random = new Random();
        int randomNumber = random.nextInt(1000); // Generates a random number between 0 and 99
        System.out.println(randomNumber);


        double squareRoot = Math.sqrt(25);
        double powerResult = Math.pow(2, 3);
        System.out.println(squareRoot);
        System.out.println(powerResult);
    }

    public static void main(String[] args) {
        System.out.println("Some util class in java");
        UtilClassDemo utilClassDemo = new UtilClassDemo();
        utilClassDemo.UtilClassDemo();
    }
}
