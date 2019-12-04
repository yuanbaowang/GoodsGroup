
package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ybw.bean.Goods;

/**
 * @author 袁保旺
 *
 * 2019年12月3日 上午9:13:46 
 */
public interface GoodsMapper {

	List<Goods> list(@Param("a")Goods g);

	@Delete("delete from goods where gid in(${id})")
	int dels(@Param("id")String id);

	@Select("select * from brand")
	List<Goods> Blist();

	@Select("select * from t_type")
	List<Goods> Tlist();

	@Insert("insert goods set bid = #{g.bid},tid = #{g.tid},price = #{g.price},status = 0,datea = now() ")
	int add(@Param("g")Goods g);

	@Select("select * from Goods where gid = #{gid}")
	Goods getGoodsByGid(@Param("gid")int gid);

	@Update("update goods set datea = #{g.datea},tid = #{g.tid},price = #{g.price},bid = #{g.bid} where gid = #{g.gid}")
	int upd(@Param("g")Goods g);

}
