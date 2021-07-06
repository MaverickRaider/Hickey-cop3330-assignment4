/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Michael Hickey
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppControllerTest {


    @Test
    void viewList() {
        // get list
        // open Task fmxl showing the list
    }

    @Test
    void editList() {
        // get list
        // ask user for title
        // change title to new string

    }

    @Test
    void deleteList() {
        // generate mock list with dummy values
        // remove list and all items
        // check to see if the list is gone
        // if list is gone, return true

    }

    @Test
    void newList() {
        // generate new list
        // Ask for title
        // Display empty list

    }

    @Test
    void isListChecked() {
        // click check box
        // check if box has a check
        // return results

    }

    @Test
    void saveList() {
        // generate new list to be saved
        // get list title
        // get all items
        // get each item title, description, duedate
        // find if each item is completed or not
        // make a new file called 'test_save.txt'
        // write list to file

    }

    @Test
    void editTask() {
        // click on edit
        // ask for new item title
        // ask for new description
        // ask for new due date
        // assert values into item
        // display item

    }

    @Test
    void deleteTask() {
        // generate new list with an item to be deleted
        // fill item with dummy values
        // display item
        // remove the item
        // display list

    }

    @Test
    void isTaskChecked() {
        // click check box
        // check if box has a check
        // return results
    }

    @Test
    void saveTask() {
        // generate new item to be saved
        // get each item title, description, due date
        // find if each item is completed or not
        // make a new file called 'test_item_save.txt'
        // write item and info to file
    }

    @Test
    void newTask() {
        // generate new item
        // ask for item title
        // ask for description
        // ask for due date
        // leave completed unchecked
        // display new item

    }

    @Test
    void completedTask() {
        // click check box
        // if not checked, return completed as true
        // if already checked, return completed as false
        // display item and completed value

    }

}