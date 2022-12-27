package com.company.tsp_solver.utilities;

public record TimeDistance(long time, double distance) {

    public long getTime() {
        return time;
    }

    public double getDistance() {
        return distance;
    }
}
