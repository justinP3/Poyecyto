package BussisnessLogic.Entities;

import java.util.List;

import DataAccess.DTO.JpSexoDAO;
import DataAccess.DTO.JpSexoDTO;

public class JpSexoBL {
    private JpSexoDTO jpSexo;
    private JpSexoDAO jpsDao = new JpSexoDAO();

    public JpSexoBL() {

    }

    public List<JpSexoDTO> jpGetAll() throws Exception {
        List<JpSexoDTO> lst = jpsDao.jpReadAll();
        for (JpSexoDTO JpsexoDTO : lst)
            JpsexoDTO.setJpNombre(JpsexoDTO.getJpNombre().toUpperCase());
        return lst;
    }

    public JpSexoDTO jpGetByIdSexo(int idSexo) throws Exception {
        jpSexo = jpsDao.jpReadBy(idSexo);
        return jpSexo;

    }

    public boolean jpCreate(JpSexoDTO JpSexoDTO) throws Exception {
        return jpsDao.jpCreate(JpSexoDTO);
    }

    public boolean jpUpdate(JpSexoDTO JpSexoDTO) throws Exception {
        return jpsDao.jpUpdate(JpSexoDTO);

    }

    public boolean jpDelet(int JpSexoDTO) throws Exception {
        return jpsDao.jpDelet(JpSexoDTO);

    }

    public Integer jpGetMaxRow() throws Exception {
        return jpsDao.jpGetRowCount();
    }

}
