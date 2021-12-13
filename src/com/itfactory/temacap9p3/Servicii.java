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
                System.out.println("Persoana: " + person.getNumeComplet());
                existaPersoana = true;
                break;
            }
        }
        if (!existaPersoana) {
            throw new ServiceException("Nu s-a gasit persoana cu CNP-ul :" + CNP);
        }
    }

    public void introduPersoana(Person person) throws ServiceException {
        if (listaDePersoane.contains(person)) {
            throw new ServiceException("Persoana exista deja in lista");
        }
        if (existaPersoana(person.getCNP())) {
            throw new ServiceException("Exista deja o persoana cu acest CNP");
        }
        listaDePersoane.add(person);
    }

    private boolean existaPersoana(long CNP) {
        for (Person person : listaDePersoane) {
            if (person.getCNP() == CNP) {
                return true;
            }
        }
        return false;
    }
}
