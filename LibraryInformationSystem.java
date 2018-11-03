public class LibraryInformationSystem{
    //setupLibrary
    //setupLibrarian    
    //updateLibrary
    //removeBook
    //createClassification
    //registerPatron

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("History of Libraries in Nigeria");
        Book book2 = new Book();
        book2.setTitle("How Computer Networks Work");
        Book book3 = new Book();
        book3.setTitle("Learn Java in 21 Days");
        Library bestLibrary = new Library();
        Book[] our3Books = new Book[]{book1, book2, book3};
        bestLibrary.addBook(our3Books);
        Book[] retrieved = bestLibrary.getBooks();
        for(int i=0;i<our3Books.length;i++){
            System.out.println("book "+i+":"
                +retrieved[i].getTitle());
        }
    }

}
//Library
class Library{

    public Book[] getBooks(){
        return books;
    }

    //addBook
    boolean addBook(Book newBook){
        books[0]=newBook;
        return true;
    }
    //addBook
    boolean addBook(Book[] newBooks){
        books=newBooks;
        return true;
    }

    private Book[] books=new Book[20];
}
//Book
class Book{
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    private String title;
}
//Librarian
class Librarian{
    //receiveBook
    //approveRequest
    //rejectRequest
    //sourceBook
    //releaseBook
    //handleNonReturn
}
//Patron
class Patron{
    //requestBook
    Book requestBook(String title){
        //
        Book firstBook = new Book();
        return firstBook;
    }
    //receiveBook
    //returnBook
}
//Classification
class Classification{

}