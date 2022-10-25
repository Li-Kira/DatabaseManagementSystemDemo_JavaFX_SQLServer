package com.gui.sqldemo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SettingSearchController implements Initializable {

    @FXML
    private ImageView ImageView1;
    @FXML
    private ImageView ImageView2;
    @FXML
    private ImageView ImageView3;
    @FXML
    private ImageView ImageView4;
    @FXML
    private ImageView ImageView5;
    @FXML
    private ImageView ImageView6;
    @FXML
    private ImageView ImageView7;
    @FXML
    private ImageView ImageView8;
    @FXML
    private ImageView ImageView9;
    @FXML
    private ImageView ImageView10;
    @FXML
    private Button AddButton;
    @FXML
    private Button SourceButton;
    @FXML
    private Button ContentButton;
    @FXML
    private Button TagButton;
    @FXML
    private Button PurchaseButton;
    @FXML
    private Button SettingButton;
    @FXML
    private Button ExitButton;

    @FXML
    private TableView<SettingSearchModel> SettingTableView;

    @FXML
    private TableColumn<SettingSearchModel, String> Setting_operate_TableColumn;

    @FXML
    private TableColumn<SettingSearchModel, String> Setting_name_TableColumn;

    @FXML
    private TableColumn<SettingSearchModel, String> Setting_sql_TableColumn;

    @FXML
    private TableColumn<SettingSearchModel, String> Setting_datetime_TableColumn;

    @FXML
    private TextField keywordTextField;



    ObservableList<SettingSearchModel> settingSearchModelObservableList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File brandingFile = new File("Images/blu_ray_disc_player_32px.png");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        ImageView1.setImage(brandingImage);

        brandingFile = new File("Images/add_database_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView2.setImage(brandingImage);

        brandingFile = new File("Images/repository_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView3.setImage(brandingImage);

        brandingFile = new File("Images/content_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView4.setImage(brandingImage);

        brandingFile = new File("Images/tags_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView5.setImage(brandingImage);

        brandingFile = new File("Images/purchase_order_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView6.setImage(brandingImage);

        brandingFile = new File("Images/settings_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView7.setImage(brandingImage);

        brandingFile = new File("Images/sign_out_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView8.setImage(brandingImage);

        brandingFile = new File("Images/settings_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView9.setImage(brandingImage);

        brandingFile = new File("Images/search_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView10.setImage(brandingImage);







        DataBaseConnection connectNow = new DataBaseConnection();
        Connection connectDB = connectNow.getConnection();
        String SourceViewQuery = "SELECT operate,login_name,runsql,UDate " +
                "FROM  dbo.log_Table";

        try{
            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(SourceViewQuery);



            while (queryOutput.next()){
                String queryOperate = queryOutput.getString("operate");
                String queryname = queryOutput.getString("login_name");
                String queryrunsql = queryOutput.getString("runsql");
                String querydate = queryOutput.getString("UDate");



                settingSearchModelObservableList.add(new SettingSearchModel(queryOperate,queryname,queryrunsql,querydate));
            }



            Setting_operate_TableColumn.setCellValueFactory(new PropertyValueFactory<>("operate"));
            Setting_name_TableColumn.setCellValueFactory(new PropertyValueFactory<>("login_name"));
            Setting_sql_TableColumn.setCellValueFactory(new PropertyValueFactory<>("runsql"));
            Setting_datetime_TableColumn.setCellValueFactory(new PropertyValueFactory<>("udate"));



            SettingTableView.setItems(settingSearchModelObservableList);

            FilteredList<SettingSearchModel> filteredData = new FilteredList<>(settingSearchModelObservableList, b -> true);

            keywordTextField.textProperty().addListener((observable, oldValue, newValue) -> {
                filteredData.setPredicate(settingSearchModel -> {
                    if(newValue.isEmpty() || newValue.isBlank() || newValue == null) {
                        return true;
                    }

                    String searchKeyword = newValue.toLowerCase();

                    if (settingSearchModel.login_name.indexOf(searchKeyword) > -1){
                        return true;
                    }
                    else
                        return false;
                });
            });

            SortedList<SettingSearchModel> sortedData = new SortedList<>(filteredData);

            sortedData.comparatorProperty().bind(SettingTableView.comparatorProperty());
            SettingTableView.setItems(sortedData);



        }catch (SQLException e){
            Logger.getLogger(SettingSearchController.class.getName()).log(Level.SEVERE,null,e);
            e.printStackTrace();
        }




    }








    public void AddButtonOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("add.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void SourceButtonOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("source_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void ContentButtonOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("content_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
/*
        Stage stage = (Stage) ContentButton.getScene().getWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("content_table.fxml"));
            Stage TableStage = new Stage();
            TableStage.initStyle(StageStyle.UNDECORATED);
            Scene scene = new Scene(root, 1280, 900);
            TableStage.setScene(scene);
            TableStage.show();

        } catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        stage.close();


 */
    }
    public void TagButtonOnAction(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("tag_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void PurchaseButtonOnAction(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("purchase_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void SettingButtonOnAction(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("settings_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void exitButtonOnAction(){
        Stage stage = (Stage) ExitButton.getScene().getWindow();
        stage.close();
    }


}
