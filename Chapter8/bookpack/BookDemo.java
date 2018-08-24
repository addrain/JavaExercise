package bookpack;

class Book {
    private String title;
    private String author;
    private int pubDate;

    Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
    }
}

class BookDemo {
    public static void main(String args[]){
        Book books[] = new Book[3];

        books[0] = new Book("Java: A Beginner's Guide", "Schildt", 2018);
        books[1] = new Book("Java: The Complete Reference", "Schildt", 2018);
        books[2] = new Book("Introducing JavaFX 8 Programming", "Schildt", 2015);

        for(int i = 0; i < books.length; i++) books[i].show();
    }
}