package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class MyController {
	@FXML
	private Button right;
	@FXML
	private Button left;
	@FXML
	private ListView<String> listCandidates = new ListView<String>();
	@FXML
	private ListView<String> listSelected = new ListView<String>();

	private final ObservableList<String> data = FXCollections.observableArrayList("Marcos", "Javier", "Niko");

	@FXML
	public void initialize() {
		listCandidates.setItems(this.data);

	}

	public void moveRight(ActionEvent event) {
		if (listSelected.getItems() != null && listCandidates.getSelectionModel().getSelectedItem() != null) {
			listSelected.getItems().add(listCandidates.getSelectionModel().getSelectedItem());
			listCandidates.getItems().remove(listCandidates.getSelectionModel().getSelectedIndex());
			initialize();
		}
	}

	public void moveLeft(ActionEvent event) {
		if (listCandidates.getItems() != null && listSelected.getSelectionModel().getSelectedItem() != null) {
			listCandidates.getItems().add(listSelected.getSelectionModel().getSelectedItem());
			listSelected.getItems().remove(listSelected.getSelectionModel().getSelectedIndex());


		}
	}
}
