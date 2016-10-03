public class Animal {
    private String mName;
	private int mAge;
	
	public Animal() {
		
	}
	public void setName(String name) {
		this.mName = name;
	}
	
	public String getName() {
		return this.mName;
	}
	
	public void setAge(int age) {
		this.mAge = age;
	}
	
	public int getAge() {
		return this.mAge;
	}
	
	public abstract void eat();
	public abstract void sleep();
	
}

class Dog extends Animal {
	public Dog() {
		
	}
	
	public void eat() {
		System.out.println("I eat dog food.");
	}
}