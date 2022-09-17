import java.util.*;
import java.time.LocalDate;

// An exploration of basic input and output.
class BasicIO {

    // Reads and processes string input.
    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);
	LocalDate now = LocalDate.now();

	// get first input
	System.out.print("Enter your name: ");
	String name = stdin.nextLine();

	System.out.print("Enter your age: ");
	int years = stdin.nextInt();

	System.out.print("Enter your height: ");
	int height = stdin.nextInt();

	int year = now.getYear();
	int month = now.getMonthValue();
	int day = now.getDayOfMonth();

	// display output on console
	System.out.println("your name is " + name);
	System.out.println("your age is " + years);
	System.out.println("your day is " + years * 365);
	System.out.printf("%d년 0%d월 %d일 현재 %s(%d)의 키는 %dcm 입니다.", year, month, day, name, years, height);

	stdin.close();

    } // method main

} // class BASIC_IO
