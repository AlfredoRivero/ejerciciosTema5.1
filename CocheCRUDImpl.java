package EjercicioTema5;

public class CocheCRUDImpl implements CocheCRUD {

    String save = "Guardar";
    String findAll = " Buscar Todo";
    String delete = "borrar";
    @Override
    public void save(CocheCRUDImpl cocheCRUD) {

    }

    @Override
    public void delete(CocheCRUDImpl cocheCRUD) {

    }

    @Override
    public void findAll() {
    }

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
