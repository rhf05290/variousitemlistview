package com.runtai.variousitemlistview.bean;

import java.io.Serializable;


public class ShoppingCarBean implements Serializable {

	private String shopCartID;
	private String goodsId;
	private String goodsName;
	private String goodsStandard;
	private String goodsPrice;
	private String goodsKuCun;
	private int jian;
	private int jia;
	private String goodsNum;
	private String goodsPic;
	private String Bigpic;
	public String promotion_name;
	public int promotion_id;
	public boolean isCheck ;

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String flag;


	@Override
	public String toString() {
		return "ShoppingCarBean [shopCartID=" + shopCartID + ", goodsId="
				+ goodsId + ", goodsName=" + goodsName + ", goodsStandard="
				+ goodsStandard + ", goodsPrice=" + goodsPrice
				+ ", goodsKuCun=" + goodsKuCun + ", jian=" + jian + ", jia="
				+ jia + ", goodsNum=" + goodsNum + ", goodsPic=" + goodsPic
				+ ", Bigpic=" + Bigpic + ", promotion_name=" + promotion_name
				+ ", promotion_id=" + promotion_id + "]";
	}

	public int getPromotion_id() {
		return promotion_id;
	}

	public void setPromotion_id(int promotion_id) {
		this.promotion_id = promotion_id;
	}

	public String getGoodsKuCun() {
		return goodsKuCun;
	}

	public void setGoodsKuCun(String goodsKuCun) {
		this.goodsKuCun = goodsKuCun;
	}

	public String getShopCartID() {
		return shopCartID;
	}

	public void setShopCartID(String shopCartID) {
		this.shopCartID = shopCartID;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsStandard() {
		return goodsStandard;
	}

	public void setGoodsStandard(String goodsStandard) {
		this.goodsStandard = goodsStandard;
	}

	public String getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public int getJian() {
		return jian;
	}

	public void setJian(int jian) {
		this.jian = jian;
	}

	public int getJia() {
		return jia;
	}

	public void setJia(int jia) {
		this.jia = jia;
	}

	public String getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getGoodsPic() {
		return goodsPic;
	}

	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}

	public String getBigpic() {
		return Bigpic;
	}

	public String getPromotion_name() {
		return promotion_name;
	}

	public void setPromotion_name(String promotion_name) {
		this.promotion_name = promotion_name;
	}

	public void setBigpic(String bigpic) {
		Bigpic = bigpic;
	}

}
