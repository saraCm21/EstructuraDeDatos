package doColections;

public class Estudiante {

	private int code;
	private String name;
	private String lastName;
	private String gender;
	private int semester;
	
	public Estudiante() {
		
	}

	public Estudiante(int code, String name, String lastName, String gender, int semester) {
		super();
		this.code = code;
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.semester = semester;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + lastName + " " + name + " Codigo: " + code +" Semestre: " + semester + " Genero: " + gender;
	}
}
