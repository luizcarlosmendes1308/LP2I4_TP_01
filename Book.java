public class Book{
	private String name;
	private Author [] authors;
	private	double price;
	private int qty = 0;

	public Book(String name, Author[] authors, double price, int qty)
	{
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;		
	}
	
	public String getName()
	{
		return name;
	}

	public Author[] getAuthors()
	{
		return authors;
	}
	
	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public int getQty()
	{
		return qty;
	}
	
	public void setQty(int qty)
	{
		this.qty = qty;
	}

	public String toString()
	{
		return "Book[name= " +this.name+", authors = {"+this.authors+"}, price= "+this.price+", qty = "+this.qty+"]"; 
	}
	
	public String getAuthorNames()
	{
		String names = "";
		for(Author author : authors){
			names += author.getName();
		if(!authors[authors.length-1].equals(author)) {
		names += ",";
		}
	}
	return names;
	}
}
