package com.runtai.variousitemlistview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnScrollChangeListener;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.runtai.variousitemlistview.adapter.MyCyclerScrollAdapter;
import com.runtai.variousitemlistview.adapter.MyOrderAdapter;
import com.runtai.variousitemlistview.adapter.MyPresentAdapter;
import com.runtai.variousitemlistview.bean.ShoppingCarBean;
import com.runtai.variousitemlistview.view.CycleScrollView;
import com.runtai.variousitemlistview.view.HorizontalListView;
import com.runtai.variousitemlistview.view.MeasuredLinearLayoutManager;
import com.runtai.variousitemlistview.view.MyListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView lv_full_present;
    List<ShoppingCarBean> mDatas;
    List<ShoppingCarBean> checkList;//存放选中条目的集合
    List<ShoppingCarBean> commonGoods;
    List<ShoppingCarBean> fullCut;
    List<ShoppingCarBean> fullPresent;
    /**
     * 存赠品的数据
     */
    List<ShoppingCarBean> presentData;
    private Map<Integer, List<ShoppingCarBean>> mapdata;
    private RelativeLayout rl_other_title;
    private RelativeLayout rl_full_cut_title;
    private RelativeLayout rl_full_present_title;
    private LinearLayout ll_watch_present_title;
    private CycleScrollView mCycleScrollView;
    private RelativeLayout rl_present;
    private MyListView myListView;
    private RecyclerView mReyclerView;
    private String flag;
    private int size;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
        registerListener();
    }

    private void initData() {
        commonGoods = new ArrayList<>();
        fullCut = new ArrayList<>();
        fullPresent = new ArrayList<>();
        presentData = new ArrayList<>();
        mDatas = new ArrayList<>();
        mDatas.clear();
        presentData.clear();
        commonGoods.clear();
        fullCut.clear();
        fullPresent.clear();
        for (int i = 0; i < 4; i++) {

            ShoppingCarBean bean = new ShoppingCarBean();
            bean.setGoodsName("黑芝麻点心面黑芝麻点心面");
            bean.setGoodsNum(1 + "");
            bean.setGoodsPrice(10.0 + "");
            bean.setFlag("其它");
            commonGoods.add(bean);

        }

        for (int i = 0; i < 4; i++) {

            ShoppingCarBean bean = new ShoppingCarBean();
            bean.setGoodsName("开心芝麻糊");
            bean.setGoodsNum(1 + "");
            bean.setFlag("满减");
            bean.setGoodsPrice(10.0 + "");
            fullCut.add(bean);

        }

        for (int i = 0; i < 8; i++) {

            ShoppingCarBean bean = new ShoppingCarBean();
            bean.setGoodsName("新奥尔良鸡翅");
            bean.setGoodsNum(1 + "");
            bean.setGoodsPrice(80.0 + "");
            bean.setFlag("满赠");
            fullPresent.add(bean);

        }

        for (int i = 0; i < 12; i++) {
            ShoppingCarBean bean = new ShoppingCarBean();
            bean.setGoodsName("赠品" + i);
            bean.setGoodsNum(1 + "");
            bean.setGoodsPrice(0.00 + "");
            bean.setFlag("赠品");
            presentData.add(bean);

        }
//        item_present_count = presentData.size();
        mapdata = new HashMap<>();
        mapdata.clear();
        mapdata.put(0, fullPresent);
//        mapdata.put(1, presentData);
        mapdata.put(1, fullCut);
        mapdata.put(2, commonGoods);

        checkList = new ArrayList<>();
        checkList.clear();

        for (int i = 0; i < mapdata.size(); i++) {
            for (int j = 0; j < mapdata.get(i).size(); j++) {
                mDatas.add(mapdata.get(i).get(j));
            }
        }

    }

    private void initView() {

        lv_full_present = (ListView) findViewById(R.id.lv_full_present);
//        addHeader(R.layout.shoppingcar_sort_title);
//        ll_watch_present_title = (LinearLayout) findViewById(R.id.ll_watch_present_title);
//        rl_full_present_title = (RelativeLayout) findViewById(R.id.rl_full_present_title);
//        rl_full_cut_title = (RelativeLayout) findViewById(R.id.rl_full_cut_title);
//        rl_other_title = (RelativeLayout) findViewById(R.id.rl_other_title);
        flag = mDatas.get(0).getFlag();
        if ("满减".equals(flag)) {
            addHeader(R.layout.layout_full_cut_title);
            size = fullCut.size();
        } else if ("满赠".equals(flag)) {
            addHeader(R.layout.layout_full_present_title);
            size = fullPresent.size();
        } else if ("其它".equals(flag)) {
            addHeader(R.layout.layout_other_title);
            size = commonGoods.size();
        }

//        HorizontalListView mListView = (HorizontalListView) findViewById(R.id.mListView);
//        mListView.setAdapter(new MyPresentAdapter(this,presentData));
//        mCycleScrollView = (CycleScrollView<ShoppingCarBean>) findViewById(R.id.mCycleScrollView);
//        MyCyclerScrollAdapter scrollAdapter =
//                new MyCyclerScrollAdapter(presentData, mCycleScrollView, this);
//        rl_present = (RelativeLayout) findViewById(R.id.rl_present);
//        for (int i = 0; i < 10; i++) {
//            View present_item = LayoutInflater.from(this).inflate(R.layout.layout_shoppingcar_present_item, null);
//            TextView tv_present_name = (TextView) present_item.findViewById(R.id.tv_present_name);
//            rl_present.addView(present_item);
//        }
//        presentData.clear();
//        MyListView myListView =  (MyListView) findViewById(R.id.myListView);
//        myListView.setAdapter(new MyPresentAdapter(this,presentData));


        MyOrderAdapter adapter = new MyOrderAdapter(this, mDatas, size);
        lv_full_present.setAdapter(adapter);

    }

    private void registerListener() {

//        lv_full_present.setOnScrollListener(new AbsListView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(AbsListView view, int scrollState) {
//
//            }
//
//            @Override
//            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
//                int firstVisiblePosition = lv_full_present.getFirstVisiblePosition();
//                if (firstVisiblePosition == 0) {
//                    flag = mDatas.get(firstVisiblePosition).getFlag();
//
//                    if ("满减".equals(flag)) {
//                        addHeader(R.layout.layout_full_cut_title);
//                    } else if ("满赠".equals(flag)) {
//                        addHeader(R.layout.layout_full_present_title);
//                    } else if ("其它".equals(flag)) {
//                        addHeader(R.layout.layout_other_title);
//
//                    }
//                }
////                else if ("赠品".equals(flag)) {
////                    rl_full_cut_title.setVisibility(View.GONE);
////                    ll_watch_present_title.setVisibility(View.VISIBLE);
////                    rl_full_present_title.setVisibility(View.GONE);
////                    rl_other_title.setVisibility(View.GONE);
////                }
//
//            }
//        });

        lv_full_present.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "点击了" + position + "标记：" + mDatas.get(position).getFlag(), 
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addHeader(int resId) {
        LayoutInflater inflator = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout header1 = (LinearLayout) inflator.inflate(resId, null);
        lv_full_present.addHeaderView(header1);
    }
}
