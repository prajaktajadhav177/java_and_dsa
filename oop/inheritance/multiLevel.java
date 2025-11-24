class InheritanceDemo{

        public static void main(String[] args){

               Dog d1=new Dog();
	       d1.eat();
	       d1.legs=4;
	       d1.breed="XYZ";
		d1.Breed();
        }

}
class Animal{

                String color;

                void eat(){

                        System.out.println("Eats");
                }

                void breathe(){

                                 System.out.println("Breaths");
                }

}


class Mammal extends Animal{
	int legs;

}

class Dog extends Mammal{

	String breed;
	void Breed(){
	System.out.println(breed);
}
}
