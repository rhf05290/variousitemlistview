package com.runtai.variousitemlistview.adapter;

import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.runtai.variousitemlistview.R;
import com.runtai.variousitemlistview.bean.ShoppingCarBean;
import com.runtai.variousitemlistview.view.HorizontalListView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Administrator on 2017/4/24.
 */
public class MyOrderAdapter extends BaseAdapter {

    private Context context;
    private int size;
    private List<ShoppingCarBean> mData;
    private final LayoutInflater mInflater;
    private List<ShoppingCarBean> presentData;
    private boolean isClick = false;

    public MyOrderAdapter(Context context, List<ShoppingCarBean> mData, int size) {

        this.context = context;
        this.size = size;
        mInflater = LayoutInflater.from(context);
        this.mData = mData;
        initData();
    }

    private void initData() {
        presentData = new ArrayList<>();
        presentData.clear();
        for (int i = 0; i < 12; i++) {
            ShoppingCarBean bean = new ShoppingCarBean();
            bean.setGoodsName("赠品" + i);
            bean.setGoodsNum(1 + "");
            bean.setGoodsPrice(0.00 + "");
            bean.setFlag("赠品");
            presentData.add(bean);

        }
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder holder = null;

        if (convertView == null) {

            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.activity_chaoshi_item, null);
            holder.item_goodsName = (TextView) convertView.findViewById(R.id.item_goodsName);
            holder.ll_watch_present_title = (LinearLayout) convertView.findViewById(R.id.ll_watch_present_title);
            holder.rl_full_cut_title = (RelativeLayout) convertView.findViewById(R.id.rl_full_cut_title);
            holder.rl_full_present_title = (RelativeLayout) convertView.findViewById(R.id.rl_full_present_title);
            holder.rl_other_title = (RelativeLayout) convertView.findViewById(R.id.rl_other_title);
            holder.mListView = (HorizontalListView) convertView.findViewById(R.id.mListView);
            holder.tv_retract = (TextView) convertView.findViewById(R.id.tv_retract);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.item_goodsName.setText(mData.get(position).getGoodsName());

        if (position == size - 1) {
            holder.ll_watch_present_title.setVisibility(View.VISIBLE);
            holder.mListView.setAdapter(new MyPresentAdapter(context, presentData));

            holder.tv_retract.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (!isClick) {
                        isClick = true;
                    } else {
                        isClick = false;
                    }

                }
            });

            if (isClick) {
                holder.tv_retract.setText("收起");
            } else {
                holder.tv_retract.setText("查看赠品");
            }
        } else {
            holder.ll_watch_present_title.setVisibility(View.GONE);
        }


        return convertView;
    }

    class ViewHolder {
        TextView item_goodsName, tv_retract;
        RelativeLayout rl_full_cut_title, rl_full_present_title, rl_other_title;
        LinearLayout ll_watch_present_title;
        HorizontalListView mListView;
    }

    public OnDataChangeListener dataChangeListener;

    public void setOnPresentDataChangeListener(OnDataChangeListener dataChangeListener) {

        this.dataChangeListener = dataChangeListener;
    }

    public interface OnDataChangeListener {

        void refreshAdapter();
    }

}
