package tk_mybatis_mapper;

import com.example.spirngsecurityoauth2server.domain.TbUserExample;
import java.util.List;

import com.example.spirngsecurityoauth2server.entity.TbUser;
import org.apache.ibatis.annotations.Param;

public interface TbUserDao {
    long countByExample(TbUserExample example);

    int deleteByExample(TbUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    List<TbUser> selectByExample(TbUserExample example);

    TbUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}