
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



/**
 *
 * @author isaura
 */
public class MeuProgma extends Application
{
    
    public static void main(String[] args)
    {
        launch();
        
    }

    @Override
    public void start(Stage prim) throws Exception 
    {
        VBox v = new VBox();
        
        v.setTranslateX(50);
        v.setTranslateY(70);
        
        v.setSpacing(5);
        
        v.setAlignment(Pos.CENTER);
        
        Rectangle rAzual = new Rectangle(40,20);
        Rectangle verde = new Rectangle(50,70);
        Rectangle vermelho = new Rectangle(90,100);
        
        rAzual.setFill(Color.BLUE);
        verde.setFill(Color.GREEN);
        vermelho.setFill(Color.RED);
        
        v.getChildren().addAll(rAzual,verde,vermelho);
        
        prim.setScene( new Scene(v,500,500));
        
        prim.setTitle("JAVAFX");
        
        prim.show();
        

    }
    
}

