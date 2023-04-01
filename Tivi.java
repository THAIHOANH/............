import java.util.Scanner;
/**
 *
 * @author thaih
 */
public class Tivi {
    private String mativi;
    private String tentivi;
    private String hangsanxuat;
    private double dongia;
    private int soluong;
    
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
        System.out.println("Nhap Ma Tivi:");
        mativi = scanner.next();
        System.out.println("Nhap Ten Tivi:");
        tentivi = scanner.next();
        System.out.println("Nhap Hang San Xuat:");
        hangsanxuat = scanner.next();
        System.out.println("Nhap Don Gia:");
        dongia = scanner.nextDouble();
        System.out.println("Nhap So Luong:");
        soluong = scanner.nextInt();
    }
    public void hien(){
        System.out.println("ma Tivi la:"+ mativi);
        System.out.println("Ten Tivi la:"+ tentivi);
        System.out.println("Hang san xuat la:"+ hangsanxuat);
        System.out.println("don gia la:"+ dongia);
        System.out.println("so luong la:"+ soluong);
        
    }
    
}
