package com.packpub.steps;

public class DailyGoal {
    int dailyGoal = 10000;

    public DailyGoal(int DailyGoal) {
        this.dailyGoal = dailyGoal;
    }
    public boolean hasMetGoal(Steps steps) {
        if (steps.getSteps() >= dailyGoal) {
            return true;
        }
        return false;
    }
}
