package BussisnessLogic.Entities;

import java.util.List;

import DataAccess.DTO.JpPersonaTipoDAO;
import DataAccess.DTO.JpPersonaTipoDTO;

public class JpPersonaTipoBL {
    private JpPersonaTipoDTO jpPersonaTipo;
    private JpPersonaTipoDAO jptpDAO = new JpPersonaTipoDAO();

    public JpPersonaTipoBL() {

    }

    public List<JpPersonaTipoDTO> jpGetAll() throws Exception {
        return jptpDAO.jpReadAll();
    }

    public JpPersonaTipoDTO jpGetByIdSexo(int idSexo) throws Exception {
        jpPersonaTipo = jptpDAO.jpReadBy(idSexo);
        return jpPersonaTipo;

    }

    public boolean jpCreate(JpPersonaTipoDTO JpPersonaTipoDTO) throws Exception {
        return jptpDAO.jpCreate(JpPersonaTipoDTO);
    }

    public boolean jpUpdate(JpPersonaTipoDTO JpPersonaTipoDTO) throws Exception {
        return jptpDAO.jpUpdate(JpPersonaTipoDTO);

    }

    public boolean jpDelet(int JpPersonaTipoDTO) throws Exception {
        return jptpDAO.jpDelet(JpPersonaTipoDTO);

    }

    public Integer jpGetMaxRow() throws Exception {
        return jptpDAO.jpGetRowCount();
    }

}
