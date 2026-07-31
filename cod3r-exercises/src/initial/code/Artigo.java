package initial.code;

import java.time.LocalDate;

public class Artigo {
    // public static void main(String[] args) {
    //     countHello();
    // }

    private String title;
    private String autor;
    private LocalDate publicationDate;  
    private String category;

    public Artigo (String title, String autor, LocalDate publicationDate, String category) {
        this.title = title;
        this.autor = autor;
        this.publicationDate = publicationDate;
        this.category = category;
    }

    public static void countHello() {
        int var = 0;
        for (int i = 0; i < 10; i++) {
            var++;
            System.out.println("Hello, World! - ");
            System.out.println(var + "\n");
        }
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Artigo [autor=" + autor + ", category=" + category + ", publicationDate=" + publicationDate + ", title=" + title + "]";
    }
}
