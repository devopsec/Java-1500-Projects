/***********************************************************************************
*  Program:  Main                                                                  *
*  Created by:   DevOpSec 13-Oct-2016   Student: Tyler Moore                       *
*  This program determines where input file is and provides front-end GUI          *
*  Want to see my other projects? Check them out here: https://devopsec.net        *
***********************************************************************************/

package cis;

import java.io.File;
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;


public class Main extends Application {
    private String filePath;
	
    @Override
    public void start(Stage primaryStage) 
	{
    	ScanInput.init();
    	
        Button btn0 = new Button();
        btn0.setText("Check Class");
        btn0.setOnAction(new EventHandler<ActionEvent>() 
		{
            @Override
            public void handle(ActionEvent event) 
			{
            	if (filePath != null)
            	{
            		ScanInput.setDataLoc(filePath);
            		ScanInput.getInputData();
            		
            		// loop creating t# of CisClasses
            		for(int i = 0; i < ScanInput.getT(); i++)
            		{
            			//set reference variable
            			Data temp = ScanInput.getClassData(i);
            			
            			if (temp.isClassCancelled() == true)
            			{
            				JOptionPane.showMessageDialog(null, "Class #" + (i+1) +
            											 ": Is CANCELLED.");
            			}
            			else
            			{
            				JOptionPane.showMessageDialog(null, "Class #" + (i+1) +
									 					 ": Is NOT Cancelled.");
            			}
            			
            			//clear reference variable
            			temp = null;
            		}
            	}
            	else
            	{
            		JOptionPane.showMessageDialog(null, "You must select " +
		 					 					 "a file to import data from");
            	}
            	System.exit(0);
            } 
        });
        
        Button btn1 = new Button();
        btn1.setText("Choose File");
        btn1.setOnAction(new EventHandler<ActionEvent>() 
		{
            @Override
            public void handle(ActionEvent event) 
			{
            	try
        		{
            		FileChooser fileChooser = new FileChooser();
            		fileChooser.setTitle("Open Resource File");
            		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"));
        			File selectedFile = fileChooser.showOpenDialog(primaryStage);
        			if (selectedFile != null) 
        			{
        				filePath = selectedFile.getAbsolutePath();
        			}
        		}
        		catch (SecurityException eSE)
        		{
        			JOptionPane.showMessageDialog(null, "File not accessible\n" +
        					 					 " Try selecting another file");
        		}
            }
        });
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().addAll(btn0, btn1);
        grid.add(hbBtn, 0, 0);

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Class Cancellation Checker");
        primaryStage.show();
    }

 public static void main(String[] args) 
 	{
        launch(args);
    }
}


