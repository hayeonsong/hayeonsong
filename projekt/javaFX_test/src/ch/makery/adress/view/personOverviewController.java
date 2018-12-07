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
	
	// 메인 애플리케이션 참조
	private mainApp mainApp;
	
	/**
	 * 생성자.
	 * initialize() 메서드 이전에 호출된다.
	 */
	
	public personOverviewController() {
	}
	
	/**
	 * 컨트롤러 클래스를 초기화한다.
	 * fxml 파일이 로드되고 나서 자동으로 호출된다.
	 */
	@FXML
	private void initialize ( ) {
		// 연락처 테이블의 두 열을 초기화 한다.
		firstNameColumn.setCellValueFactory(cellData - > cellDate.getValue().firstNameProperty());
		lastNameColumn.setCellValueFactory(cellDate -> cellData.getValue().lastNameProperty());
	}
	
	/**
	 * 참조를 다시 유지하기 위해 메인 어플리케이션이 호출한다.
	 * 
	 * @param mainApp
	 */
	
	public void setMainApp(mainApp mainApp) {
		this.mainApp = mainApp ; 
	
		// 테이블에 observable 리스트 데이터를 추가한다.
	personTable.setItems (mainApp.getPersonData());'
	}
}