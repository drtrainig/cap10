package com.itfactory.temacap9p3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ion Popesscu", 1231231231231L);
        Person person1 = new Person("Maria Popescu", 2231231231231L);

        Servicii servicii = new Servicii();
        try {
            servicii.introduPersoana(person);
            servicii.introduPersoana(person1);
        } catch (ServiceException exception) {
            exception.printStackTrace();
        }

        try {
            servicii.afisarePersoanaDupaCNP(2231231231231L);
        } catch (ServiceException exception) {
            exception.printStackTrace();
        }

    }
}
