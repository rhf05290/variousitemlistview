package com.runtai.variousitemlistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.runtai.variousitemlistview.R;
import com.runtai.variousitemlistview.bean.ShoppingCarBean;

import java.util.List;

/**
 * Created by Administrator on 2017/4/24.
 */
public class MyPresentAdapter extends BaseAdapter {


    private Context context;
    private List<ShoppingCarBean> mData;
    private LayoutInflater mInflater;

    public MyPresentAdapter(Context context, List<ShoppingCarBean> mData) {
        this.context = context;
        mInflater = LayoutInflater.from(context);
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        if (convertView == null) {

            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.layout_shoppingcar_present_item, null);
            holder.tv_present_name = (TextView) convertView.findViewById(R.id.tv_present_name);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv_present_name.setText(mData.get(position).getGoodsName());
        return convertView;
    }

    class ViewHolder {
        TextView tv_present_name;
    }
}
