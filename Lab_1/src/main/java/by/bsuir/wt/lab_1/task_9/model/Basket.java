package by.bsuir.wt.lab_1.task_9.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Basket {
    private final List<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return Collections.unmodifiableList(balls);
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(balls, basket.balls);
    }

}