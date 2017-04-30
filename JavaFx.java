/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author methu
 */
public class JavaFx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Font fa= Font.loadFont(FA.getFont(), 30);
        
        //button with icon as label
        Button btn = new Button();
        btn.setText(FA.THUMBS_UP);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("i like it");
            }
        });
        
        //sample text with icons
        Label label= new Label();
        label.setText(FA.EDIT+" This is a sample icon text on "+FA.GITHUB);
        
        // sample text with icons
        // note we set label font. this should be avoided with icon fonts as
        // they dont have text characters. the Font.loadFont function
        // loads the font to application and will be availabe as system font
        Label label1= new Label();
        label1.setText(FA.EDIT+" This is a sample icon text on "+FA.GITHUB);
        label1.setFont(fa);
        
        //add the components to layout
        VBox root= new VBox();
        root.getChildren().add(btn);
        root.getChildren().add(label);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle(FA.HOME+" Icon Font!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
