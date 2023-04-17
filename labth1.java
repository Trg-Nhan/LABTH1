import java.util.Scanner;
class SinhVien {
    private int maSV;
    private String hoTen, diaChi, SDT;

    public SinhVien() {
    }
    public SinhVien(int maSV, String hoTen, String diaChi, String SDT) {
        this.maSV = maSV;
        this.hoTen=hoTen;
        this.diaChi = diaChi;
        this.SDT=SDT;
    }
    public int getMaSV() {
        return maSV;
    }
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    } 
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    } 
    public String getSDT() {
        return SDT;
    } 
    public void setSDT(String SDT) {
        this.SDT=SDT;
    }
    @Override
    public String toString(){
        return "SinhVien["+" Ma SV:" + maSV + "Ho ten: "+ hoTen + "Dia Chi: "+diaChi +"So DT: "+SDT+"]";
    }
    public void Xuat() {
        System.out.printf("%5d %20s %15s %15s \n", maSV, hoTen, diaChi, SDT);
    }
}
public class labth1 {
    public static Scanner sc = new Scanner(System.in);
    public static void Nhap(SinhVien sv) {
        System.out.println("Nhap ma sv: ");
        sv.setMaSV(sc.nextInt());;
        sc.nextLine();
        System.out.println("Nhap ho ten sv: ");
        sv.setHoTen(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        sv.setDiaChi(sc.nextLine());
        System.out.println("Nhap SDT: ");
        sv.setSDT(sc.nextLine());
    }
    public static void main(String[] args) {
        SinhVien sv[] = null;
        int a ,n = 0;
        boolean flag = true;
        do {
            System.out.println("-----CHUC NANG------");
            System.out.println("1.Nhap vao sinh vien." + "\n2.Sap xep danh sach sinh vien theo ma.");
            System.out.println(("Vui long chon chuc nang"));
            a=sc.nextInt();
            switch (a) {
                case 1:
                System.out.println("Nhap so luong sinh vien can them: ");
                n = sc.nextInt();
                sv = new SinhVien[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Sinh vien: " + (i + 1)+": ");
                    sv[i] = new SinhVien();
                    Nhap(sv[i]);

                }
                    break;
                case 2:
                    SinhVien tg = sv[0];
                    for (int i = 0; i < sv.length - 1; i++) {
                        for (int j = i + 1; j < sv.length; j++) {
                            if (sv[i].getMaSV() > sv[j].getMaSV()) {
                                tg = sv[j];
                                sv[j] = sv[i];
                                sv[i] = tg;
                            }
                        }
                    }
                    System.out.printf("%-5s %15s %15s %20s  \n", "Ma SV", "Ho ten ", "Dia chi", "SDT");
                    for (int i = 0; i < n; i++) {
                        sv[i].Xuat();
                    }
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}