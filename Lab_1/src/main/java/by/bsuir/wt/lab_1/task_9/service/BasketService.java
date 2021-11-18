package by.bsuir.wt.lab_1.task_9.service;

import by.bsuir.wt.lab_1.task_9.model.Ball;
import by.bsuir.wt.lab_1.task_9.model.Basket;
import by.bsuir.wt.lab_1.task_9.model.Color;

public class BasketService {
    private static BasketService instance;

    private BasketService() {
    }

    public static BasketService getInstance() {
        if (instance == null) {
            instance = new BasketService();
        }
        return instance;
    }

    public double calcBallsWeight(Basket basket) {
        return basket.getBalls().stream().mapToDouble(Ball::getWeight).sum();
    }

    public int findAmountBlueBalls(Basket basket) {
        return (int) basket.getBalls().stream().filter(ball -> ball.getColor() == Color.BLUE).count();
    }
}
