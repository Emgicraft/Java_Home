package models;

/**
 * Clase Registro representa un registro de notas.
 * 
 * Permite calcular el promedio de las notas, determinar el estado del registro
 * y realizar operaciones con las notas individuales.
 * 
 * @author Moisés
 * @version 1.3
 */
public class Registro {
    private double n1;
    private double n2;
    private double n3;
    
    public Registro() {}
    
    /**
     * Constructor de la clase Registro.
     * 
     * @param nota1 Primera nota.
     * @param nota2 Segunda nota.
     * @param nota3 Tercera nota.
     * 
     * Crea una nueva instancia de Registro con las notas especificadas.
     * Si alguna de las notas está fuera del rango permitido [limiteMin, limiteMax],
     * se establece su valor en {@code 0.0}
     */
    public Registro(double nota1, double nota2, double nota3) {
        if (nota1 >= 0.0 && nota1 <= 20.0) {
            this.n1 = nota1;
        } else {
            this.n1 = 0.0;
        }
        if (nota2 >= 0.0 && nota2 <= 20.0) {
            this.n2 = nota2;
        } else {
            this.n2 = 0.0;
        }
        if (nota3 >= 0.0 && nota3 <= 20.0) {
            this.n3 = nota3;
        } else {
            this.n3 = 0.0;
        }
    }
    
    /**
     * Calcula el promedio de las notas, reemplazando la menor nota por la mayor,
     * y redondea el resultado al número especificado de decimales.
     *
     * @param numDecimales Número de decimales a los que se debe redondear el promedio.
     * @return El promedio de las notas, con la menor nota reemplazada por la mayor,
     *         redondeado al número de decimales especificado.
     */
    public double promedio(int numDecimales) {
        double promedio = (this.n1 + this.n2 + this.n3 - getNotaMenor() + getNotaMayor()) / 3.0;
        promedio = Math.round(promedio*Math.pow(10, numDecimales))/Math.pow(10, numDecimales);
        return promedio;
    }
    
    /**
     * Determina el estado en base al promedio.
     *
     * @return El estado, el cuál puede ser "Aprobado" o "Desaprobado".
     */
    public String estado() {
        String est;
        double prom = promedio(4);
        if (prom >= 11.0) {
            est = "Aprobado";
        } else {
            est = "Desaprobado";
        }
        return est;
    }

    /**
     * @return Devuelve el valor de la nota 1.
     */
    public double getNota1() {
        return this.n1;
    }

    /**
     * Define un valor para la nota 1.
     * 
     * @param valor Valor a definir.
     */
    public void setNota1(double valor) {
        this.n1 = valor;
    }

    /**
     * @return Devuelve el valor de la nota 2.
     */
    public double getNota2() {
        return this.n2;
    }

    /**
     * Define un valor para la nota 2.
     * 
     * @param valor Valor a definir.
     */
    public void setNota2(double valor) {
        this.n2 = valor;
    }

    /**
     * @return Devuelve el valor de la nota 3.
     */
    public double getNota3() {
        return this.n3;
    }

    /**
     * Define un valor para la nota 3.
     * 
     * @param valor Valor a definir.
     */
    public void setNota3(double valor) {
        this.n3 = valor;
    }

    /**
     * Halla la menor nota.
     *
     * @return La menor nota.
     */
    public double getNotaMenor() {
        double menor = this.n1;
        if (this.n2 < menor) {
            menor = this.n2;
        }
        if (this.n3 < menor) {
            menor = this.n3;
        }
        return menor;
    }

    /**
     * Halla la mayor nota.
     *
     * @return La mayor nota.
     */
    public double getNotaMayor() {
        double mayor = this.n1;
        if (this.n2 > mayor) {
            mayor = this.n2;
        }
        if (this.n3 > mayor) {
            mayor = this.n3;
        }
        return mayor;
    }
}
