package com.patterns.prototype;

import java.util.Objects;

public final class Task {

    private final String name;

    public Task(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "            Task [" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task1 = (Task) o;
        return Objects.equals(name, task1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
