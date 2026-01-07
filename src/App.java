
import DataAccess.DTO.JpEstadoCivilDAO;
import DataAccess.DTO.JpEstadoCivilDTO;
import DataAccess.DTO.JpPersonaTipoDAO;
import DataAccess.DTO.JpPersonaTipoDTO;
import DataAccess.DTO.JpSexoDAO;
import DataAccess.DTO.JpSexoDTO;
import JpUserInterface.JpForm.JpFrmSplashScreen;

public class App {
    public static void main(String[] args) throws Exception {

        JpFrmSplashScreen.show();

        try {
            JpSexoDAO jpsDAO = new JpSexoDAO();
            for (JpSexoDTO s : jpsDAO.jpReadAll())
                System.out.println(s.toString() + "\n");
            System.out.println("---------------------------------");

            JpPersonaTipoDAO jptpDAO = new JpPersonaTipoDAO();
            for (JpPersonaTipoDTO tp : jptpDAO.jpReadAll())
                System.out.println(tp.toString() + "\n");
            System.out.println("---------------------------------");

            JpEstadoCivilDAO jpecDAO = new JpEstadoCivilDAO();
            for (JpEstadoCivilDTO ec : jpecDAO.jpReadAll())
                System.out.println(ec.toString() + "\n");
            System.out.println("---------------------------------");

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
