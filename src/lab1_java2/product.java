/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_java2;

/**
 *
 * @author Duy Hieu
 */
public class product implements dao{
     private String name;
     private double price;

    public product() {
    }

    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
     public Double getImportTax(){
          return  this.price/100 *10;
     }

    @Override
    public void insert() {
             System.out.println("Thêm mới thành công!");
    }

    @Override
    public void update() {
         System.out.println("Cập nhật thành công!");
    }

    @Override
    public void delete() {
        System.out.println("Xoá thành công!");
    }

    @Override
    public void select() {
       System.out.println("Lấy dữ liệu thành công!");
    }
}
