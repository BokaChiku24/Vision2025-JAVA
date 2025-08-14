package wrapperclass;

class Book {
    String bookName, authorName, bookAccount, publisherName, issueDate, returnDate;
    int bookPrice;
    char bookStatus;
    Book(){
        bookName = "Java Complete Reference";
        authorName = "Ken Follett";
        bookAccount = "1234567890";
        publisherName = "O'Reilly";
        issueDate = "2021-01-01";
        returnDate = "2021-01-15";
        bookPrice = 350;
        bookStatus = 'I';
    }

    Book(String bookName, String authorName, String bookAccount, String publisherName, String issueDate, String returnDate, int bookPrice, char bookStatus){
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookAccount = bookAccount;
        this.publisherName = publisherName;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.bookPrice = bookPrice;
        this.bookStatus = bookStatus;
        displayBookDetails();
    }

    void displayBookDetails(){
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("Book Account: " + bookAccount);
        System.out.println("Publisher Name: " + publisherName);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Book Price: " + bookPrice);
        System.out.println("Book Status: " + bookStatus);
    }

    void checkStatus(){
        if(bookStatus == 'I'){
            System.out.println("Book is issued.");
        }
        else if(bookStatus == 'R'){
            System.out.println("Book is returned.");
        }
        else{
            System.out.println("Invalid book status.");
        }
    }
}

public class BookStatus {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.checkStatus();

        Book book2 = new Book("Python Programming", "John Doe", "9876543210", "Packt Publishing", "2021-02-01", "2021-02-15", 250, 'I');
        book2.checkStatus();
    }
}
