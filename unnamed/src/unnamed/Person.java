package unnamed;

public class Person {
	private String name;
	private int age;
	private String email;

	
	Person(String name, int age2, String email){
		this.name = name;
		this.age = age2;
		this.email = email;
	}
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age='" + age + '\'' + ", email='" + email + '\'' +'}';
    }
}