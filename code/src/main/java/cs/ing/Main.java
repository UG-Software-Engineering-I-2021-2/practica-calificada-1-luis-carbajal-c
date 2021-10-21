package cs.ing;

import java.util.logging.Logger;

public class Main {
    static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("Ingenieria de Software I - Practica Calificada 1:");

        User u1 = new User(1);
        String id = String.valueOf(u1.getId());
        logger.info(id);
    }
}
