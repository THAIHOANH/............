import java.io.Serializable;
import java.util.Scanner;
/**
 *
 * @author thaih
 */
public class Tivi implements Serializable{
    private String mativi;
    private String tentivi;
    private String hangsanxuat;
    private double dongia;
    private int soluong;
    public Tivi(){
}
    public Tivi (String mativi, String tentivi, String hangsanxuat,double dongia, int soluong ){
        this.mativi = mativi;
        this.tentivi = tentivi;
        this.hangsanxuat = hangsanxuat;
        this.dongia = dongia;
        this.soluong = soluong;
    }
    public String getMativi(){
        return mativi;
    }
    public void setMativi(String mativi){
        this.mativi = mativi;
    }
    public String getTentivi(){
        return tentivi;
    }
    public void setTentivi(String tentivi){
        this.tentivi = tentivi;
    }
    public String getHangSanxuat(){
        return hangsanxuat;
    }
    public void setHangsanxuat(String hangsanxuat){
        this.hangsanxuat = hangsanxuat;
    }
    public double getdongia(){
        return dongia;
    }
    public void setdongia(double dongia){
        this.dongia =dongia;
    }
    public int getsoluong(){
        return soluong;
    }
    public void setsoluong(int soluong){
        this.soluong = soluong;
    }

   
    public void nhap (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma Tivi:");
        mativi = scanner.nextLine();
        System.out.println("Nhap ten Tivi:");
        tentivi = scanner.nextLine();
        System.out.println("Nhap hang san xuat:");
        hangsanxuat = scanner.nextLine();
        System.out.println("Nhap don gia:");
        dongia = scanner.nextDouble();
        System.out.println("Nhap so luong:");
        soluong = scanner.nextInt();
    }
    public void hien(){
        System.out.println("mã Tivi:"+ mativi);
        System.out.println("Tên Tivi:"+ tentivi);
        System.out.println("Hãng sản xuất:"+ hangsanxuat);
        System.out.println("Đơn giá:"+ dongia);
        System.out.println("số lượng:"+ soluong);
        
    }
    
}
