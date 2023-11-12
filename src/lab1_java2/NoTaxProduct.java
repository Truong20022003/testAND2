/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_java2;

/**
 *
 * @author Duy Hieu
 */
public class NoTaxProduct extends product {

    public NoTaxProduct() {
    }

    public NoTaxProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public Double getImportTax() {
        return 0.0;
    }

}
