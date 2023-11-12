/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1_java2;

/**
 *
 * @author Duy Hieu
 */
public class Lab1_java2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        product product1 = new product("Sản phẩm 1", 100);
        product product2 = new product("Sản phẩm 2", 200);
        product product3 = new NoTaxProduct("san pham khong thue", 150);
        product product4 = new product("Sản phẩm 4", 300);
        product product5 = new product("Sản phẩm 5", 250);

        
        System.out.println("thong tin sn 1:");
        System.out.println("Tên: " + product1.getName());
        System.out.println("Giá: " + product1.getPrice());
        System.out.println("Thuế nhập khẩu: " + product1.getImportTax());
        
        System.out.println("Sản phẩm 3,sản phẩm này không thuế");
        System.out.println("Tên: "+ product3.getName());
        System.out.println("giá: "+ product3.getPrice());
        

        product1.insert();
        product2.update();
        product3.delete();
        product4.select();
        product5.update();
    }
    
}
