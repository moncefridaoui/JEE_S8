package dao;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("version Base Donnees");
        double temp = Math.random()*40;
        return temp;
    }
}
