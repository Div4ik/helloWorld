public class Main {
        public static void main(String[] args) {
            int distance = 59;
            System.out.println(DeliveryDaysCalculation(distance));



        }

        public static String DeliveryDaysCalculation (int distance){
            int deliveryDays = 0;
            String result = "";

            if(distance < 60){
                deliveryDays = distance / 20 + 1;
            }

            if (deliveryDays == 0) {
                result = "Доставка не возможна";
            } else {
                result = "На расстоянии " + distance + " км доставка составит " + deliveryDays + " " + days(deliveryDays);
            }

            return result;


        }

        public static String days (int days) {
            switch(days){
                case 1:
                    return "день";
                case 2:
                case 3:
                    return "дня";
                default:
                    return "ошибка";


            }
        }
}
