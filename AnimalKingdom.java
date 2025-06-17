class Animal {
		    public void eat() {
		        System.out.println("This animal eats food.");
		    }

		    public void sleep() {
		        System.out.println("This animal sleeps at night.");
		    }

		    public void makeSound() {
		        System.out.println("This animal makes a sound.");
		    }
		}

		
		class Dog extends Animal {
		    
		    public void makeSound() {
		        System.out.println("Dog barks: Woof woof!");
		    }

		    public void fetch() {
		        System.out.println("Dog fetches the ball.");
		    }

		    public void wagTail() {
		        System.out.println("Dog wags its tail happily.");
		    }
		}

		
		class Cat extends Animal {
		   
		    public void makeSound() {
		        System.out.println("Cat meows: Meow!");
		    }

		    public void climb() {
		        System.out.println("Cat climbs a tree.");
		    }

		    public void purr() {
		        System.out.println("Cat purrs softly.");
		    }
		}

		
		public class AnimalKingdom {
		    public static void main(String[] args) {
		        Dog dog = new Dog();
		        Cat cat = new Cat();

		        System.out.println("--- Dog ---");
		        dog.eat();
		        dog.sleep();
		        dog.makeSound();
		        dog.fetch();
		        dog.wagTail();

		        System.out.println("\n--- Cat ---");
		        cat.eat();
		        cat.sleep();
		        cat.makeSound();
		        cat.climb();
		        cat.purr();
		    }
		}