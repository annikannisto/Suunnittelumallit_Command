package org.example.suunnittelumallit_command;

public class MoveCursorLeftCommand implements Command {
    private final Cursor cursor;

    public MoveCursorLeftCommand(Cursor cursor) {
        this.cursor = cursor;
    }

    @Override
    public void execute() {
        cursor.moveLeft();
    }
}