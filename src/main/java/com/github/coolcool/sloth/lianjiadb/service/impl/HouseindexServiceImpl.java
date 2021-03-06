package com.github.coolcool.sloth.lianjiadb.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;
import com.github.coolcool.sloth.lianjiadb.mapper.HouseindexMapper;
import com.github.coolcool.sloth.lianjiadb.model.Houseindex;
import com.github.coolcool.sloth.lianjiadb.service.HouseindexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.coolcool.sloth.lianjiadb.common.Page;
import javax.annotation.Generated;


@Generated(
	value = {
		"https://github.com/coolcooldee/sloth",
		"Sloth version:1.0"
	},
	comments = "This class is generated by Sloth"
)
@Service
public  class HouseindexServiceImpl implements HouseindexService{

	Logger logger = LoggerFactory.getLogger(HouseindexService.class);

	@Autowired
	private HouseindexMapper houseindexMapper;

	public Integer save(Houseindex houseindex){
		return houseindexMapper.insert(houseindex);
	}

	@Override
	public Houseindex getById(Object id){
		return houseindexMapper.getByPrimaryKey(id);
	}

	@Override
	public Houseindex getByCode(String code) {
		return houseindexMapper.getByCode(code);
	}

	@Override
	public void deleteById(Object id){
		houseindexMapper.deleteByPrimaryKey(id);
	}
	@Override
	public void update(Houseindex houseindex){
		houseindexMapper.updateByPrimaryKey(houseindex);
	}

	@Override
	public Integer count(){
	    return houseindexMapper.count();
	}

	@Override
	public List<Houseindex> list(){
		return houseindexMapper.list();
	}

	@Override
	public Page<Houseindex> page(int pageNo, int pageSize) {
		Page<Houseindex> page = new Page<>();
        int start = (pageNo-1)*pageSize;
        page.setPageSize(pageSize);
        page.setStart(start);
        page.setResult(houseindexMapper.page(start,pageSize));
        page.setTotalCount(houseindexMapper.count());
        return page;
	}

	@Override
	public List<Houseindex> pageTodayUnCheck(int start, int step) {
		return houseindexMapper.pageTodayUnCheck(start,step);
	}

	@Override
	public void setTodayChecked(String code) {
		houseindexMapper.setTodayChecked(code);
	}

	@Override
	public Integer increment(){
		return houseindexMapper.increment();
	}
	
}