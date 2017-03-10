// Declare your class here. Do not use the 'public' access modifier.
    class MyBook extends Book {
        protected int price;

    /**
    *   Class Constructor
    *
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    /**
    *   Method Name: display
    *
    *   Print the title, author, and price in the specified format.
    **/
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
