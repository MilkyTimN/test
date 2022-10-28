public class Magazine implements Printable{

    private String magazineName;

    public Magazine(String magazineName) {
        this.magazineName = magazineName;
    }

    public Magazine() {
    }

    public String getMagazineName() {
        return magazineName;
    }

    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }

    @Override
    public String toString() {
        return "Magazine: " + magazineName;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
    public static void printMagazines(Printable[] printable) {
        for (Printable e : printable) {
            if (e instanceof Magazine) {
                System.out.println(e);
            }
        }
        System.out.println("-----------");
    }
}
