package ch.makery.adress.view;

	import javafx.fxml.FXML ; 
	import javafx.scene.control.Label;
	import javafx.scene.control.TableColumn;
	import javafx.scene.control.TableView;
	import ch.makery.adress.mainApp;
	import ch.makery.adress.model.Person;
	
public class personOverviewController {
	@FXML
	private TableView<Person> PersonTable;
	@FXML
	private TableColumn<Person, String> firstNameColumn ;
	@FXML
	private TableColumn<Person, String> lastNameColumn;
	
	@FXML
	private Label firstNameLabel ; 
	@FXML
	private Label lastNameLabel ; 
	@FXML
	private Label streetLabel ;
	@FXML 
	private Label postalCodeLabel ;
	@FXML
	private Label cityLabel ; 
	@FXML
	private Label birthdayLabel ; 
	
	// ���� ���ø����̼� ����
	private mainApp mainApp;
	
	/**
	 * ������.
	 * initialize() �޼��� ������ ȣ��ȴ�.
	 */
	
	public personOverviewController() {
	}
	
	/**
	 * ��Ʈ�ѷ� Ŭ������ �ʱ�ȭ�Ѵ�.
	 * fxml ������ �ε�ǰ� ���� �ڵ����� ȣ��ȴ�.
	 */
	@FXML
	private void initialize ( ) {
		// ����ó ���̺��� �� ���� �ʱ�ȭ �Ѵ�.
		firstNameColumn.setCellValueFactory(cellData - > cellDate.getValue().firstNameProperty());
		lastNameColumn.setCellValueFactory(cellDate -> cellData.getValue().lastNameProperty());
	}
	
	/**
	 * ������ �ٽ� �����ϱ� ���� ���� ���ø����̼��� ȣ���Ѵ�.
	 * 
	 * @param mainApp
	 */
	
	public void setMainApp(mainApp mainApp) {
		this.mainApp = mainApp ; 
	
		// ���̺� observable ����Ʈ �����͸� �߰��Ѵ�.
	personTable.setItems (mainApp.getPersonData());'
	}
}