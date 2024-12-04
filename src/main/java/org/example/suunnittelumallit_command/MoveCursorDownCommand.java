package org.example.suunnittelumallit_command;

public class MoveCursorDownCommand implements Command {
    private final Cursor cursor;

    public MoveCursorDownCommand(Cursor cursor) {
        this.cursor = cursor;
    }

    @Override
    public void execute() {
        cursor.moveDown();
    }
}