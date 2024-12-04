package org.example.suunnittelumallit_command;

public class MoveCursorRightCommand implements Command {
    private final Cursor cursor;

    public MoveCursorRightCommand(Cursor cursor) {
        this.cursor = cursor;
    }

    @Override
    public void execute() {
        cursor.moveRight();
    }
}