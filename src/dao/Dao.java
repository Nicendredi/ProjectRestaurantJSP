package dao;

import java.sql.SQLException;
import java.util.List;

public interface Dao<OBJ> {

	public OBJ findById(OBJ obj_id) throws ClassNotFoundException, SQLException;

	public List<OBJ> findAll() throws ClassNotFoundException, SQLException;

}