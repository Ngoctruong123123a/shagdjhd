package game.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import game.model.BinhDoan;
import game.model.CungTen;
import game.model.DuaPhep;
import game.model.Kiem;
import game.model.NhanVat;
import game.model.Phao;
import game.model.VuKhi;

public class MENU {
	public static Scanner sc = new Scanner(System.in);
	public static List<VuKhi> dsvk = new ArrayList<VuKhi>();
	public static List<NhanVat> dsnv = new ArrayList<NhanVat>();
	public static List<BinhDoan> dsbd = new ArrayList<BinhDoan>();
	
	
	
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("|==========MENU=============|");
            System.out.println("|[0]   THOÁT                |");
            System.out.println("|[1]   nhập dữ liệu         |");
            System.out.println("|[2]   xuất dữ liệu         |");
            System.out.println("|[3]   sắp xếp dữ liệu      |");
            System.out.println("|[4]   tìm kiếm dữ liệu     |");
            System.out.println("|[5]   sử dụng DeepCloning  |");
            System.out.println("|[6]   xóa                  |");
            System.out.println("|===========================|");
            System.out.println("nhập dữ liệu :");

            choice = sc.nextInt();

            switch (choice) {
                case 0: {
                    System.out.println("Thoát chương trình!!");
                    break;
                }
                case 1: {
                    System.out.println("1. Nhập dữ liệu vũ khí");
                    System.out.println("2. Nhập dữ liệu nhân vật");
                    System.out.println("3. Nhập dữ liệu binh đoàn");
                    System.out.println("0. Thoát chương trình");
                    System.out.println("chọn : ");

                    int choice1 = sc.nextInt();
                    switch (choice1) {
                        case 1: {
                            nhapDuLieuVuKhi();
                            break;
                        }
                        case 2: {
                            nhapDuLieuNhanVat();
                            break;
                        }
                        case 3: {
                            nhapDuLieuBinhDoan();
                            break;
                        }
                        case 0: {
                            System.out.println("Thoát chương trình nhập dữ liệu");
                            break;
                        }
                        default:
                            System.out.println("Giá trị không hợp lệ: " + choice1);
                    }
                    break;
                }
                case 2: {
                    System.out.println("1. Xuất dữ liệu vũ khí");
                    System.out.println("2. Xuất dữ liệu nhân vật");
                    System.out.println("3. Xuất dữ liệu binh đoàn");
                    System.out.println("0. Thoát chương trình");
                    System.out.println("chọn :");

                    int choice1 = sc.nextInt();
                    switch (choice1) {
                        case 1: {
                            xuatDuLieuVuKhi();
                            break;
                        }
                        case 2: {
                            xuatDuLieuNhanVat();
                            break;
                        }
                        case 3: {
                            xuatDuLieuBinhDoan();
                            break;
                        }
                        case 0: {
                            System.out.println("Thoát chương trình xuất dữ liệu");
                            break;
                        }
                        default:
                            System.out.println("Giá trị không hợp lệ: " + choice1);
                    }
                    break;
                }
                case 3: {                  
                    System.out.println("1. Sắp xếp theo máu");                
                    System.out.println("0. Thoát chương trình");
                    System.out.println("chọn : ");

                    int choice1 = sc.nextInt();
                    switch (choice1) {
                        case 1: {
                        	sapXepBlood(true);
                            break;
                        }                     
                        case 0: {
                            System.out.println("Thoát chương trình sắp xếp dữ liệu");
                            break;
                        }
                        default:
                            System.out.println("Giá trị không hợp lệ: " + choice1);
                    }
                    break;
                }
                case 4: {
                    timKiemTheoTen();
                    break;
                }
                /////////////////////////////////////////////////////////////////
                case 5: {
                    suDungDeepCloning();
                    break;
                }
                /////////////////////////////////////////////////////////////////
                case 6: {
                	System.out.println("1 xóa nhân vật");
                	System.out.println("0 thoát chương trình");
                	System.out.println("chọn : ");
                	int choice2 = sc.nextInt();
                	switch (choice2) {
					case 1: {
						xoaNhanVat();
					}
					case 0: {
						System.out.println("thoát chương trình");
					}
					default:
						System.out.println("lựa chọn ko hợp lệ");
					}
                }
                default: {
                    System.out.println("Bạn nhập sai dữ liệu!!! Hãy thử các số từ 0-5");
                    break;
                }
            }
        } while (choice != 0);

        sc.close();
    }
    // NHẬP DỮ LIỆU VŨ KHÍ=======================================================
    private static void nhapDuLieuVuKhi() {
    	System.out.println("Chọn vũ khí(1)cung (2)kiem (3)phao (4)DuaPhep");
        int chonvk = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên vũ khí: ");
        String namevk = sc.next();
        System.out.println("Nhập số lượng: ");
        int vk = sc.nextInt();
        sc.nextLine();
        String loaiVk = "";
        switch (chonvk) {
        case 1: {
            loaiVk = "Cung";
            System.out.println("Công vật lý: ");
            int congVatLy = sc.nextInt();
            System.out.println("Tầm đánh: ");
            int tamban = sc.nextInt();
            VuKhi cungTen = new CungTen(namevk, vk, congVatLy, tamban);
            dsvk.add(cungTen);
            break;
        }
        case 2: {
            loaiVk = "Kiem";
            System.out.println("Công vật lý: ");
            int congVatLy = sc.nextInt();
            System.out.println("Tầm đánh: ");
            int tamban = sc.nextInt();
            VuKhi kiem = new Kiem(namevk, vk, congVatLy, tamban);
            dsvk.add(kiem);
            break;
        }
        case 3: {
            loaiVk = "Phao";
            System.out.println("Công vật lý: ");
            int congVatLy = sc.nextInt();
            System.out.println("Tầm đánh: ");
            int tamban = sc.nextInt();
            VuKhi phao = new Phao(namevk, vk, congVatLy, tamban);
            dsvk.add(phao);
            break;
        }
        case 4: {
            loaiVk = "DuaPhep";
            System.out.println("Công phép thuật: ");
            int congphepthuat = sc.nextInt();
            System.out.println("Tầm đánh: ");
            int tamban = sc.nextInt();
            VuKhi duaPhep = new DuaPhep(namevk, vk, congphepthuat, tamban);
            dsvk.add(duaPhep);
            break;
        }
        default:
            System.out.println("Bạn nhập sai dữ liệu!!!");
            return;
    }
    System.out.println("Thêm vũ khí thành công!");

       
    }
    // NHẬP DỮ LIỆU NHÂN VẬT ===============================================
    private static void nhapDuLieuNhanVat() {
        int nhanvat;
        System.out.println("Chọn nhân vật (1) Cung Thu (2) Kiem Khach (3) Phao Binh (4) Phu Thuy");
        nhanvat = sc.nextInt();
        sc.nextLine();
        System.out.println("Tên Nhân Vật: ");
        String namenv = sc.next();
        System.out.println("Nhập sức mạnh: ");
        int sucManh = sc.nextInt();
        System.out.println("Nhập máu: ");
        int mau = sc.nextInt();
        System.out.println("Nhập mana: ");
        int mana = sc.nextInt();

        NhanVat nhanVat = new NhanVat(namenv, mau, sucManh, mana);
        dsnv.add(nhanVat);
        System.out.println("Thêm nhân vật thành công!");
    }
        
    // NHẬP DỮ LIỆU BINH ĐOÀN ===================================================
    private static void nhapDuLieuBinhDoan() {
        System.out.println("Nhập tên binh đoàn: ");
        String ten = sc.next();
        System.out.println("Nhập số lượng: ");
        int soLuong = sc.nextInt();

        BinhDoan binhdoan = new BinhDoan(ten, soLuong);
        dsbd.add(binhdoan);
    }

    // XUẤT DỮ LIỆU VŨ KHÍ========================================================
    private static void xuatDuLieuVuKhi() {
        for (VuKhi vk : dsvk) {
			System.out.println("Vu Khi cua bạn : "+ vk);
		}
    }
    // XUẤT DỮ LIỆU NHÂN VẬT =====================================================
    private static void xuatDuLieuNhanVat() {
        for (NhanVat nv : dsnv) {
			System.out.println("các nhân vật của bạn :" + nv);
		}
    }
    // XUẤT DỮ LIỆU BINH ĐOÀN =====================================================
    private static void xuatDuLieuBinhDoan() {
        for (BinhDoan binhDoan : dsbd) {
			System.out.println("binh đoàn :"+ binhDoan);
		}
    }

    private static void sapXepBlood(boolean ascending) {
        if (ascending) {
            Collections.sort(dsnv, new Comparator<NhanVat>() {
                @Override
                public int compare(NhanVat o1, NhanVat o2) {
                    return Double.compare(o1.getBlood(), o2.getBlood());
                }
            });
            System.out.println("Đã sắp xếp danh sách nhân vật theo máu từ thấp tới cao.");
        }
    }

    private static void timKiemTheoTen() {
        System.out.println("Nhập tên nhân vật cần tìm: ");
        String tenCanTim = sc.next();
        boolean timThay = false;

        for (NhanVat nv : dsnv) {
            if (nv.getTen().equalsIgnoreCase(tenCanTim)) {
                System.out.println("Nhân vật tìm thấy: " + nv);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy nhân vật với tên: " + tenCanTim);
        }
    }


    private static void suDungDeepCloning() {
        System.out.println("Nhập tên nhân vật cần sao chép: ");
        String tenCanSaoChep = sc.next();
        NhanVat nhanVatGoc = null;

        // Tìm nhân vật cần sao chép
        for (NhanVat nv : dsnv) {
            if (nv.getTen().equalsIgnoreCase(tenCanSaoChep)) {
                nhanVatGoc = nv;
                break;
            }
        }

        if (nhanVatGoc != null) {
            // Tạo một bản sao của nhân vật với thuộc tính sao chép
            NhanVat clonedNhanVat = new NhanVat(
                nhanVatGoc.getTen(),
                nhanVatGoc.getMana(),
                nhanVatGoc.getBlood(),
                nhanVatGoc.getSatThuong()
            );

            // Sao chép danh sách vũ khí nếu không cần sao chép
            clonedNhanVat.setDsvk(new ArrayList<>(nhanVatGoc.getDsvk()));

            dsnv.add(clonedNhanVat);
            System.out.println("Sao chép thành công: " + clonedNhanVat);
        } else {
            System.out.println("Không tìm thấy nhân vật với tên: " + tenCanSaoChep);
        }
    }

    private static void xoaNhanVat() {
        System.out.println("Nhập tên nhân vật cần xóa: ");
        String tenCanXoa = sc.next();
        boolean timThay = false;

        // Tìm và xóa nhân vật
        for (NhanVat nv : dsnv) {
            if (nv.getTen().equalsIgnoreCase(tenCanXoa)) {
                dsnv.remove(nv);
                System.out.println("Nhân vật với tên " + tenCanXoa + " đã được xóa thành công.");
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy nhân vật với tên: " + tenCanXoa);
        }
    }

}
