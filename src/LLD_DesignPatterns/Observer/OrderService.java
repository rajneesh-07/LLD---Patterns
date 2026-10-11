package LLD_DesignPatterns.Observer;


import java.util.ArrayList;
import java.util.List;

//publisher
public class OrderService {

    private List<OrderPlacedSubscriber> orderPlacedSubscribers = null;
    private static OrderService instance = null;

    public OrderService() {
//        if (orderPlacedSubscribers == null) {
//            synchronized (OrderService.class) {
//                if (orderPlacedSubscribers == null) {
                    this.orderPlacedSubscribers = new ArrayList<>();
//                    this.orderService = new OrderService();
//                }
//            }
//        }
//        else {
//            this.orderPlacedSubscribers = orderPlacedSubscribers;
////            this.orderService = orderService;
//        }
    }
        public static OrderService getObject(){
        if(instance == null){
            synchronized(OrderService.class){
                if(instance == null){
                    instance = new OrderService();
                }
            }
        }
        return instance;
        }

    public void placeOrder() {
        //order being palced --> business logic
        for (OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers) {
            orderPlacedSubscriber.orderPlaceAction();
        }
    }

    public void add(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void remove(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }


}
