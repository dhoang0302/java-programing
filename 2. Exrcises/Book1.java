class Author {
    private String name;
    private String email;
    private char gender;

    public Author() {
    }



    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        }else{
            System.out.println("Gender of 'm' or 'f'");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        }else{
            System.out.println("Gender of 'm' or 'f'");
        }
    }

    @Override
    public String toString() {
        return "Author[" + "name=" + name + ",email=" + email + ",gender=" + gender + ']';
    }
}


public class Book1 {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book1(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book1(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" + "name=" + name + "," + author + ",price=" + price + ",qty=" + qty + ']';
    }
}

class TestBook{
    public static void main(String[] args) {
        Book1 book = new Book1("Java", new Author("Dhoang", "Viethoang030207@gmail.com", 'm'), 20.4,6);
        System.out.println(book);
    }
}