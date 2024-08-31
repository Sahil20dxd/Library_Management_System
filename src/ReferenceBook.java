public class ReferenceBook extends Book {
    private String subject;

    // Constructor to initialize all attributes, including those from the superclass
    public ReferenceBook(String title, String author, String ISBN, boolean available, String subject) {
        super(title, author, ISBN, available);
        this.subject = subject;
    }

    // Getters and Setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Overriding the toString() method to include the subject
    @Override
    public String toString() {
        return "ReferenceBook{" +
                "Title='" + getTitle() + '\'' +
                ", Author='" + getAuthor() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", Available=" + isAvailable() +
                ", Subject='" + subject + '\'' +
                '}';
    }
}
