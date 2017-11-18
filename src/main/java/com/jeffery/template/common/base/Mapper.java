package com.jeffery.template.common.base;

import java.util.List;
import java.util.Set;

/**
 * @author JEFFERY YEW
 * @since 17 NOV 2017
 */
public interface Mapper<P extends AbstractQueryParam, D extends AbstractModel> {

	/**
	 * Find the record by id.
	 * 
	 * @param id
	 * @return
	 */
	D find(Long id);

	/**
	 * Find the records by idList.
	 * 
	 * @param idList
	 * @return
	 */
	List<D> find(List<Long> idList);

	/**
	 * Query the records by the given @param.
	 * 
	 * @param param
	 * @return
	 */
	List<D> query(P param);

	/**
	 * Count the records by the given @param.
	 * 
	 * @param param
	 * @return
	 */
	Integer count(P param);

	/**
	 * Update the record with the given model.
	 * 
	 * @param model
	 */
	void update(D model);

	/**
	 * Update the record with the given model and changeSet.
	 * 
	 * @param model
	 * @param changeSet
	 */
	void update(D model, Set<String> changeSet);

	/**
	 * Create a record according to the given model.
	 * 
	 * @param model
	 */
	void create(D model);

	/**
	 * Create records according to the given modelList.
	 * 
	 * @param modelList
	 */
	void create(List<D> modelList);

	/**
	 * Delete the record by id.
	 * 
	 * @param id
	 */
	void delete(Long id);

	/**
	 * Delete the records by idList.
	 * 
	 * @param idList
	 */
	void delete(List<Long> idList);

}
