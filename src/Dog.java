    class Dog implements HasSound {
        @Override
        public void makeSound(){
            System.out.println("Woof!");
        }
    }
    class Cat implements HasSound {
        @Override
        public void makeSound(){
            System.out.println("Meow!");
        }
    }

    class Main {
        public static void main(String[] args) {
            Dog dog = new Dog();
            Cat cat = new Cat();
            dog.makeSound();
            cat.makeSound();
        }
    }

