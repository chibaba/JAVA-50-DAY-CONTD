package com.packpub.steps;

import java.time.DayOfWeek;
import java.time.LocalDate;
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
    public int getTotalSteps () {
        int total = 0;
        for (Steps steps : dailySteps) {
            total += steps.getSteps();
        }
        return total;
    }
    public String format() {
        StringBuilder builder = new StringBuilder();
        builder.append("Total steps : " + getTotalSteps() + "\n");

        for (Steps steps : dailySteps) {
            if (dailyGoal.hasMetGoal(steps)) {
                builder.append("YaY! ");
            } else {
                builder.append("  ");
            }
            builder.append(steps.getDate().getDayOfWeek());
            builder.append(" ");
            builder.append(steps.getSteps());
            DayOfWeek best =bestDay();
            if (steps.getDate().getDayOfWeek() == best) {
                builder.append(" ***** Best DAY!");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
    public void addDailySteps(int Steps, LocalDate date)
}
