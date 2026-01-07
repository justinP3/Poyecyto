package DataAccess.DTO;

public class JpPersonaTipoDTO {

    private Integer idJpCatalogo;
    private Integer idJpCatalogoTipo;
    private String jpNombre;
    private String jpDescripcion;
    private String jpEstado;
    private String jpFechaCreacion;
    private String jpFechaModifica;

    // constructores
    public JpPersonaTipoDTO() {

    }

    public JpPersonaTipoDTO(Integer idJpCatalogo, Integer idJpCatalogoTipo, String nombre, String descripcion,
            String jpEstado,
            String jpFechaCreacion, String jpFechaModifica) {
        this.idJpCatalogo = idJpCatalogo;
        this.idJpCatalogoTipo = idJpCatalogoTipo;
        this.jpNombre = nombre;
        this.jpDescripcion = descripcion;
        this.jpEstado = jpEstado;
        this.jpFechaCreacion = jpFechaCreacion;
        this.jpFechaModifica = jpFechaModifica;
    }

    // get setter
    public Integer getIdJpCatalogo() {
        return idJpCatalogo;
    }

    public void setIdJpCatalogo(Integer idJpCatalogo) {
        this.idJpCatalogo = idJpCatalogo;
    }

    public Integer getIdJpCatalogoTipo() {
        return idJpCatalogoTipo;
    }

    public void setIdJpCatalogoTipo(Integer idJpCatalogoTipo) {
        this.idJpCatalogoTipo = idJpCatalogoTipo;
    }

    public String getJpNombre() {
        return jpNombre;
    }

    public void setJpNombre(String jpNombre) {
        this.jpNombre = jpNombre;
    }

    public String getJpDescripcion() {
        return jpDescripcion;
    }

    public void setJpDescripcion(String jpDescripcion) {
        this.jpDescripcion = jpDescripcion;
    }

    public String getJpEstado() {
        return jpEstado;
    }

    public void setJpEstado(String jpEstado) {
        this.jpEstado = jpEstado;
    }

    public String getJpFechaCreacion() {
        return jpFechaCreacion;
    }

    public void setJpFechaCreacion(String jpFechaCreacion) {
        this.jpFechaCreacion = jpFechaCreacion;
    }

    public String getJpFechaModifica() {
        return jpFechaModifica;
    }

    public void setJpFechaModifica(String jpFechaModifica) {
        this.jpFechaModifica = jpFechaModifica;
    }
    // funciones

    @Override
    public String toString() {
        return getClass().getName()
                + "\n idJpCatalogo:     " + getIdJpCatalogo()
                + "\n idJpCatalogoTipo: " + getIdJpCatalogoTipo()
                + "\n jpNombre;         " + getJpNombre()
                + "\n jpDescripcion;    " + getJpDescripcion()
                + "\n jpEstado;         " + getJpEstado()
                + "\n jpFechaCreacion;  " + getJpFechaCreacion()
                + "\n jpFechaModifica;  " + getJpFechaModifica();
    }

}
