package org.example.suunnittelumallit_command;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PixelArtEditorGUI {
    private final int gridSize = 8;
    private final GridPane gridPane;
    private final Rectangle[][] rectangles = new Rectangle[gridSize][gridSize];
    private final boolean[][] pixels = new boolean[gridSize][gridSize];
    private final Cursor cursor;

    public PixelArtEditorGUI() {
        cursor = new Cursor(gridSize);
        gridPane = new GridPane();


        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                Rectangle rect = new Rectangle(40, 40);
                rect.setFill(Color.WHITE);
                rect.setStroke(Color.BLACK);
                rectangles[row][col] = rect;
                gridPane.add(rect, col, row);
            }
        }
        updateCursor();
    }

    public GridPane getGridPane() {
        return gridPane;
    }

    public Button getCreateCodeButton() {
        Button button = new Button("Create Code");
        button.setOnAction(event -> executeCommand(new GenerateCodeCommand(pixels)));
        return button;
    }

    public void handleKeyPress(javafx.scene.input.KeyEvent event) {
        switch (event.getCode()) {
            case UP -> executeCommand(new MoveCursorUpCommand(cursor));
            case DOWN -> executeCommand(new MoveCursorDownCommand(cursor));
            case LEFT -> executeCommand(new MoveCursorLeftCommand(cursor));
            case RIGHT -> executeCommand(new MoveCursorRightCommand(cursor));
            case SPACE -> executeCommand(new TogglePixelCommand(cursor, pixels));
        }
        updateCursor();
    }

    private void executeCommand(Command command) {
        command.execute();
    }

    private void updateCursor() {
        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                if (row == cursor.getY() && col == cursor.getX()) {
                    rectangles[row][col].setStroke(Color.RED);
                } else {
                    rectangles[row][col].setStroke(Color.BLACK);
                }
                rectangles[row][col].setFill(pixels[row][col] ? Color.BLACK : Color.WHITE);
            }
        }
    }
}