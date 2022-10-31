package com.desafio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.desafio.entities.LocalidadeFaixa;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // criando ceps de teste
        // LocalidadeFaixa loc1 = new LocalidadeFaixa(null, "91050210", "", "");
        // LocalidadeFaixa loc2 = new LocalidadeFaixa(null, "93900000", "", "");
        // LocalidadeFaixa loc3 = new LocalidadeFaixa(null, "92500000", "", "");
        // LocalidadeFaixa loc4 = new LocalidadeFaixa(null, "99900000", "", "");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("desafio-cep");
        EntityManager em = emf.createEntityManager();

        // persistindo os dados
        // em.getTransaction().begin();
        // em.persist(loc1);
        // em.persist(loc2);
        // em.persist(loc3);
        // em.persist(loc4);
        // em.getTransaction().commit();
        // System.out.println("Pronto!");

        // consultando dados
        LocalidadeFaixa faixa = em.find(LocalidadeFaixa.class, 1);
        System.out.println(faixa);

        em.close();
        emf.close();

    }
}
