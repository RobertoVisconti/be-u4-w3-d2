package robertovisconti.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import robertovisconti.entities.Evento;

public class EventsDAO {

    // DAO stà per Data Access Object e ci serve per fornire dei metodi semplici da usare nel main nascondendo la complessità delle righe di codice


    // serve per poter parlare col DB, così al lancio dei nostri metodi essi verranno letti ed eseguiti dal DB
    private final EntityManager entityManager;

    public EventsDAO(EntityManager em) {
        this.entityManager = em;
    }


    // METODI
    public void save(Evento newEvento) {

        // Transazione, viene richiesta da Entity Manager per applicare le modifiche al DB
        EntityTransaction transaction = this.entityManager.getTransaction();
        transaction.begin(); // qui la lanciamo
        this.entityManager.persist(newEvento); // qui andiamo ad effettuare un operazione di persist, per far diventare l'oggetto Managed, ovvero che può essere gestito
        transaction.commit(); // questo mi permette di poter passare l'oggetto nuovo creato alla tabella nel DB, quindi effettuo un commit

        System.out.println("Il nuovo evento: " + newEvento + "è stato salvato nel DB correttamente.");
    }

}
