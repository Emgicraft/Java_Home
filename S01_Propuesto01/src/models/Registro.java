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
    private final double limiteMin = 0.0;
    private final double limiteMax = 20.0;
    private final double limiteAprobatorio = 11.0;
    private double n1;
    private double n2;
    private double n3;
    private double notaMenor = -1.0;
    private double notaMayor = -1.0;
    private double promedio = 0.0;
    private String estado = "";
    
    /**
     * Constructor de la clase Registro.
     * 
     * @param n1 Primera nota.
     * @param n2 Segunda nota.
     * @param n3 Tercera nota.
     * 
     * Crea una nueva instancia de Registro con las notas especificadas.
     * Si alguna de las notas está fuera del rango permitido [limiteMin, limiteMax],
     * se establece su valor en {@code 0.0}
     */
    public Registro(double n1, double n2, double n3) {
        if (n1 >= this.limiteMin && n1 <= this.limiteMax) {
            this.n1 = n1;
        } else {
            this.n1 = 0.0;
        }
        if (n2 >= this.limiteMin && n2 <= this.limiteMax) {
            this.n2 = n2;
        } else {
            this.n2 = 0.0;
        }
        if (n3 >= this.limiteMin && n3 <= this.limiteMax) {
            this.n3 = n3;
        } else {
            this.n3 = 0.0;
        }
    }
    
    /**
     * Halla la menor nota de las tres notas.
     *
     * @return La menor nota.
     */
    public final double menorNota() {
        this.notaMenor = this.n1;
        if (this.n2 < this.notaMenor) {
            this.notaMenor = this.n2;
        }
        if (this.n3 < this.notaMenor) {
            this.notaMenor = this.n3;
        }
        return this.notaMenor;
    }
    
    /**
     * Halla la mayor nota de las tres notas.
     *
     * @return La mayor nota.
     */
    public double mayorNota() {
        this.notaMayor = this.n1;
        if (this.n2 > this.notaMayor) {
            this.notaMayor = this.n2;
        }
        if (this.n3 > this.notaMayor) {
            this.notaMayor = this.n3;
        }
        return this.notaMayor;
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
        this.promedio = (n1 + n2 + n3 - getNotaMenor() + getNotaMayor()) / 3.0;
        this.promedio = Math.round(this.promedio*Math.pow(10, numDecimales))/Math.pow(10, numDecimales);
        return this.promedio;
    }
    
    /**
     * Determina el estado en base al promedio.
     *
     * @return El estado, el cuál puede ser "Aprobado" o "Desaprobado".
     */
    public String estado() {
        if (this.promedio >= this.limiteAprobatorio) {
            this.estado = "Aprobado";
        } else {
            this.estado = "Desaprobado";
        }
        return this.estado;
    }

    /**
     * Obtiene el valor de una nota específica.
     *
     * @param numNota El número de la nota deseada (1, 2 o 3).
     * @return El valor de la nota correspondiente.
     *         Si el número de nota es inválido, se imprime un mensaje de error y se devuelve {@code -1.0}
     */
    public double getNota(int numNota) {
        switch (numNota) {
            case 1:
                return this.n1;
            case 2:
                return this.n2;
            case 3:
                return this.n3;
            default:
                System.out.println("Número de nota erronea!");
                return -1.0;
        }
    }

    /**
     * Establece el valor de una nota específica.
     *
     * @param numNota El número de la nota a establecer (1, 2 o 3).
     * @param valorNota El valor que se asignará a la nota.
     *        Si el número de nota es inválido, se imprime un mensaje de error y no se realiza ninguna asignación.
     */
    public void setNota(int numNota, double valorNota) {
        switch (numNota) {
            case 1:
                this.n1 = valorNota;
                break;
            case 2:
                this.n2 = valorNota;
                break;
            case 3:
                this.n3 = valorNota;
                break;
            default:
                System.out.println("Número de nota erronea!");
        }
    }

    /**
     * Obtiene la nota menor de las tres notas.
     *
     * Si la nota menor está fuera del rango permitido: [limiteMin, limiteMax], 
     * se calcula la menor nota.
     *
     * @return La nota menor entre n1, n2 y n3.
     */
    public double getNotaMenor() {
        if (this.notaMenor <= this.limiteMin || this.notaMenor > this.limiteMax) {
            return menorNota();
        } else {
            return this.notaMenor;
        }
    }

    /**
     * Obtiene la nota mayor de las tres notas.
     *
     * Si la nota mayor está fuera del rango permitido [limiteMin, limiteMax], 
     * se calcula la mayor nota.
     *
     * @return La nota mayor entre n1, n2 y n3.
     */
    public double getNotaMayor() {
        if (this.notaMayor <= this.limiteMin || this.notaMayor > this.limiteMax) {
            return mayorNota();
        } else {
            return this.notaMayor;
        }
    }
}
