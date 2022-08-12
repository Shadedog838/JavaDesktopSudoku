module com.example.javadesktopsudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens sudoku to javafx.fxml;
    exports sudoku;
    exports sudoku.problemdomain;
    opens sudoku.problemdomain to javafx.fxml;
}