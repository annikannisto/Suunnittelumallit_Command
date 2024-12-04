package org.example.suunnittelumallit_command;


public class GenerateCodeCommand implements Command {
    private final boolean[][] pixels;

    public GenerateCodeCommand(boolean[][] pixels) {
        this.pixels = pixels;
    }

    @Override
    public void execute() {
        StringBuilder code = new StringBuilder("int[][] pixelArt = {\n");
        for (boolean[] row : pixels) {
            code.append("    {");
            for (int col = 0; col < row.length; col++) {
                code.append(row[col] ? "1" : "0");
                if (col < row.length - 1) code.append(", ");
            }
            code.append("},\n");
        }
        code.append("};");
        System.out.println(code);
    }
}

