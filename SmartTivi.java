
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thaih
 */
public class SmartTivi extends Tivi {
   String hedieuhanh;
   String ungdung;
   
   public SmartTivi(){
       
   }
    public SmartTivi(String mativi, String tentivi, String hangsanxuat, double dongia, int soluong) {
        super(mativi, tentivi, hangsanxuat, dongia, soluong);
        this.hedieuhanh = hedieuhanh;
        this.ungdung = ungdung;
    }
    public String getHedieuhanh(){
        return hedieuhanh;
    }
    public void setHedieuhanh(String hedieuhanh){
        this.hedieuhanh = hedieuhanh;
    }
    public String getUngdung(){
        return ungdung;
    }    
    public void setUngdung(String ungdung){
        this.ungdung = ungdung;
    }
    @Override
    public void nhap()
    {
        super.nhap();
       Scanner scanner = new Scanner (System.in);
       System.out.println("Nhập hệ điều hành:");
       hedieuhanh = scanner.nextLine();
       System.out.println("Nhập ứng dụng:");
       ungdung = scanner.nextLine();
    }
    @Override 
    public void hien()
    {
        super.hien();
        System.out.println("hệ điều hành:" + hedieuhanh);
        System.out.println("ứng dụng: "+ ungdung);
    }
}
  

