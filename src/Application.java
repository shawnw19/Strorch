import builtin.ImageViewer;
import core.Spaces;

public class Application {
    public static void main(String[] args) {
        Spaces spaces = Spaces.getInstance();

        ImageViewer imageViewer = new ImageViewer();
        imageViewer.view();
    }
}
