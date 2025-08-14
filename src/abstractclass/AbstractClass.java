package abstractclass;

abstract class Media {
    int id;
    String description;

    public Media(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public abstract void readData();

    public abstract void displayData();
}

class Book extends Media {
    int pageCount;

    public Book(int id, String description) {
        super(id, description);
        pageCount = 200;
    }

    public void readData() {
        System.out.println("Reading book with ID: " + id + ", Description: " + description + ", Page Count: " + pageCount);
    }

    public void displayData() {
        System.out.println("Displaying book with ID: " + id + ", Description: " + description + ", Page Count: " + pageCount);
    }
}

class CD extends Media {
    float pTime;

    public CD(int id, String description) {
        super(id, description);
    }

    @Override
    public void readData() {
        super.id = 2;
        super.description = "New CD";
        pTime = 10.5f;
    }

    @Override
    public void displayData() {
        System.out.println("Displaying CD with ID: " + id + ", Description: " + description + ", Play Time: " + pTime + " minutes");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Book book = new Book(1, "Sample Book");
        book.readData();
        book.displayData();
        CD cd = new CD(3, "Sample CD"  );
        cd.readData();
        cd.displayData();
    }
}
