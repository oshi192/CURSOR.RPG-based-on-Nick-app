package game;

import lombok.Getter;
//will be add in game later;
public enum Mode {
    EASY(20, 10), MEDIUM(50, 30), HARD(65, 40);

    @Getter
    private int width, height;

    Mode(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
