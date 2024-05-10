package inputs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Controller {

    @FXML
    private TextField idField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField ageField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField departmentField;

    private Connection connection;

    public void initialize() {
        try {
            // Connect to the SQLite database
            connection = DriverManager.getConnection("jdbc:sqlite:employees.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registerEmployee(ActionEvent event) {
        try {
            // Prepare a statement to insert data into the database
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO employees (id, name, age, email, department) VALUES (?, ?, ?, ?, ?)");

            // Set the parameters for the prepared statement
            preparedStatement.setString(1, idField.getText());
            preparedStatement.setString(2, nameField.getText());
            preparedStatement.setString(3, ageField.getText());
            preparedStatement.setString(4, emailField.getText());
            preparedStatement.setString(5, departmentField.getText());

            // Execute the statement
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Other methods for database operations (e.g., updateEmployee, viewEmployees) can be added here
}
