package BussisnessLogic.Entities;

import java.util.List;

import DataAccess.DTO.JpEstadoCivilDAO;
import DataAccess.DTO.JpEstadoCivilDTO;

public class JpEstadoCivilBL {
    private JpEstadoCivilDTO jpEstadoCivil;
    private JpEstadoCivilDAO jpceDAO = new JpEstadoCivilDAO();

    public JpEstadoCivilBL() {

    }

    public List<JpEstadoCivilDTO> jpGetAll() throws Exception {
        return jpceDAO.jpReadAll();
    }

    public JpEstadoCivilDTO jpGetByIdSexo(int idSexo) throws Exception {
        jpEstadoCivil = jpceDAO.jpReadBy(idSexo);
        return jpEstadoCivil;

    }

    public boolean jpCreate(JpEstadoCivilDTO JpEstadoCivilDTO) throws Exception {
        return jpceDAO.jpCreate(JpEstadoCivilDTO);
    }

    public boolean jpUpdate(JpEstadoCivilDTO JpEstadoCivilDTO) throws Exception {
        return jpceDAO.jpUpdate(JpEstadoCivilDTO);

    }

    public boolean jpDelet(int JpEstadoCivilDTO) throws Exception {
        return jpceDAO.jpDelet(JpEstadoCivilDTO);

    }

    public Integer jpGetMaxRow() throws Exception {
        return jpceDAO.jpGetRowCount();
    }

}
