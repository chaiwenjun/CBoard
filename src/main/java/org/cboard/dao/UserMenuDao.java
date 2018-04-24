package org.cboard.dao;

import org.springframework.stereotype.Repository;
import org.cboard.pojo.*;
import java.util.List;

/**
 * Created by chaiwenjun on 2018/3/27.
 */
@Repository
public interface UserMenuDao {

List<Long> getMenuIdByUserRole(String userId);

List<Long> getMenuIdByRoleAdmin(String userId);

List<DashboardUserMenu> getAllMenuList();

int deleteByPrimaryKey(Long menuId);

int insert(DashboardUserMenu record);

int insertSelective(DashboardUserMenu record);

    DashboardUserMenu selectByPrimaryKey(Long menuId);

}
