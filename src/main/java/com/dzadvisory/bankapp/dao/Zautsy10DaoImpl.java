package com.dzadvisory.bankapp.dao;

import com.dzadvisory.bankapp.entity.Zautsy10;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class Zautsy10DaoImpl implements Zautsy10Dao{

    // Les interactions entre la base de données et les beans entités (entities) sont assurées par entityManager
    private EntityManager entityManager;

    // Initialisation du variable query par la requête SQL
    // les requêtes doivent être définies dans applications.properties
    @Value("${client.autorisation.query}")
    private String query;

    @Autowired
    // Injection de l'interface EntityManager dans le constructeur
    public Zautsy10DaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    // Implémentation de la méthode retournant les autorisations du client
    // @PathVariable vous permet de lire la valeur passée dans l'URL
    public List<Zautsy10> getClientAutorization(@PathVariable String clientId) {

        // entityManager a besoin d'une session (interface entre l'application java et Hibernate)
        // c'est cette instance de Session qui nous permet de définir nos requêtes SQL
        Session currentSession = entityManager.unwrap(Session.class);
        // Injecter la requête "query" dans currentSession
        Query<Zautsy10> theQuery = currentSession.createQuery(query);
        // set.parameter(name="variable dans la requête", variable de la méthode) vous permet d'associer la variable
        // clientId définie dans l'argument de la méthode avec la variable clientId définie dans la requête
        theQuery.setParameter("clientId", clientId);
        // les résultats vont être stockées dans la variable clientAutorization
        List<Zautsy10> clientAutorization = theQuery.getResultList();

        return clientAutorization;
    }
}
