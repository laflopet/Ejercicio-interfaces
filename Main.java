package POO.ConInterfaces.EjercicioInterfaces;

import POO.ConInterfaces.EmpleadoCRUD;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();

    }

}
