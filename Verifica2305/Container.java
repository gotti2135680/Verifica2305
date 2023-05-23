public class Container {
    private int codice;
    private double stazza;
    private double carico;
    private double temperatura;

    public Container(int codice, double stazza, double carico) {
        this.codice = codice;
        this.stazza = stazza;
        this.carico = carico;
    }

    public Container(int codice, double stazza, double carico, double temperatura) {
        this.codice = codice;
        this.stazza = stazza;
        this.carico = carico;
        this.temperatura = temperatura;
    }

 
    public int getCodice() {
        return codice;
    }

    public double getStazza() {
        return stazza;
    }

    public double getCarico() {
        return carico;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setStazza(double stazza) {
        this.stazza = stazza;
    }

    public void setCarico(double carico) {
        this.carico = carico;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    
    public String toString() {
        String info = "Codice: " + codice + "\nStazza: " + stazza + "\nCarico: " + carico;
    }

    public static void main(String[] args) {
        Container container1 = new Container(1, 100.0, 80.0);
        Container container2 = new Container(2, 120.0, 100.0, -10.0);

        System.out.println("Informazioni del Container 1:");
        System.out.println(container1);

        System.out.println("\nInformazioni del Container 2:");
        System.out.println(container2);
    }
}