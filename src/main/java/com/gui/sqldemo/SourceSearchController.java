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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.sql.*;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SourceSearchController implements Initializable {

    @FXML
    private TableView<SourceSearchModel> SourceTableView;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_title_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_director_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_producer_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_screenwriter_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_cast_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_publisher_TableColumn;
    @FXML
    private TextField keywordTextField;
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


    ObservableList<SourceSearchModel> sourceSearchModelObservableList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
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

        brandingFile = new File("Images/repository_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView9.setImage(brandingImage);

        brandingFile = new File("Images/search_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView10.setImage(brandingImage);




        DataBaseConnection connectNow = new DataBaseConnection();
        Connection connectDB = connectNow.getConnection();

        String SourceViewQuery = "SELECT Title,Director,Producer,Screenwriter,Cast,Publisher "
        +" FROM  VCD_info INNER JOIN VCD_Source ON VCD_info.VCD_id = VCD_Source.VCD_id";

        try{
            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(SourceViewQuery);

            while (queryOutput.next()){
                String queryTitle = queryOutput.getString("Title");
                String queryDirector = queryOutput.getString("Director");
                String queryProducer = queryOutput.getString("Producer");
                String queryScreenwriter = queryOutput.getString("Screenwriter");
                String queryCast = queryOutput.getString("Cast");
                String queryPublisher = queryOutput.getString("Publisher");

                sourceSearchModelObservableList.add(new SourceSearchModel(queryTitle,queryDirector,queryProducer,queryScreenwriter
                ,queryCast,queryPublisher));
            }

            Source_title_TableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
            Source_director_TableColumn.setCellValueFactory(new PropertyValueFactory<>("director"));
            Source_producer_TableColumn.setCellValueFactory(new PropertyValueFactory<>("producer"));
            Source_screenwriter_TableColumn.setCellValueFactory(new PropertyValueFactory<>("screenwriter"));
            Source_cast_TableColumn.setCellValueFactory(new PropertyValueFactory<>("cast"));
            Source_publisher_TableColumn.setCellValueFactory(new PropertyValueFactory<>("publisher"));

            SourceTableView.setItems(sourceSearchModelObservableList);


            FilteredList<SourceSearchModel> filteredData = new FilteredList<>(sourceSearchModelObservableList,b -> true);

            keywordTextField.textProperty().addListener((observable, oldValue, newValue) -> {
                filteredData.setPredicate(sourceSearchModel -> {
                    if(newValue.isEmpty() || newValue.isBlank() || newValue == null) {
                        return true;
                    }

                    String searchKeyword = newValue.toLowerCase();

                    if (sourceSearchModel.getTitle().indexOf(searchKeyword) > -1){
                        return true;
                    }
                    else
                        return false;
                });
            });

            SortedList<SourceSearchModel> sortedData = new SortedList<>(filteredData);
            sortedData.comparatorProperty().bind(SourceTableView.comparatorProperty());
            SourceTableView.setItems(sortedData);




        }catch (SQLException e){
            Logger.getLogger(SourceSearchController.class.getName()).log(Level.SEVERE,null,e);
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
