public class TestBook {
    public static void main(String[] args) {
        //Criando e alocando o array de autores
        Author[] authors = new Author[2];
        authors[0] = new Author("Autor 01","autor01@somewhere.com.br",'m');
        authors[1] = new Author("Autor 02","autor02@nowhere.com.br",'m');

        //Declarando e alocando a instância de um booking
        Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(testeBook.toString());

        testeBook.setPrice(14.99);
        testeBook.setQty(59);

        System.out.println("Nome: "+testeBook.getName());
        System.out.println("Authors: "+testeBook.getAuthors());
        System.out.println("Price: "+testeBook.getPrice());
        System.out.println("Qty: "+testeBook.getQty());
        System.out.println("Authors names: "+testeBook.getAuthorNames());
    }
}