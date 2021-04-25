package com.hfad.mobile_lab05;

public class Product {

    public static final Product[] cables = {
            new Product("Dây Máy In USB 2.0 UGREEN USB10362 Có Chip khuếch đại cao cấp dài 10M UGREEN USB10374Us122 Hàng chính hãng", 5, 4, 275, 0.05, R.drawable.cable_1, "cable"),
            new Product("Dây Cáp USB 2 Đầu Dương 1.5m ( Đen )", 5, 7, 18.6, 0.88, R.drawable.cable_2, "cable"),
            new Product("Cáp sạc micro cao cấp dây tròn usb 2.0 dài 2M màu đen UGREEN USB60138Us289 Hàng chính hãng", 4.5f, 6, 58, 0.36, R.drawable.cable_3, "cable"),
            new Product("Cáp Chuyển Đổi USB 3.0 To Lan - USB Sang Lan", 4.5f, 6, 165, 0.43, R.drawable.cable_4, "cable"),
            new Product("Cáp tín hiệu USB 2.0 nối dài dây tròn mạ vàng cao cấp dài 3M màu đen UGREEN USB10317Us103 Hàng chính hãng", 5, 1, 77, 0.13, R.drawable.cable_5, "cable"),
            new Product("Dây Cáp Nối Dài USB 2.0 (Từ 1m đến 10m)", 4.5f, 3, 33, 0.59, R.drawable.cable_6, "cable")
    };

    public static final Product[] books = {
            new Product("Dế Mèn Phiêu Lưu Ký (Tái Bản 2019)", 4.5f, 736, 39.9, 0.2, R.drawable.de_men_phieu_luu_ky, "book"),
            new Product("Hiểu lòng con trẻ", 4.5f, 150, 120, 0.25, R.drawable.hieu_long_con_tre_tuoi, "book"),
            new Product("Hoàng Tử Bé (Bìa Cứng)(Tái Bản)", 4.5f, 127, 90, 0.25, R.drawable.hoang_tu_be, "book"),
            new Product("Lượng giác", 4.5f, 576, 105.3, 0.32, R.drawable.luong_giac, "book"),
            new Product("Số Đỏ (Tái Bản 2020)", 4.5f, 156, 47.3, 0.27, R.drawable.so_do_sach_vh, "book"),
            new Product("Làm Thế Nào Để Sống Khổ Sở?", 5f, 3, 63.8, 0.27, R.drawable.song_kho_so, "book"),
            new Product("Khởi Nghiệp Du Kích - Kinh Doanh Ít Vốn - Vận Dụng Nguồn Lực Nhỏ Chiến Thắng Cuộc Chơi Lớn (Tái Bản)", 4.5f, 487, 119, 0.2, R.drawable.start_up, "book"),
            new Product("The Powers - Sức Mạnh Biến Cuộc Sống Tầm Thường Thành Phi Thường", 5f, 2, 57.8, 0.2, R.drawable.suc_manh_phi_thuong, "book"),
            new Product("Tôi Thấy Hoa Vàng Trên Cỏ Xanh", 5f, 331, 93.6, 0.25, R.drawable.toi_thay_hoa_vang_tren_co_xanh, "book"),
            new Product("Tiền Đẻ Ra Tiền: Đầu Tư Tài Chính Thông Minh", 4.5f, 5, 86.4, 0.28, R.drawable.vua_kiem_tien_vua_du_lich, "book"),
            new Product("You Can, You Will. It's Your Choice! Bạn Có Thể, Bạn Sẽ Thành Công - Đó Là Lựa Chọn Của Bạn!", 5f, 1, 58, 0.03, R.drawable.you_can_you_will, "book"),
    };

    private String name;
    private float rating;
    private int review;
    private double price;
    private double discount;
    private int imageResourceId;
    private String type;

    public Product(String name, float rating, int review, double price, double discount, int imageResourceId, String type) {
        this.name = name;
        this.rating = rating;
        this.review = review;
        this.price = price;
        this.discount = discount;
        this.imageResourceId = imageResourceId;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public float getRating() {
        return rating;
    }

    public int getReview() {
        return review;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getType() {
        return type;
    }
}
