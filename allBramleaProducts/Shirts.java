package allBramleaProducts;

public abstract class Shirts {

    private String name;
    private String designer;
    private String size;
    private int price;

    protected Shirts(String name, String designer, String size, int price){
        this.setName(name);
        this.setDesigner(designer);
        this.setSize(size);
        this.setPrice(price);
    }

    protected void size() {
        System.out.println("It is a small size");
    }

    public String toString(){
        return name + " \n " + designer + " \n " + size + " \n " + price;
    }

    public String getName(){
        return name;
    }

    public String getDesigner(){
        return designer;
    }

    public String getSize(){
        return size;
    }

    public int getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDesigner(String designer){
        this.designer = designer;
    }

    public void setSize(String size){
        this.size = size;
    }

    public void setPrice(int price){
        this.price = price;
    }
}
