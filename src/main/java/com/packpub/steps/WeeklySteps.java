package com.packpub.steps;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class WeeklySteps {
    List<Steps> dailySteps = new ArrayList<>();
    DailyGoal dailyGoal;

    public DayOfWeek bestDay() {
        DayOfWeek best = DayOfWeek.MONDAY;
        int max = 0;
        for (Steps steps: dailySteps) {
            if (steps.getSteps() > max) {
                max = steps.getSteps();
                best = steps.getDate().getDayOfWeek();
            }
        }
        return best;
    }
}
