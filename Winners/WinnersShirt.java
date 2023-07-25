package Winners;

import allBramleaProducts.Shirts;

import java.util.ArrayList;

public class WinnersShirt extends Shirts {

    public static ArrayList<WinnersShirt> winnersShirts = new ArrayList<>();

    private String branch;

    public WinnersShirt(String name, String designer, String size, int price, String branch) {
        super(name, designer, size, price);
        this.setBranch(branch);
    }

    public String getBranch(){
        return branch;
    }

    public void setBranch(String branch){
        this.branch = branch;
    }

    public static void addToWinnerShirt(WinnersShirt WinnersShirt){
        winnersShirts.add(WinnersShirt);
    }

    public WinnersShirt get(int index){
        return winnersShirts.get(index);
    }

    @Override
    public String toString(){
        return getName() + " \n " + getDesigner() + " \n " + getSize() + " \n " + getPrice() + " \n " + getBranch();
    }
}
