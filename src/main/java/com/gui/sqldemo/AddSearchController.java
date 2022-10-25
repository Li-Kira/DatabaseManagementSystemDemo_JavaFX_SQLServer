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

import javafx.scene.text.Text;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddSearchController implements Initializable {

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
    private TextField keywordTextField;


    @FXML
    private TableView<AddSearchModel> AddTableView;

    @FXML
    private TableColumn<AddSearchModel, String> Add_title_TableColumn;

    @FXML
    private TableColumn<AddSearchModel, Float> Add_price_TableColumn;

    @FXML
    private TableColumn<AddSearchModel, Integer> Add_stock_TableColumn;

    @FXML
    private TextField titleTextField;

    @FXML
    private TextField numTextField;

    @FXML
    private Text addMessageText;


    @FXML
    private Text orderTitle;

    @FXML
    private Text orderNum;

    @FXML
    private Text TotalMessageText;


    ObservableList<AddSearchModel> addSearchModelObservableList = FXCollections.observableArrayList();


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

        brandingFile = new File("Images/add_database_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView9.setImage(brandingImage);

        brandingFile = new File("Images/search_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView10.setImage(brandingImage);




        DataBaseConnection connectNow = new DataBaseConnection();
        Connection connectDB = connectNow.getConnection();
        String SourceViewQuery = " SELECT Title,Purchase_Price,Purchase_Stocks " +
                "FROM  Products_info INNER JOIN VCD_info ON Products_info.VCD_id = VCD_info.VCD_id";

        try{
            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(SourceViewQuery);



            while (queryOutput.next()){
                String queryTitle = queryOutput.getString("Title");
                Float queryPrice = queryOutput.getFloat("Purchase_Price");
                Integer queryStock = queryOutput.getInt("Purchase_Stocks");



                addSearchModelObservableList.add(new AddSearchModel(queryTitle,queryPrice,queryStock));
            }



            Add_title_TableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
            Add_price_TableColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
            Add_stock_TableColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));


            AddTableView.setItems(addSearchModelObservableList);

            FilteredList<AddSearchModel> filteredData = new FilteredList<>(addSearchModelObservableList, b -> true);

            keywordTextField.textProperty().addListener((observable, oldValue, newValue) -> {
                filteredData.setPredicate(addSearchModel -> {
                    if(newValue.isEmpty() || newValue.isBlank() || newValue == null) {
                        return true;
                    }

                    String searchKeyword = newValue.toLowerCase();

                    if (addSearchModel.getTitle().indexOf(searchKeyword) > -1){
                        return true;
                    }
                    else
                        return false;
                });
            });

            SortedList<AddSearchModel> sortedData = new SortedList<>(filteredData);
            sortedData.comparatorProperty().bind(AddTableView.comparatorProperty());
            AddTableView.setItems(sortedData);




        }catch (SQLException e){
            Logger.getLogger(AddSearchController.class.getName()).log(Level.SEVERE,null,e);
            e.printStackTrace();
        }


    }




/*
    public void AddButtonOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("add.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


 */
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




    public void AddcartButtonOnAction(ActionEvent event){

        String title;
        float price;
        int num;
        String searchSQL;
        String insertSQL;
        float total;

        if (titleTextField.getText().isBlank() == false && numTextField.getText().isBlank() ==false) {
            orderTitle.setText(titleTextField.getText());
            orderNum.setText(numTextField.getText());

            try {
                DataBaseConnection connectNow = new DataBaseConnection();
                Connection connectDB = connectNow.getConnection();
                Statement statement = connectDB.createStatement();

                title = orderTitle.getText();
                searchSQL = "SELECT Purchase_Price FROM Products_info,VCD_info WHERE Title ='" +title+"' AND VCD_info.VCD_id=Products_info.VCD_id";

                ResultSet rs = statement.executeQuery(searchSQL);

                while (rs.next())
                {
                    System.out.println(rs.getFloat("Purchase_Price"));
                    price = rs.getFloat("Purchase_Price");
                    num = Integer.parseInt(orderNum.getText());

                    total = price* (num);
                    System.out.println(total);
                    TotalMessageText.setText(Float.toString(total));
                }
                statement.close();
                connectDB.close();

            }catch (SQLException e){
                Logger.getLogger(AddSearchController.class.getName()).log(Level.SEVERE,null,e);
                e.printStackTrace();
            }
        }
        else {
            addMessageText.setText("Blank, Please enter!");
        }


    }



    public void RemoveButtonOnAction(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("add.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }




    public void BuyButtonOnAction(){

        String title;
        int num;
        String searchSQL;
        String insertSQL;
        Random random = new Random();
        int ran = random.nextInt(10000);

        if (orderTitle.getText().isBlank() == false && orderNum.getText().isBlank() ==false) {


            try {
                title = orderTitle.getText();
                num = Integer.parseInt(orderNum.getText());


                searchSQL = "SELECT VCD_id FROM VCD_info WHERE Title ='"+title+"'";



                DataBaseConnection connectNow = new DataBaseConnection();
                Connection connectDB = connectNow.getConnection();
                Statement statement = connectDB.createStatement();

                ResultSet rs = statement.executeQuery(searchSQL);

                while (rs.next())
                {
                    System.out.println(rs.getString("VCD_id"));
                    insertSQL = "INSERT INTO Purchase_Order VALUES('"+""+ran+"','"+rs.getString("VCD_id")+"','"+num+"');";

                    System.out.println(insertSQL);

                    statement.executeUpdate(insertSQL);
                }


                statement.close();
                connectDB.close();

            }catch (SQLException e){
                Logger.getLogger(AddSearchController.class.getName()).log(Level.SEVERE,null,e);
                e.printStackTrace();
            }


        }
        else
        {


        }

    }









}
