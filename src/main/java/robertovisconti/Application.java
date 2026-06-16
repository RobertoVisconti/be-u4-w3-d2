package robertovisconti;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    // Serve per connettersi al DB usando la Persistence Unit
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("u4d12pu");

    public static void main(String[] args) {

        // EntityManager è il ponte tra il codice java e le tabelle del DB, grazie ad esso possiamo mappare gli oggetti creati nel DB, inoltre nel file persistence.xml
        // andrà creata una class in questo caso : <class>robertovisconti.entities.Evento</class> per poter dire ad hibernate dove andare a cercare le classi da mappare
        EntityManager entityManager = entityManagerFactory.createEntityManager();
    }
}
