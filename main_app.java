package Java_basics;

import java.time.LocalDate;

public class main_app {
    public static void main(String[] args){
        // User user = new User("Samiat Bola-Matanmi", "1995-06-08");

        Book book = new Book("Deep Machines", "Samiat", 128);
        AudioBook audioBook = new AudioBook("something", "Olumide", 0);
        Ebook mybook = new Ebook("Machine Learning", "Samiat", 120, "PDF");
        // user.borrow(book);

        // System.out.printf("%s was born back in %s and he is now %d years old.\n", user.getName(), user.getBirthday(), user.age());
        // System.out.printf("%s has borrowed this books: %s \n", user.getName(), user.borredBooks());
        System.out.println(mybook.toString());

        
    }
    
}
