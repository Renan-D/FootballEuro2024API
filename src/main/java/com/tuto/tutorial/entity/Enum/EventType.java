package com.tuto.tutorial.entity.Enum;

public enum EventType {
    GOAL("Goal"),
    YELLOW_CARD("Yellow Card"),
    RED_CARD("Red Card"),
    SUBSTITUTION("Substitution"),
    OWN_GOAL("Own Goal"),
    INJURY("Injury"),
    ASSIST("Assist");

    private final String displayName;

    EventType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
