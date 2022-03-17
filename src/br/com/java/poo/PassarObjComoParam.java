package br.com.java.poo;

public class PassarObjComoParam {
    
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante(1, 50);
        Estudante estudante2 = new Estudante(1, 50);
        Estudante estudante3 = new Estudante(2, 20);

        System.out.println("Objeto estudante1 == estudante2: " + estudante1.equals(estudante2));
        System.out.println("Obbjet estudante1 == estudante3: " + estudante1.equals(estudante3));
    }
}
class Estudante {
    private int id = 10;
    private int chamadaNo =  30;

    public Estudante(int id, int chamadaNo) {
        this.id = id;
        this.chamadaNo = chamadaNo;
    }
    boolean equals(Estudante o) {
        if(this.id == o.id && this.chamadaNo == o.chamadaNo) {
            return true;
        }
        return false;
    }
}