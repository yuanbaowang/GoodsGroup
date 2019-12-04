
package impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ybw.bean.Goods;
import com.ybw.service.GoodsService;

import dao.GoodsMapper;

/**
 * @author 袁保旺
 *
 * 2019年12月3日 上午9:14:43 
 */
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper mapper;

	public List<Goods> list(Goods g) {
		return mapper.list(g);
	}

	@Override
	public int dels(String id) {
		return mapper.dels(id);
	}

	@Override
	public List<Goods> Blist() {
		return mapper.Blist();
	}

	@Override
	public List<Goods> Tlist() {
		return mapper.Tlist();
	}

	@Override
	public int add(Goods g) {
		return mapper.add(g);
	}

	@Override
	public Goods getGoodsByGid(int gid) {
		return mapper.getGoodsByGid(gid);
	}

	@Override
	public int upd(Goods g) {
		return mapper.upd(g);
	}
	
	
}
