package com.example.comp228testwinter2024;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class VehicleSalesController implements Initializable {
    @FXML
    private TextField budgetTextField;

    @FXML
    private Label carInfoLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize method
    }

    @FXML
    private void searchVehicles(ActionEvent event) {
        try {
            double budget = Double.parseDouble(budgetTextField.getText());
            List<Vehicle> vehicles = Database.getVehiclesByBudget(budget);
            displayVehicles(vehicles);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input for budget.");
            showAlert(AlertType.ERROR, "Error", "Invalid Input",
                    "Please enter a valid number for the budget.");
        }
    }

    private void displayVehicles(List<Vehicle> vehicles) {
        StringBuilder vehicleInfo = new StringBuilder();
        for (Vehicle vehicle : vehicles) {
            vehicleInfo.append(vehicle.toString()).append("\n");
        }
        carInfoLabel.setText(vehicleInfo.toString());
    }

    private void showAlert(AlertType type, String title, String header, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}

