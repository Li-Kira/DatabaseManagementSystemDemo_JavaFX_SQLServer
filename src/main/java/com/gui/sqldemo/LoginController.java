package com.gui.sqldemo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;


import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

public class LoginController extends HelloApplication implements Initializable {



    @FXML
    private Button cancelButton;
    @FXML
    private Button loginButton;
    @FXML
    private Text loginMessageText;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterPasswordField;





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile = new File("Images/93492380.jpg");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);
    }



    public void loginButtonOnAction(ActionEvent event){

        if (usernameTextField.getText().isBlank() == false && enterPasswordField.getText().isBlank() ==false){
            validateLogin();
        }
        else {
            loginMessageText.setText("Blank, Please enter");
        }

    }




     public void cancelButtonOnAction(){
         Stage stage = (Stage) cancelButton.getScene().getWindow();
         stage.close();

     }


     public void  validateLogin(){

        if(usernameTextField.getText().equals("sa")&&enterPasswordField.getText().equals("123456"))
        {
            loginMessageText.setText("Connect Success");
           // DataBaseConnection connectNow = new DataBaseConnection();
          //  Connection connectDB = connectNow.getConnection();
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.close();
            ViewAlter();


        }
        else {
            loginMessageText.setText("Invalid Login, Please try again");
        }


     }



     public void ViewAlter(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("source_table.fxml"));
            Stage TableStage = new Stage();
            TableStage.initStyle(StageStyle.UNDECORATED);
            Scene scene = new Scene(root, 1280, 900);
            TableStage.setScene(scene);
            TableStage.show();
            TableStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                public void handle(WindowEvent event) {
                    //此处当stage关闭时，同时结束程序，避免stage关闭后，程序界面关闭了，但后台线程却依然运行的问题
                    System.exit(0);
                }
            });




        } catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }

     }







}