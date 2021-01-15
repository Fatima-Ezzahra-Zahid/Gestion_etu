package sample;

import DAO.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller {
    public Button button;
    public TextField TextField;
    public Label Label;

    public void button(ActionEvent actionEvent) throws SQLException {

        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();

        String sql = "INSERT INTO specialite(nom)  VALUES ('" + TextField.getText() + "')";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        }
    }
}
