package com.itfactory.temacap9p3;

import java.util.ArrayList;
import java.util.List;

public class Servicii {
    private List<Person> listaDePersoane;

    public Servicii() {
        listaDePersoane = new ArrayList<>();
    }

    public void afisarePersoanaDupaCNP(long CNP) throws ServiceException {
        boolean existaPersoana = false;
        for (Person person : listaDePersoane) {
            if (person.getCNP() == CNP) {
                System.out.println("Numele persoanei cu CNP: "+ CNP +" este: " + person.getNumeComplet());
                existaPersoana = true;
            }
        }
        if (!existaPersoana) {
            throw new ServiceException("Nu exista nicio persoana cu acest CNP: " + CNP);
        }
    }

    public void introduPersoana(Person person) throws ServiceException {
        if (listaDePersoane.contains(person)) {
            throw new ServiceException("Persoana exista deja in lista");
        }
        listaDePersoane.add(person);
    }
}
