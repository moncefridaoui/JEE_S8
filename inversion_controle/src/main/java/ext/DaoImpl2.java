package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteur");
        double tmp=6500;
        return tmp;
    }
}
