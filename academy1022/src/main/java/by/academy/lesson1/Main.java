package by.academy.lesson1;

public class Main {
	public static void main (String[] args) {
		Cat cat1=new Cat();
		Cat cat2=new Cat(1);
		Cat cat3=new Cat(2, "Vasya");
		
		//cat3.eat();
		
		//cat1.sleep();
		
		//cat1.grow(3);
		 System.out.println(cat2.getAge());
		 
		 System.out.println(cat3.getNickname());
		 
		cat2.setAge(100);
		 System.out.println(cat2.getAge());
		 
		 cat3.setNickname("Myrka");
		 System.out.println(cat3.getNickname());
	}
}
