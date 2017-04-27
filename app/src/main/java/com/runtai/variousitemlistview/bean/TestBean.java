package com.runtai.variousitemlistview.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
public class TestBean {


    /**
     * Data : {"models":[{"cost":0,"id":14356,"minpic":"http://o2o.xiangbianli.com/Res/product/small_530305.jpg",
     * "name":"可口可乐 500ml","num":4,"pid":5015,"price":3,"promotion_id":0,"promotion_name":"",
     * "sid":200,"spec":"500ml/瓶","stock":129},
     * {"cost":0,"id":14357,"minpic":"http://o2o.xiangbianli.com/Res/product/small_294602.jpg",
     * "name":"银鹭桂园莲子八宝粥 360g","num":3,"pid":5016,"price":4,
     * "promotion_id":0,"promotion_name":"","sid":200,"spec":"360g/罐","stock":40},
     * {"cost":0,"id":14355,"minpic":"http://o2o.xiangbianli.com/Res/product/small_338507.jpg",
     * "name":"养乐多100ml*5","num":2,"pid":4800,"price":12,"promotion_id":0,"promotion_name":"",
     * "sid":200,"spec":"100ml*5","stock":10},
     * {"cost":0,"id":14354,"minpic":"http://o2o.xiangbianli.com/Res/product/small_204285.jpg",
     * "name":"徐福记沙琪玛经典鸡蛋味 311g","num":2,"pid":4799,"price":11,
     * "promotion_id":0,"promotion_name":"","sid":200,"spec":"311g/袋","stock":10},
     * {"cost":0,"id":14353,"minpic":"http://o2o.xiangbianli.com/Res/product/small_128154.jpg",
     * "name":"徐福记米果卷奶油玉米味90g","num":1,"pid":5223,"price":6,"promotion_id":0,"promotion_name":"",
     * "sid":200,"spec":"90g/袋","stock":9},{"cost":0,"id":14326,
     * "minpic":"http://o2o.xiangbianli.com/Res/product/small_335514.jpg",
     * "name":"双鹿一号电池","num":2,"pid":5677,"price":2.5,"promotion_id":0,"promotion_name":"",
     * "sid":200,"spec":"1块","stock":18}],"totalnum":14,"totalprice":81}
     * IsError : false
     * Message : 读取成功！
     * NotLigerUIFriendlySerialize : false
     */

    private DataBean Data;
    private boolean IsError;
    private String Message;
    private boolean NotLigerUIFriendlySerialize;

    public DataBean getData() {
        return Data;
    }

    public void setData(DataBean Data) {
        this.Data = Data;
    }

    public boolean isIsError() {
        return IsError;
    }

    public void setIsError(boolean IsError) {
        this.IsError = IsError;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public boolean isNotLigerUIFriendlySerialize() {
        return NotLigerUIFriendlySerialize;
    }

    public void setNotLigerUIFriendlySerialize(boolean NotLigerUIFriendlySerialize) {
        this.NotLigerUIFriendlySerialize = NotLigerUIFriendlySerialize;
    }

    public static class DataBean {
        /**
         * models : [{"cost":0,"id":14356,"minpic":"http://o2o.xiangbianli.com/Res/product/small_530305.jpg","name":"可口可乐 500ml","num":4,"pid":5015,"price":3,"promotion_id":0,"promotion_name":"","sid":200,"spec":"500ml/瓶","stock":129},{"cost":0,"id":14357,"minpic":"http://o2o.xiangbianli.com/Res/product/small_294602.jpg","name":"银鹭桂园莲子八宝粥 360g","num":3,"pid":5016,"price":4,"promotion_id":0,"promotion_name":"","sid":200,"spec":"360g/罐","stock":40},{"cost":0,"id":14355,"minpic":"http://o2o.xiangbianli.com/Res/product/small_338507.jpg","name":"养乐多100ml*5","num":2,"pid":4800,"price":12,"promotion_id":0,"promotion_name":"","sid":200,"spec":"100ml*5","stock":10},{"cost":0,"id":14354,"minpic":"http://o2o.xiangbianli.com/Res/product/small_204285.jpg","name":"徐福记沙琪玛经典鸡蛋味 311g","num":2,"pid":4799,"price":11,"promotion_id":0,"promotion_name":"","sid":200,"spec":"311g/袋","stock":10},{"cost":0,"id":14353,"minpic":"http://o2o.xiangbianli.com/Res/product/small_128154.jpg","name":"徐福记米果卷奶油玉米味90g","num":1,"pid":5223,"price":6,"promotion_id":0,"promotion_name":"","sid":200,"spec":"90g/袋","stock":9},{"cost":0,"id":14326,"minpic":"http://o2o.xiangbianli.com/Res/product/small_335514.jpg","name":"双鹿一号电池","num":2,"pid":5677,"price":2.5,"promotion_id":0,"promotion_name":"","sid":200,"spec":"1块","stock":18}]
         * totalnum : 14
         * totalprice : 81.0
         */

        private int totalnum;
        private double totalprice;
        private List<ModelsBean> models;

        public int getTotalnum() {
            return totalnum;
        }

        public void setTotalnum(int totalnum) {
            this.totalnum = totalnum;
        }

        public double getTotalprice() {
            return totalprice;
        }

        public void setTotalprice(double totalprice) {
            this.totalprice = totalprice;
        }

        public List<ModelsBean> getModels() {
            return models;
        }

        public void setModels(List<ModelsBean> models) {
            this.models = models;
        }

        public static class ModelsBean {
            /**
             * cost : 0.0
             * id : 14356
             * minpic : http://o2o.xiangbianli.com/Res/product/small_530305.jpg
             * name : 可口可乐 500ml
             * num : 4
             * pid : 5015
             * price : 3.0
             * promotion_id : 0
             * promotion_name : 
             * sid : 200
             * spec : 500ml/瓶
             * stock : 129
             */

            private double cost;
            private int id;
            private String minpic;
            private String name;
            private int num;
            private int pid;
            private double price;
            private int promotion_id;
            private String promotion_name;
            private int sid;
            private String spec;
            private int stock;

            public double getCost() {
                return cost;
            }

            public void setCost(double cost) {
                this.cost = cost;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMinpic() {
                return minpic;
            }

            public void setMinpic(String minpic) {
                this.minpic = minpic;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public int getPromotion_id() {
                return promotion_id;
            }

            public void setPromotion_id(int promotion_id) {
                this.promotion_id = promotion_id;
            }

            public String getPromotion_name() {
                return promotion_name;
            }

            public void setPromotion_name(String promotion_name) {
                this.promotion_name = promotion_name;
            }

            public int getSid() {
                return sid;
            }

            public void setSid(int sid) {
                this.sid = sid;
            }

            public String getSpec() {
                return spec;
            }

            public void setSpec(String spec) {
                this.spec = spec;
            }

            public int getStock() {
                return stock;
            }

            public void setStock(int stock) {
                this.stock = stock;
            }
        }
    }
}
