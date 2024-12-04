package org.example.suunnittelumallit_command;

public class TogglePixelCommand implements Command {
    private final Cursor cursor;
    private final boolean[][] pixels;

    public TogglePixelCommand(Cursor cursor, boolean[][] pixels) {
        this.cursor = cursor;
        this.pixels = pixels;
    }

    @Override
    public void execute() {
        int x = cursor.getX();
        int y = cursor.getY();
        pixels[y][x] = !pixels[y][x];
    }
}