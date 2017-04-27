package com.runtai.variousitemlistview.adapter;

import android.content.Context;
import android.view.View;

import com.runtai.variousitemlistview.R;
import com.runtai.variousitemlistview.bean.ShoppingCarBean;
import com.runtai.variousitemlistview.view.CycleScrollView;

import java.util.List;

/**
 * Created by Administrator on 2017/4/24.
 */
public class MyCyclerScrollAdapter extends CycleScrollAdapter<ShoppingCarBean> {

    public MyCyclerScrollAdapter(List<ShoppingCarBean> list,
                                 CycleScrollView<ShoppingCarBean> cycleScrollView, Context context) {
        super(list, cycleScrollView, context);
    }

    @Override
    protected void initView(List<ShoppingCarBean> list) {
        super.initView(list);
    }

    @Override
    public void bindView(View child, ShoppingCarBean pi) {
//        ImageView image = (ImageView) child.findViewById(R.id.item_image);
//        TextView text = (TextView) child.findViewById(R.id.item_text);
//        image.setImageDrawable(pi.applicationInfo.loadIcon(mContext
//                .getPackageManager()));
//        text.setText(pi.applicationInfo.loadLabel(mContext.getPackageManager()));
    }

    @Override
    public View getView(ShoppingCarBean pi) {
        View view = View.inflate(mContext, R.layout.layout_shoppingcar_present_item, null);
//        // inflate APP icon view  
//        ImageView image = (ImageView) view.findViewById(R.id.item_image);
//        // inflate APP name view  
//        TextView text = (TextView) view.findViewById(R.id.item_text);
//        image.setImageDrawable(pi.applicationInfo.loadIcon(mContext
//                .getPackageManager()));
//        text.setText(pi.applicationInfo.loadLabel(mContext.getPackageManager()));
        return view;
    }
}
