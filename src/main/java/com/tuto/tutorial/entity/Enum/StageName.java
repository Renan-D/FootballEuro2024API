package com.tuto.tutorial.entity.Enum;

public enum StageName {
    GROUP_STAGE("Group Stage"),
    ROUND_OF_16("Round of 16"),
    QUARTER_FINAL("Quarter Final"),
    SEMI_FINAL("Semi Final"),
    FINAL("Final");

    private final String displayName;

    StageName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
