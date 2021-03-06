package entities;

public class Employe {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employe() {
	}

	public Employe(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public Double getSalary() {
		return salary;
	}
	
	public void addSalary(double percentage) {
		salary += (salary * percentage) / 100;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + salary;
	}
}
