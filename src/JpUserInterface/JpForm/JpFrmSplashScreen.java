package JpUserInterface.JpForm;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import JpUserInterface.JpResource.JpIAStyle;

public abstract class JpFrmSplashScreen {

    private static JFrame jpFrmSplash;
    private static JProgressBar jpPrbLoading;
    private static ImageIcon jpIconImage;
    private static JLabel jpLblSplash;

    public static void show() {
        jpIconImage = new ImageIcon(JpIAStyle.jpURL_SPLASH);
        jpLblSplash = new JLabel(jpIconImage);
        jpPrbLoading = new JProgressBar(0, 100);

        jpPrbLoading.setStringPainted(true);

        jpFrmSplash = new JFrame();
        jpFrmSplash.setUndecorated(true);
        jpFrmSplash.getContentPane().add(jpLblSplash, BorderLayout.CENTER);
        jpFrmSplash.add(jpPrbLoading, BorderLayout.SOUTH);
        jpFrmSplash.setSize(jpIconImage.getIconWidth(), jpIconImage.getIconHeight());
        jpFrmSplash.setLocationRelativeTo(null);

        jpFrmSplash.setVisible(true);
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            jpPrbLoading.setValue(i);
        }
        jpFrmSplash.setVisible(false);

    }
}
