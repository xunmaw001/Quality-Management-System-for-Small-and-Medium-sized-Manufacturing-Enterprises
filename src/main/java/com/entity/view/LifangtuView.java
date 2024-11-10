package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.LifangtuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 输出立方图
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("lifangtu")
public class LifangtuView extends LifangtuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 立方图输出类型的值
	*/
	@ColumnInfo(comment="立方图输出类型的字典表值",type="varchar(200)")
	private String lifangtuValue;

	//级联表 工作人员
		/**
		* 工作人员编号
		*/

		@ColumnInfo(comment="工作人员编号",type="varchar(200)")
		private String gongzuorenyuanUuidNumber;
		/**
		* 工作人员姓名
		*/

		@ColumnInfo(comment="工作人员姓名",type="varchar(200)")
		private String gongzuorenyuanName;
		/**
		* 工作人员手机号
		*/

		@ColumnInfo(comment="工作人员手机号",type="varchar(200)")
		private String gongzuorenyuanPhone;
		/**
		* 工作人员身份证号
		*/

		@ColumnInfo(comment="工作人员身份证号",type="varchar(200)")
		private String gongzuorenyuanIdNumber;
		/**
		* 工作人员头像
		*/

		@ColumnInfo(comment="工作人员头像",type="varchar(200)")
		private String gongzuorenyuanPhoto;
		/**
		* 检验工种
		*/
		@ColumnInfo(comment="检验工种",type="int(11)")
		private Integer jianyangongzhongTypes;
			/**
			* 检验工种的值
			*/
			@ColumnInfo(comment="检验工种的字典表值",type="varchar(200)")
			private String jianyangongzhongValue;
		/**
		* 工作人员邮箱
		*/

		@ColumnInfo(comment="工作人员邮箱",type="varchar(200)")
		private String gongzuorenyuanEmail;
		/**
		* 账户状态
		*/
		@ColumnInfo(comment="账户状态",type="int(11)")
		private Integer jinyongTypes;
			/**
			* 账户状态的值
			*/
			@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
			private String jinyongValue;



	public LifangtuView() {

	}

	public LifangtuView(LifangtuEntity lifangtuEntity) {
		try {
			BeanUtils.copyProperties(this, lifangtuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 立方图输出类型的值
	*/
	public String getLifangtuValue() {
		return lifangtuValue;
	}
	/**
	* 设置： 立方图输出类型的值
	*/
	public void setLifangtuValue(String lifangtuValue) {
		this.lifangtuValue = lifangtuValue;
	}


	//级联表的get和set 工作人员

		/**
		* 获取： 工作人员编号
		*/
		public String getGongzuorenyuanUuidNumber() {
			return gongzuorenyuanUuidNumber;
		}
		/**
		* 设置： 工作人员编号
		*/
		public void setGongzuorenyuanUuidNumber(String gongzuorenyuanUuidNumber) {
			this.gongzuorenyuanUuidNumber = gongzuorenyuanUuidNumber;
		}

		/**
		* 获取： 工作人员姓名
		*/
		public String getGongzuorenyuanName() {
			return gongzuorenyuanName;
		}
		/**
		* 设置： 工作人员姓名
		*/
		public void setGongzuorenyuanName(String gongzuorenyuanName) {
			this.gongzuorenyuanName = gongzuorenyuanName;
		}

		/**
		* 获取： 工作人员手机号
		*/
		public String getGongzuorenyuanPhone() {
			return gongzuorenyuanPhone;
		}
		/**
		* 设置： 工作人员手机号
		*/
		public void setGongzuorenyuanPhone(String gongzuorenyuanPhone) {
			this.gongzuorenyuanPhone = gongzuorenyuanPhone;
		}

		/**
		* 获取： 工作人员身份证号
		*/
		public String getGongzuorenyuanIdNumber() {
			return gongzuorenyuanIdNumber;
		}
		/**
		* 设置： 工作人员身份证号
		*/
		public void setGongzuorenyuanIdNumber(String gongzuorenyuanIdNumber) {
			this.gongzuorenyuanIdNumber = gongzuorenyuanIdNumber;
		}

		/**
		* 获取： 工作人员头像
		*/
		public String getGongzuorenyuanPhoto() {
			return gongzuorenyuanPhoto;
		}
		/**
		* 设置： 工作人员头像
		*/
		public void setGongzuorenyuanPhoto(String gongzuorenyuanPhoto) {
			this.gongzuorenyuanPhoto = gongzuorenyuanPhoto;
		}
		/**
		* 获取： 检验工种
		*/
		public Integer getJianyangongzhongTypes() {
			return jianyangongzhongTypes;
		}
		/**
		* 设置： 检验工种
		*/
		public void setJianyangongzhongTypes(Integer jianyangongzhongTypes) {
			this.jianyangongzhongTypes = jianyangongzhongTypes;
		}


			/**
			* 获取： 检验工种的值
			*/
			public String getJianyangongzhongValue() {
				return jianyangongzhongValue;
			}
			/**
			* 设置： 检验工种的值
			*/
			public void setJianyangongzhongValue(String jianyangongzhongValue) {
				this.jianyangongzhongValue = jianyangongzhongValue;
			}

		/**
		* 获取： 工作人员邮箱
		*/
		public String getGongzuorenyuanEmail() {
			return gongzuorenyuanEmail;
		}
		/**
		* 设置： 工作人员邮箱
		*/
		public void setGongzuorenyuanEmail(String gongzuorenyuanEmail) {
			this.gongzuorenyuanEmail = gongzuorenyuanEmail;
		}
		/**
		* 获取： 账户状态
		*/
		public Integer getJinyongTypes() {
			return jinyongTypes;
		}
		/**
		* 设置： 账户状态
		*/
		public void setJinyongTypes(Integer jinyongTypes) {
			this.jinyongTypes = jinyongTypes;
		}


			/**
			* 获取： 账户状态的值
			*/
			public String getJinyongValue() {
				return jinyongValue;
			}
			/**
			* 设置： 账户状态的值
			*/
			public void setJinyongValue(String jinyongValue) {
				this.jinyongValue = jinyongValue;
			}


	@Override
	public String toString() {
		return "LifangtuView{" +
			", lifangtuValue=" + lifangtuValue +
			", gongzuorenyuanUuidNumber=" + gongzuorenyuanUuidNumber +
			", gongzuorenyuanName=" + gongzuorenyuanName +
			", gongzuorenyuanPhone=" + gongzuorenyuanPhone +
			", gongzuorenyuanIdNumber=" + gongzuorenyuanIdNumber +
			", gongzuorenyuanPhoto=" + gongzuorenyuanPhoto +
			", gongzuorenyuanEmail=" + gongzuorenyuanEmail +
			"} " + super.toString();
	}
}
