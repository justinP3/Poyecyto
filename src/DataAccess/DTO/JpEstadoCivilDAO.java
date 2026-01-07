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

public class JpEstadoCivilDAO extends JPSQLiteDataHelper implements IJpDAO<JpEstadoCivilDTO> {

    @Override
    public boolean jpCreate(JpEstadoCivilDTO entity) throws Exception {
        String query = "INSER INTO JpCatalogo (IdJpCatalogoTipo, Nombre, Descripcion) Values (?,?,?)";
        try {
            Connection conn = jpOpenConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, 3);
            pstmt.setString(2, entity.getJpNombre());
            pstmt.setString(3, entity.getJpDescripcion());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<JpEstadoCivilDTO> jpReadAll() throws Exception {
        List<JpEstadoCivilDTO> lst = new ArrayList<>();
        String query = " SELECT IdJpCatalogo "
                + " ,IdJpCatalogoTipo "
                + " ,Nombre           "
                + " ,Descripcion      "
                + " ,Estado           "
                + " ,FechaCreacion    "
                + " ,FechaModifica    "
                + " FROM  JpCatalogo  "
                + " WHERE Estado = 'A'"
                + " AND IdJpCatalogoTipo = 3";
        try {
            Connection conn = jpOpenConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                JpEstadoCivilDTO s = new JpEstadoCivilDTO(rs.getInt(1),
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
    public boolean jpUpdate(JpEstadoCivilDTO entity) throws Exception {
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
    public JpEstadoCivilDTO jpReadBy(Integer id) throws Exception {

        JpEstadoCivilDTO s = new JpEstadoCivilDTO();
        String query = " SELECT IdJpCatalogo "
                + " ,IdJpCatalogoTipo "
                + " ,Nombre           "
                + " ,Descripcion      "
                + " ,Estado           "
                + " ,FechaCreacion    "
                + " ,FechaModifica    "
                + " FROM  JpCatalogo  "
                + " WHERE Estado = 'A' "
                + " AND IdJpCatalogoTipo = 3 "
                + " AND IdJpCatalogo = " + id.toString();
        try {
            Connection conn = jpOpenConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                s = new JpEstadoCivilDTO(rs.getInt(1),
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
                + " AND   IdJpCatalogoTipo = 3 "
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
