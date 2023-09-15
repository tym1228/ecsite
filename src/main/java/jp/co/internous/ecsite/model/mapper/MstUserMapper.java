package jp.co.internous.ecsite.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.ecsite.model.domain.MstUser;
import jp.co.internous.ecsite.model.form.LoginForm;

@Mapper
public interface MstUserMapper {
    
    @Select("SELECT * FROM mst_user WHERE user_name = #{form.userName} and password = #{form.password}") 
    MstUser findByUserNameAndPassword(@Param("form") LoginForm form);

    @Select("SELECT count(id) FROM mst_user WHERE user_name = #{userName}") 
    int findCountByUserName(String userName);
}
