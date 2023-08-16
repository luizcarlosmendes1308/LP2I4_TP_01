public class Author{
	private String name;
	private	String email;
	private char gender;

	public Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	
public String getName()
	{
		return name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public char getGender()
	{
		return gender;
	}

	public String toString()
	{
		return "Author[name= " + this.name+", email= "+this.email+" ,gender= "+this.gender+"]";
	}

	public static void main(String[] args) {

	//Testando construtor
	Author autor = new Author("Luiz","luizmendes1308@gmail.com", 'm');
	//Verificando o método toString()
	System.out.println(autor.toString());
	//testando os getters

	System.out.println("Nome: "+autor.getName());
	System.out.println("Email: "+autor.getEmail());
	System.out.println("Gender: "+autor.getGender());
	}
}