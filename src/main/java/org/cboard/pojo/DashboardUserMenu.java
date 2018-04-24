package org.cboard.pojo;

/**
 * Created by chaiwenjun on 2018/3/27.
 */
public class DashboardUserMenu {

    private long menuId;
    private long parentId;
    private String menuName;//menu_code
    private String menuCode;//menu_name_code菜单名称代码	对应语言文件代码

    private String menuDescription;
    private int orderNumber;   //菜单序号	用于菜单排序
    private String menuIcon;	//菜单图标	存储图标样式
    private String menuCategory;  //菜单分组
    private String layout_json; //菜单样式扩展字段

    public DashboardUserMenu() {
    }
    public DashboardUserMenu(long menuId, long parentId, String menuName, String menuCode) {
        this.menuId = menuId;
        this.parentId = parentId;
        this.menuName = menuName;
        this.menuCode = menuCode;
    }

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }
	public String getMenuDescription() {
		return menuDescription;
	}
	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getMenuIcon() {
		return menuIcon;
	}
	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}
	public String getMenuCategory() {
		return menuCategory;
	}
	public void setMenuCategory(String menuCategory) {
		this.menuCategory = menuCategory;
	}
	public String getLayout_json() {
		return layout_json;
	}
	public void setLayout_json(String layout_json) {
		this.layout_json = layout_json;
	}


}
