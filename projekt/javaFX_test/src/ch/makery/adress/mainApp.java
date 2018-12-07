package ch.makery.adress;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class mainApp extends Application {

	
	private Stage primaryStage;
    private BorderPane rootLayout;
    

    // ... �ٸ� ������ ...

    /**
     * ����ó�� ���� observable ����Ʈ
     */
    private ObservableList<Person> personData = FXCollections.observableArrayList();

    /**
     * ������
     */
    public mainApp() {
        // ���� �����͸� �߰��Ѵ�
        personData.add(new Person("Hans", "Muster"));
        personData.add(new Person("Ruth", "Mueller"));
        personData.add(new Person("Heinz", "Kurz"));
        personData.add(new Person("Cornelia", "Meier"));
        personData.add(new Person("Werner", "Meyer"));
        personData.add(new Person("Lydia", "Kunz"));
        personData.add(new Person("Anna", "Best"));
        personData.add(new Person("Stefan", "Meier"));
        personData.add(new Person("Martin", "Mueller"));
    }

    /**
     * ����ó�� ���� observable ����Ʈ�� ��ȯ�Ѵ�.
     * @return
     */
    public ObservableList<Person> getPersonData() {
        return personData;
    }

    // ... Ŭ������ ������ �κ� ...    
    
    /**
     *  ���� ���̾ƿ� �ȿ� ����ó ��� (person overview)�� �����ش�.
     */
    
    public void showPersonOverview ( ) {
    	try {
    		// ����ó ����� �����´�.
    		FXMLLoader loader = new FXMLLoader();
    		loader.setLocation(mainApp.class.getResource("view/PersonOverview.fxml"));
    		AnchorPane personOverview = (AnchorPane) loader.load() ;
    		
    		//����ó ����� ���� ���̾ƿ� ����� �����Ѵ�.
    		rootLayout.setCenter(PersonOverview);
    		
    		//���� ���ø����̼��� ��Ʈ�ѷ��� �̿��� �� �ְ� �Ѵ�.
    		personOverviewController = loader.getController();
    		controller.setMainApp(this); 
    	}
    	
    		catch (IOException e) {
    			e.printStackTrace();
    		}
    }
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AdressApp");

        initRootLayout();

        showPersonOverview();
    }

    /**
     * ���� ���̾ƿ��� �ʱ�ȭ�Ѵ�.
     */
    public void initRootLayout() {
        try {
            // fxml ���Ͽ��� ���� ���̾ƿ��� �����´�.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(mainApp.class.getResource("view/Rootrayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // ���� ���̾ƿ��� �����ϴ� scene�� �����ش�.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * ���� ���̾ƿ� �ȿ� ����ó ���(person overview)�� �����ش�.
     */
    public void showPersonOverview() {
        try {
            // ����ó ����� �����´�.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(mainApp.class.getResource("view/PersonOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // ����ó ����� ���� ���̾ƿ� ����� �����Ѵ�.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * ���� ���������� ��ȯ�Ѵ�.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}