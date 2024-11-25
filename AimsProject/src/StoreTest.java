public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        // Tạo các DVD mẫu
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);

        // Thêm DVD vào cửa hàng
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Hiển thị danh sách DVD
        store.displayStore();

        // Xóa một DVD
        store.removeDVD(dvd2);

        // Hiển thị danh sách DVD sau khi xóa
        store.displayStore();

        // Thử xóa một DVD không tồn tại
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 162, 22.99f);
        store.removeDVD(dvd4);
    }
}