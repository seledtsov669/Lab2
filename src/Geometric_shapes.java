public class Geometric_shapes {
    private String type;
    public static void main(String[] args) {
        Geometric_shapes fig1 = new Geometric_shapes("круг");
        fig1.print();
    }
    public Geometric_shapes(String type){
        this.type = type;
    }
    public void print()
    {
        System.out.println(toString());

    }
    public String toString(){
        return "Это " + type + "." +
                "" ;
    }

    public String getType() {
        return type;
    }
}

