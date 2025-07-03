package P04_HotelReservation;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(data[0]);
        int days = Integer.parseInt(data[1]);
        String seasonStr = data[2];
        String discount = data[3];

        Season season = Season.valueOf(seasonStr.toUpperCase(Locale.ROOT));
        DiscountType discountType = DiscountType.NONE;

        if (discount.equals("VIP")){
            discountType = DiscountType.VIP;

        } else if (discount.equals("SecondVisit")) {
            discountType = DiscountType.SECOND_VISIT;
        }
        double finalPrice = pricePerDay * days * season.getMultiplier() * discountType.getPercent();

        System.out.printf("%.2f", finalPrice);
    }
}
