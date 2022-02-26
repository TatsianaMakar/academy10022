package by.academy.lesson2.operators;

public class SimpleOperators {

	public static void main(String[] args) {
		int number = -5;
		System.out.println(number);

		boolean bool = true;
		bool = !bool;
		System.out.println(bool);

		System.out.println((int) 'A');
		char a = 'A';
		a = (char) (a + 1);
		System.out.println(a);

		int number1 = 10;
		System.out.println(number1);
		number1 += 10;
		System.out.println(number1);
		number1 -= 10;
		System.out.println(number1);
		number1 *= 10;
		System.out.println(number1);
		number1 /= 10;
		System.out.println(number1);
		number1 %= 10;
		System.out.println(number1);

		int i = 1;
		i++;
		System.out.println(i);
		i += 1;
		System.out.println(i);
		i = i + 1;
		System.out.println(i);

		int j = 1;
		--i;
		++i;
		j++;
		--j;
		System.out.println(j++);
		System.out.println(++j);

	}

}
