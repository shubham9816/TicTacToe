module com.shubham.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shubham.tictactoe to javafx.fxml;
    exports com.shubham.tictactoe;
}