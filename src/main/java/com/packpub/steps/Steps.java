package com.packpub.steps;

import java.time.LocalDate;

public class Steps {
    private int steps;
    private LocalDate date;

    public Steps(int steps, LocalDate date) {
        this.steps = steps;
        this.date = date;

    }

    public int getSteps() {
        return steps;

    }
    public void setSteps(int steps) {
        this.steps = steps;
    }
}
