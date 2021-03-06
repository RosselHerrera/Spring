package com.indizen.cursoSpring.servicio.persistence.usergroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.indizen.cursoSpring.servicio.model.usergroup.UserGroup;
import com.indizen.cursoSpring.servicio.model.usergroup.UserGroupExample;
import com.indizen.cursoSpring.servicio.persistence.PaginationContext;

@Repository("userGroupDAO")
public class UserGroupDAOImpl extends SqlMapClientDaoSupport implements UserGroupDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_group
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    @Autowired
public UserGroupDAOImpl(SqlMapClient sqlMapClient) {
        setSqlMapClient(sqlMapClient);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_group
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public int countByExample(UserGroupExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("t_user_group.countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_group
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public int deleteByExample(UserGroupExample example) {
        int rows = getSqlMapClientTemplate().delete("t_user_group.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_group
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public int deleteByPrimaryKey(Integer id) {
        UserGroup _key = new UserGroup();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("t_user_group.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_group
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public Integer insert(UserGroup record) {
        Object newKey = getSqlMapClientTemplate().insert("t_user_group.insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_group
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public Integer insertSelective(UserGroup record) {
        Object newKey = getSqlMapClientTemplate().insert("t_user_group.insertSelective", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_group
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public List selectByExample(UserGroupExample example) {
        List list = getSqlMapClientTemplate().queryForList("t_user_group.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_group
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public UserGroup selectByPrimaryKey(Integer id) {
        UserGroup _key = new UserGroup();
        _key.setId(id);
        UserGroup record = (UserGroup) getSqlMapClientTemplate().queryForObject("t_user_group.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_group
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public int updateByExampleSelective(UserGroup record, UserGroupExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_user_group.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_group
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public int updateByExample(UserGroup record, UserGroupExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_user_group.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_group
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public int updateByPrimaryKeySelective(UserGroup record) {
        int rows = getSqlMapClientTemplate().update("t_user_group.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_group
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public int updateByPrimaryKey(UserGroup record) {
        int rows = getSqlMapClientTemplate().update("t_user_group.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_user_group
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    protected static class UpdateByExampleParms extends UserGroupExample {
        private Object record;

        public UpdateByExampleParms(Object record, UserGroupExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
	/**
    * Selecciona un conjunto de resultados basados en un ejemplo y 
    * los pagina.
    * @param example Objeto de ejemplo para la query
    * @param paginationContext Objeto utilizado para controlar la paginación
    * @return lista de elementos pertenecientes a la página correspondiente
    */
    public List<UserGroup> selectByExamplePaginated(UserGroupExample example, PaginationContext paginationContext) {
    	assert paginationContext.getSkipResults() >= 0;
		assert paginationContext.getMaxResults() >= 0;
		
		final List<UserGroup> result = new ArrayList<UserGroup>();
		
		//Obtiene y actualiza el número total de resultados del ejemplo
		paginationContext.updateTotalCount((Integer) countByExample(example));
	
		//iBatis hace la paginación física de los resultados usando un cursos
		//si está disponible la función ResultSet.absolute(position);
		final List<UserGroup> queryForList = getSqlMapClientTemplate().queryForList("t_user_group.selectByExample", 
				example,paginationContext.getSkipResults(),
				paginationContext.getMaxResults());	
		result.addAll(queryForList);
		return Collections.unmodifiableList(result);     
    }	
	
	/**
	 * 
	 * Borra todos los datos de la tabla
	 * 
	 */
	public void deleteAllData(){
		getSqlMapClientTemplate().delete("t_user_group.trucate_table");
	}
   
}
