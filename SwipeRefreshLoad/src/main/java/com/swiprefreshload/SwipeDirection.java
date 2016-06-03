package com.swiprefreshload;

/**
 * Created by Administrator on 2016/6/2.
 */
public enum SwipeDirection {
    TOP(0),
    BOTTOM(1),
    BOTH(2);

    private int mValue;

    SwipeDirection(int mValue) {
        this.mValue = mValue;
    }

    public static SwipeDirection getFromInt(int value) {
        for (SwipeDirection direction : SwipeDirection.values()) {
            if (direction.mValue == value) {
                return direction;
            }
        }
        return BOTH;
    }
}
