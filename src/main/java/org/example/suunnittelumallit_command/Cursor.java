package org.example.suunnittelumallit_command;

public class Cursor {
    private int x;
    private int y;
    private final int gridSize;

    public Cursor(int gridSize) {
        this.gridSize = gridSize;
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveUp() {
        if (y > 0) y--;
    }

    public void moveDown() {
        if (y < gridSize - 1) y++;
    }

    public void moveLeft() {
        if (x > 0) x--;
    }

    public void moveRight() {
        if (x < gridSize - 1) x++;
    }
}
