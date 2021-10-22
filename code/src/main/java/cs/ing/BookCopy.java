package cs.ing;

public class BookCopy {
    public enum State {
        AVAILABLE,
        TAKEN,
        RESERVED,
        DELAYED,
        IN_REPAIR
    }

    private final BookTitle bookTitle;
    private final Long id;
    private State state;

    public BookCopy(BookTitle bookTitle, Long id) {
        this.bookTitle = bookTitle;
        this.id = id;
        this.state = State.AVAILABLE;
    }

    public BookTitle getBookTitle() {
        return bookTitle;
    }

    public Long getId() {
        return id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
