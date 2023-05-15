package com.mycompany.tan.bai1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, LocalDate.now());

        Product product1 = new Product("Gạo thơm ", "G01", 15.0);
        Product product2 = new Product("Gạo nếp", "G02", 18.0);
        Product product3 = new Product("Gạo tám", "G03", 22.0);
        Product product4 = new Product("Gạo ST25", "G04", 25.0);


        order.addlineItem(product1, 3);
        order.addlineItem(product3, 5);
        order.addlineItem(product2, 5);
        order.addlineItem(product4, 5);


        System.out.println("Mã hóa đơn: " + order.getOrderID());
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = order.getorderDate().format(dateFormatter);
        System.out.println("Ngày lập hóa đơn: " + formattedDate);
        System.out.println("STT       |  Mã Sp   |         Mô tả         |     Đơn giá     |     Số lượng    |    Thành tiền");

        DecimalFormat decimalFormat = new DecimalFormat("#,### VND");
        List<OrderDetail> lineItems = order.getLineItems();
        int stt = 1;
        for (OrderDetail orderDetail : lineItems) {
            System.out.printf("%-10s|  %-8s|   %-20s|  %-15s|  %-15s|  %-15s\n",
                    stt,
                    orderDetail.getProduct().getProductID(),
                    orderDetail.getProduct().getDescription(),
                    decimalFormat.format(orderDetail.getProduct().getprice()),
                    orderDetail.getQuantity(),
                    decimalFormat.format(orderDetail.calcTotalPrice()));
            stt++;
        }

        System.out.println("Tổng tiền thanh toán: " + decimalFormat.format(order.calcTotalCharge(0)));
    }
}

