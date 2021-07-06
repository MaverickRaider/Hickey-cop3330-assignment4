/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Michael Hickey
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;

public class AppController {
    @FXML
    private TextField displayListTitle;
    private TextField displayItemTitle;
    private TextField displayItemDescription;
    private TextField displayDueDate;

    @FXML
    public void viewListClicked(ActionEvent actionEvent) {
        viewList();
    }

    public void viewList() {
        // Check which list is marked with the checkListMarked()
        // Find TodoList
        // Display TodoList in new GUI
    }

    @FXML
    public void editListClicked(ActionEvent actionEvent) {
        editList();
    }

    public void editList() {
        // Check which list is marked with the checkListMarked()
        // is nothing checked, ignore input by user
        // Select title text field to be edited
        // Display the new title in the text field
    }

    @FXML
    public void deleteListClicked(ActionEvent actionEvent) {
        deleteList();
    }

    public void deleteList() {
        // Check which list is marked with the checkListMarked()
        // is nothing checked, ignore input by user
        // Delete whole list from the lists
    }

    @FXML
    public void newListClicked(ActionEvent actionEvent) {
        newList();
    }

    public void newList() {
        // Create a new list in GUI with the View, Title, and Check Box
        // Ask for Title
        // call newTask() as we should make empty lists
        // Display list
    }

    @FXML
    public void checkListMarked(ActionEvent actionEvent) {
        isListChecked();
    }

    public void isListChecked() {
        // Find which list has the check box marked
        // if any lists are checked off, return true.
        // if nothing is checked, ignore input
    }

    @FXML
    public void saveListClicked(ActionEvent actionEvent) {
        saveList();
    }

    public void saveList() {
        // Check which list is marked with the checkListMarked()
        // Ask User what they want to name the new file
        // Write Selected Lists to file
    }

    @FXML
    public void editTaskClicked(ActionEvent actionEvent) {
        editTask();
    }

    public void editTask() {
        // Check which task is marked with the checkListMarked()
        // edit the title of the item first
        // edit the description of the item next
        // edit the due date of the item
    }

    @FXML
    public void deleteTaskClicked(ActionEvent actionEvent) {
        deleteTask();
    }

    public void deleteTask() {
        // Check which task is marked with the checkListMarked()
        // remove item from list and GUI
    }

    @FXML
    public void checkTaskMarked(ActionEvent actionEvent) {
        isTaskChecked();
    }

    public void isTaskChecked() {
        // Find which list has the check box marked
        // if any lists are checked off, return true.
        // if nothing is checked, ignore input
    }

    @FXML
    public void saveTaskClicked(ActionEvent actionEvent) {
        saveTask();
    }

    public void saveTask() {
        // Check which task is marked with the checkListMarked()
        // ask user for title
        // write just item, description and due date to file
    }

    @FXML
    public void newTaskClicked(ActionEvent actionEvent) {
        newTask();
    }

    public void newTask() {
        // Generate a new item in the list
        // ask for item title
        // ask for description
        // ask for due date
    }

    @FXML
    public void completed(ActionEvent actionEvent) {
        completedTask();
    }

    public void completedTask() {
        // Check which item is marked with the checkListMarked()
        // set value 'complete' to item
    }
}
