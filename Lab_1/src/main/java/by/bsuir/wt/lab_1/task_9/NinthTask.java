package by.bsuir.wt.lab_1.task_9;

import by.bsuir.wt.lab_1.task_9.model.Ball;
import by.bsuir.wt.lab_1.task_9.model.Basket;
import by.bsuir.wt.lab_1.task_9.model.Color;
import by.bsuir.wt.lab_1.task_9.service.BasketService;
import java.util.ArrayList;
import java.util.List;

public class NinthTask {
    public static void main(String[] args) {

        List<Ball> balls = new ArrayList<>();
        balls.add(new Ball(12.0, Color.BLACK));
        balls.add(new Ball(9.5, Color.BLUE));
        balls.add(new Ball(1.0, Color.GREEN));
        balls.add(new Ball(45.0, Color.PURPLE));
        balls.add(new Ball(13.2, Color.BLUE));

        Basket basket = new Basket(balls);
        BasketService basketService = BasketService.getInstance();
        System.out.println("Weight = " + basketService.calcBallsWeight(basket));
        System.out.println("Amount blue balls = " + basketService.findAmountBlueBalls(basket));
    }
}
