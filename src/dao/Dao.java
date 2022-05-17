package dao;

import java.util.List;

public interface Dao<OBJ> {

	public OBJ findById(OBJ obj_id);

	public List<OBJ> findAll();

}