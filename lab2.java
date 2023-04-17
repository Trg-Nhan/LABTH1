import java.util.Scanner;

class ThongTinDangKyXe {
    private int dungTich;
    private double triGia;
    private String chuXe,loaiXe;
 
    public ThongTinDangKyXe(int dungTich, double triGia,
     String chuXe, String loaiXe) {
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.chuXe = chuXe;
        this.loaiXe=loaiXe;
    }
    public ThongTinDangKyXe(){

    }
    public int getDungTich() {
        return dungTich;
    }
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
    public double getTriGia() {
        return triGia;
    }
    public void setTriGia(double triGia) {
        this.triGia = triGia;
    } 
    public String getChuXe() {
        return chuXe;
    } 
    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }
    public String getLoaiXe() {
        return loaiXe;
    } 
    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }
    public double tinhThue(){
        double thue;
        if(dungTich<100) thue=triGia*0.01;
        else if (dungTich >= 100 && dungTich<=200) thue = triGia * 0.03;
        else thue = triGia * 0.05;
        return thue;
    }
    @Override
    public String toString() {
        return "ThongTinDangKyXe["+" Chu xe: "+ chuXe + " Loai xe: " + loaiXe 
        + "Trị gia xe: " + triGia+" Dung tich xylanh: "+ dungTich + " Thue: " +tinhThue() +"]";
    }
    void XuatThue(){
        System.out.printf("%-10s %-20s %-5d %10.2f %8.5f\n"
                                ,loaiXe,chuXe,dungTich,triGia,tinhThue());
    }
}
public class lab2 {
    static Scanner sc=new Scanner(System.in);
      public static void Nhap(ThongTinDangKyXe xe){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap loai Xe: ");
            xe.setLoaiXe(sc.nextLine());       
            System.out.print("Nhap ten chu xe: ");
            xe.setChuXe(sc.nextLine());
            System.out.print("Nhap dung tich xy lanh: ");
            xe.setDungTich(sc.nextInt());
            System.out.print("Nhap tri gia cua xe: ");
            xe.setTriGia(sc.nextDouble());
            sc.nextLine();
        }
    public static void main(String[] args) {
        ThongTinDangKyXe v[]= null;
        int a,n=0;
        boolean flag = true;
        do{
            System.out.println("______MENU______");
            System.out.println("1.Nhap xe"
            +"\n2.Tinh tien thue");
            System.out.println("Xin moi lua chon:");
            a =sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("Nhap so luong xe can them vao: ");
                    n=sc.nextInt();
                    v= new ThongTinDangKyXe[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nNhap Xe so: " + (i+1));
                        v[i] = new ThongTinDangKyXe();
                        Nhap(v[i]);
                    }
                    break;
                case 2:

                    System.out.printf("%5s %5s %5s %10s %8s",
                    "Loai xe: ","Chu xe: ","Dung tich: ","Tri gia: ","Thue: ");
                    System.out.println("\n______________________________________________________________________");
                    for (int i = 0; i < n; i++) {
                        v[i].XuatThue();
                    }
                    break;
                default:
                    flag=false;
                    break;
            }
        }while (flag);
    }
}