package POO.ConInterfaces.EjercicioInterfaces;

public class CocheCRUDImpl implements CocheCRUD{


    @Override
    public void save() {
        System.out.println("Este es el metodo que guarda");
    }

    @Override
    public void findAll() {
        System.out.println("Este es el metodo que encuentra");
    }

    @Override
    public void delete() {
        System.out.println("Este es el metodo que borra");
    }
}
