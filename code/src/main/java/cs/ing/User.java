package cs.ing;

import java.util.List;
import java.util.logging.Logger;

public class User {
    private static Logger logger = Logger.getLogger(User.class.getName());
    private final long id;
    List<BookCopy> takenCopies;

    public User(long id) {
        this.id = id;
    }

    public void reserveCopy(BookCopy copy) {
        BioAlert.getInstance().registerUser(this, copy);
    }

    public void unreserveCopy(BookCopy copy) {
        BioAlert.getInstance().removeUser(this, copy);
    }

    public long getId() {
        return id;
    }
}
