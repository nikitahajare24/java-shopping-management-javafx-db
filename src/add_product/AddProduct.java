package add_product;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddProduct 
{
	public static void showAddProductScreen() throws Exception
	{
		Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users//NIKITA HAJARE//Downloads//ShoppingManagementJavaFxDB//src//add_product//add_product.fxml"));
		StageFactory.stage.setTitle("Add Product Details");
		StageFactory.stage.setFullScreen(true);
		
		Scene s = new Scene(actorGroup);
		StageFactory.stage.setScene(s);
		StageFactory.stage.show();
	}

}