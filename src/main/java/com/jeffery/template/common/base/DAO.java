package com.jeffery.template.common.base;

import java.util.List;
import java.util.Set;

public abstract class DAO<P extends AbstractQueryParam, D extends AbstractModel> {

	private Mapper<P, D> mapper;

	public Mapper<P, D> getMapper() {
		return mapper;
	}

	public D find(Long id) {
		return mapper.find(id);
	}

	public List<D> find(List<Long> idList) {
		return mapper.find(idList);
	}

	public PageList<D> query(P param) {
		PageList<D> pageList = new PageList<D>();
		pageList.setDataList(mapper.query(param));
		pageList.setParam(param);
		pageList.setTotalCount(mapper.count(param));
		return pageList;
	}

	public Integer count(P param) {
		return mapper.count(param);
	}

	public void create(D model) {
		mapper.create(model);
	}

	public void create(List<D> modelList) {
		mapper.create(modelList);
	}

	public void update(D model) {
		// TODO
	}

	public void update(D model, Set<String> changeSet) {
		// TODO
	}

	public void delete(Long id) {
		mapper.delete(id);
	}

	public void delete(List<Long> idList) {
		mapper.delete(idList);
	}

}
