package DataAccess.DTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class JpPersonaTipoDAO extends JPSQLiteDataHelper implements IJpDAO<JpPersonaTipoDTO> {

    @Override
    public boolean jpCreate(JpPersonaTipoDTO entity) throws Exception {
        String query = "INSER INTO JpCatalogo (IdJpCatalogoTipo, Nombre, Descripcion) Values (?,?,?)";
        try {
            Connection conn = jpOpenConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, 1);
            pstmt.setString(2, entity.getJpNombre());
            pstmt.setString(3, entity.getJpDescripcion());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<JpPersonaTipoDTO> jpReadAll() throws Exception {
        List<JpPersonaTipoDTO> lst = new ArrayList<>();
        String query = " SELECT IdJpCatalogo "
                + " ,IdJpCatalogoTipo "
                + " ,Nombre           "
                + " ,Descripcion      "
                + " ,Estado           "
                + " ,FechaCreacion    "
                + " ,FechaModifica    "
                + " FROM  JpCatalogo  "
                + " WHERE Estado = 'A'"
                + " AND IdJpCatalogoTipo = 1";
        try {
            Connection conn = jpOpenConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                JpPersonaTipoDTO s = new JpPersonaTipoDTO(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));
                lst.add(s);
            }

        } catch (SQLException e) {
            throw e;
        }

        return lst;
    }

    @Override
    public boolean jpUpdate(JpPersonaTipoDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String query = "UPDATE JpCatalogo SET Nombre = ?, Descripcion = ?, FechaModifica = ? WHERE IdJpCatalogo = ?";
        try {
            Connection conn = jpOpenConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getJpNombre());
            pstmt.setString(2, entity.getJpDescripcion());
            pstmt.setString(3, dtf.format(now).toString());
            pstmt.setInt(4, entity.getIdJpCatalogo());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean jpDelet(int id) throws Exception {
        String query = " UPDATE JpCatalogo SET Estado = ? WHERE IdJpCatalogo = ?";
        try {
            Connection conn = jpOpenConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "X");
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public JpPersonaTipoDTO jpReadBy(Integer id) throws Exception {

        JpPersonaTipoDTO s = new JpPersonaTipoDTO();
        String query = " SELECT IdJpCatalogo "
                + " ,IdJpCatalogoTipo "
                + " ,Nombre           "
                + " ,Descripcion      "
                + " ,Estado           "
                + " ,FechaCreacion    "
                + " ,FechaModifica    "
                + " FROM  JpCatalogo  "
                + " WHERE Estado = 'A' "
                + " AND IdJpCatalogoTipo = 1 "
                + " AND IdJpCatalogo = " + id.toString();
        try {
            Connection conn = jpOpenConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                s = new JpPersonaTipoDTO(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));
            }

        } catch (SQLException e) {
            throw e;
        }

        return s;
    }

    public Integer jpGetRowCount() throws Exception {
        String query = " SELECT COUNT (*) TotalReg "
                + " FROM  JpCatalogo           "
                + " AND   IdJpCatalogoTipo = 1 "
                + " WHERE Estado = 'A'         ";
        try {
            Connection conn = jpOpenConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        }
        return 0;
    }

}
