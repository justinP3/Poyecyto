package JpUserInterface.JpResource;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public abstract class JpIAStyle {

    public static final Color jpCOLOR_FONT = new Color(200, 100, 50);
    public static final Color jpCOLOR_FONT_LIGHT = new Color(100, 100, 100);
    public static final Color jpCOLOR_CURSOR = Color.black;
    public static final Color jpCOLO_BORDER = Color.lightGray;

    public static final Font jpFONT = new Font("JetBrains Mono", Font.PLAIN, 14);
    public static final Font jpFONT_BOLD = new Font("JetBrains Mono", Font.BOLD | jpFONT.PLAIN, 14);
    public static final Font jpFONT_SMALL = new Font("JetBrains Mono", Font.PLAIN | jpFONT.PLAIN, 10);

    public static final int jpALIGMENT_LEFT = SwingConstants.LEFT;
    public static final int jpALIGMENT_RIGHT = SwingConstants.RIGHT;
    public static final int jpALIGMENT_CENTER = SwingConstants.CENTER;

    public static final Cursor jpCURSOR_HAND = new Cursor(Cursor.HAND_CURSOR);
    public static final Cursor jpCURSOR_DEFAULT = new Cursor(Cursor.DEFAULT_CURSOR);

    public static final URL jpURL_MAIN = JpIAStyle.class.getResource("/JpUserInterface/JpResource/JpImg/JpIABot.png");
    public static final URL jpURL_LOGO = JpIAStyle.class.getResource("/JpUserInterface/JpResource/JpImg/JpIALogo.png");
    public static final URL jpURL_SPLASH = JpIAStyle.class
            .getResource("/JpUserInterface/JpResource/JpImg/JpSplash.png");

    public static final CompoundBorder jpCreateBorderRect() {
        return BorderFactory.createCompoundBorder(new LineBorder(Color.lightGray), new EmptyBorder(5, 5, 5, 5));

    }

}
