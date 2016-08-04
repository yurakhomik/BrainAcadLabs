package application;
	
import java.sql.SQLException;

import application.orm.GoodsBookDB;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;
 
public class DataTableMain extends Application {
 
    private TableView<Good> table = new TableView<Good>();
    final HBox hb = new HBox();
 
    public static void main(String[] args) {
    	launch(args);
    }
 
    @Override
    public void start(Stage stage) {
    	try {
			initData();
		} catch (SQLException | ClassNotFoundException e1) {
			e1.printStackTrace();
		}
    	
        Scene scene = new Scene(new Group());
        stage.setTitle("Goods Table");
        stage.setWidth(325);
        stage.setHeight(510);
 
        final Label label = new Label("Goods Book");
        label.setFont(new Font("Arial", 15));
 
        table.setEditable(true);
        Callback<TableColumn, TableCell> cellFactory =
             new Callback<TableColumn, TableCell>() {
                 public TableCell call(TableColumn p) {
                    return new EditingCell();
                 }
             };
 
        TableColumn firstNameCol = new TableColumn("Name");
        firstNameCol.setMinWidth(95);
        firstNameCol.setCellValueFactory(
            new PropertyValueFactory<Good, String>("name"));
        firstNameCol.setCellFactory(cellFactory);
        firstNameCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Good, String>>() {
                @Override
                public void handle(CellEditEvent<Good, String> t) {
                    ((Good) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setName(t.getNewValue());
                }
             }
        );
 
 
        TableColumn lastNameCol = new TableColumn("Weigth");
        lastNameCol.setMinWidth(95);
        lastNameCol.setCellValueFactory(
            new PropertyValueFactory<Good, String>("weigth"));
        lastNameCol.setCellFactory(cellFactory);
        lastNameCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Good, String>>() {
                @Override
                public void handle(CellEditEvent<Good, String> t) {
                    ((Good) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setWeigth(t.getNewValue());
                }
            }
        );
 
        TableColumn emailCol = new TableColumn("Price");
        emailCol.setMinWidth(95);
        emailCol.setCellValueFactory(
            new PropertyValueFactory<Good, String>("price"));
        emailCol.setCellFactory(cellFactory);
        emailCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Good, String>>() {
                @Override
                public void handle(CellEditEvent<Good, String> t) {
                    ((Good) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setPrice(t.getNewValue());
                }
            }
        );
 
        try {
			table.setItems(GoodsBookDB.readPersons());
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
 
        final TextField addFirstName = new TextField();
        addFirstName.setPromptText(GoodsBookDB.DB_FIRST_COLUMN_NAME);
        addFirstName.setMaxWidth(firstNameCol.getPrefWidth());
        final TextField addLastName = new TextField();
        addLastName.setMaxWidth(lastNameCol.getPrefWidth());
        addLastName.setPromptText(GoodsBookDB.DB_SECOND_COLUMN_NAME);
        final TextField addEmail = new TextField();
        addEmail.setMaxWidth(emailCol.getPrefWidth());
        addEmail.setPromptText(GoodsBookDB.DB_THIRD_COLUMN_NAME);
 
        final Button addButton = new Button("Add");
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            	updateUsers(new Good(addFirstName.getText(), 
            			               addLastName.getText(),
					                   addEmail.getText()));
                addFirstName.clear();
                addLastName.clear();
                addEmail.clear();
            }
        });
 
        hb.getChildren().addAll(addFirstName, addLastName, addEmail, addButton);
        hb.setSpacing(3);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table, hb);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
    }
    
    private void initData() throws SQLException, ClassNotFoundException {
    	GoodsBookDB.deletePersons();
    	GoodsBookDB.createPersons(new Good("Apple", "4.5", "8"),
                new Good("Meat", "2.3", "85.65"),
                new Good("Cheese", "0.8", "47.1"),
                new Good("Sausages", "1.5", "41.7"),
                new Good("Ice cream", "1", "60"));
    }
    
    private void updateUsers(Good good) {
    	try {
			GoodsBookDB.createPersons(good);
			table.setItems(GoodsBookDB.readPersons());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
    }
 
    public static class Good {
 
        private final SimpleStringProperty name;
        private final SimpleStringProperty weigth;
        private final SimpleStringProperty price;
 
        public Good(String name, String weigth, String price) {
            this.name = new SimpleStringProperty(name);
            this.weigth = new SimpleStringProperty(weigth);
            this.price = new SimpleStringProperty(price);
        }
 
        public String getName() {
            return name.get();
        }
 
        public void setName(String fName) {
            name.set(fName);
        }
 
        public String getWeigth() {
            return weigth.get();
        }
 
        public void setWeigth(String fName) {
            weigth.set(fName);
        }
 
        public String getPrice() {
            return price.get();
        }
 
        public void setPrice(String fName) {
            price.set(fName);
        }
        
        @Override
        public String toString() {
        	return "Person " + name + "   " + weigth + "   " + price + "\n";
        }
    }
 
    class EditingCell extends TableCell<Good, String> {
 
        private TextField textField;
 
        public EditingCell() {
        }
 
        @Override
        public void startEdit() {
            if (!isEmpty()) {
                super.startEdit();
                createTextField();
                setText(null);
                setGraphic(textField);
                textField.selectAll();
            }
        }
 
        @Override
        public void cancelEdit() {
            super.cancelEdit();
 
            setText((String) getItem());
            setGraphic(null);
        }
 
        @Override
        public void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
 
            if (empty) {
                setText(null);
                setGraphic(null);
            } else {
                if (isEditing()) {
                    if (textField != null) {
                        textField.setText(getString());
                    }
                    setText(null);
                    setGraphic(textField);
                } else {
                    setText(getString());
                    setGraphic(null);
                }
            }
        }
 
        private void createTextField() {
            textField = new TextField(getString());
            textField.setMinWidth(this.getWidth() - this.getGraphicTextGap()* 2);
            textField.focusedProperty().addListener(new ChangeListener<Boolean>(){
                @Override
                public void changed(ObservableValue<? extends Boolean> arg0, 
                    Boolean arg1, Boolean arg2) {
                        if (!arg2) {
                            commitEdit(textField.getText());
                        }
                }
            });
        }
 
        private String getString() {
            return getItem() == null ? "" : getItem().toString();
        }
    }
}
