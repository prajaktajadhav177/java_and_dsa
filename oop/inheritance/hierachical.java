class InheritanceDemo{

	public static void main(String[] args){
	
	Dog d1=new Dog();
	d1.legs();
	Cat c1=new Cat();
	c1.legs();
	
	}

}

class Animal{
        void legs(){
                System.out.println("Legs");

        }

}

class Dog extends Animal{

	void eat(){
		System.out.println("Dog Eats");
	i
	}

	void breathe(){
		System.out.println("Dog breathe");
	
	}

}

class Cat extends Animal{

	void run(){
	
	 	System.out.println("Cat run");
	}

}
