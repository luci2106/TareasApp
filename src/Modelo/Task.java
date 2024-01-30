package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Task extends ModeloBase{
    private String title;
    private  String Descripcion;
    private Date datatime;
    private Date deadtime;
    private boolean status;

    public Task() {
    }

    public Task(String title, String descripcion, Date datatime, Date deadtime, boolean status) {
        this.title = title;
        Descripcion = descripcion;
        this.datatime = datatime;
        this.deadtime = deadtime;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Date getDatatime() {
        return datatime;
    }

    public void setDatatime(Date datatime) {
        this.datatime = datatime;
    }

    public Date getDeadtime() {
        return deadtime;
    }

    public void setDeadtime(Date deadtime) {
        this.deadtime = deadtime;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                ", datatime=" + datatime +
                ", deadtime=" + deadtime +
                ", status=" + status +
                '}';
    }

    @Override
    protected String getNombreTabla() {
        return "task" ;
    }

    @Override
    protected Object createObjectFromResultSet(ResultSet resultSet) throws SQLException {
        return null;
    }
}
