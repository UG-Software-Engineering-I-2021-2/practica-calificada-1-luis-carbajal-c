package cs.ing;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BioAlert {
    private static BioAlert instance;
    private Map<BookCopy, Queue<Long>> users;

    private BioAlert() {
        users = new HashMap<>();
    }

    public static BioAlert getInstance() {
        if(instance == null){
            instance = new BioAlert();
        }
        return instance;
    }

    public void registerUser(User user, BookCopy copy) {
        if (!users.containsKey(copy)) {
            Queue<Long> newQueue = new LinkedList<>();
            newQueue.add(user.getId());
            users.put(copy, newQueue);
        } else {
            users.get(copy).add(user.getId());
        }
    }

    public void removeUser(User user, BookCopy copy) {
        users.get(copy).remove(user.getId());
    }

    public void notify(BookCopy copy) {
        users.get(copy).remove();
    }
}
