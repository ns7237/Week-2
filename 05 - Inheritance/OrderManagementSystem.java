public class OrderManagementSystem {
    static class Order {
        protected String orderId;
        protected String orderDate;
        public Order(String orderId, String orderDate) {
            this.orderId = orderId;
            this.orderDate = orderDate;
        }
        public String getOrderStatus() {
            return "Order Placed";
        }
    }

    static class ShippedOrder extends Order {
        protected String trackingNumber;
        public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
            super(orderId, orderDate);
            this.trackingNumber = trackingNumber;
        }
        @Override
        public String getOrderStatus() {
            return "Order Shipped - Tracking: " + trackingNumber;
        }
    }

    static class DeliveredOrder extends ShippedOrder {
        private String deliveryDate;
        public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
            super(orderId, orderDate, trackingNumber);
            this.deliveryDate = deliveryDate;
        }
        @Override
        public String getOrderStatus() {
            return "Order Delivered on " + deliveryDate;
        }
    }

    public static void main(String[] args) {
        Order o = new Order("ORD101", "2025-04-01");
        ShippedOrder s = new ShippedOrder("ORD102", "2025-04-02", "TRK12345");
        DeliveredOrder d = new DeliveredOrder("ORD103", "2025-04-03", "TRK67890", "2025-04-05");
        System.out.println(o.getOrderStatus());
        System.out.println(s.getOrderStatus());
        System.out.println(d.getOrderStatus());
    }
}
