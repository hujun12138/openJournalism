package com.example.openchina;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import org.itheima.recycler.viewholder.BaseRecyclerViewHolder;
import org.itheima.recycler.widget.ItheimaRecyclerView;
import org.itheima.recycler.widget.PullToLoadMoreRecyclerView;

import butterknife.BindView;


public class MainActivity extends AppCompatActivity {

    PullToLoadMoreRecyclerView pullToLoadMoreRecyclerView;
    ItheimaRecyclerView recyclerView;
    SwipeRefreshLayout swipeRefreshLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
        pullToLoadMoreRecyclerView = new PullToLoadMoreRecyclerView<NewsBean>(swipeRefreshLayout, recyclerView, MyRecyclerViewHolder.class) {
            @Override
            public int getItemResId() {
                //recylerview item资源id
                return R.layout.item_recylerview;
            }

            @Override
            public String getApi() {
                //接口
                return "action/apiv2/news?pageToken=";
            }

        };
        pullToLoadMoreRecyclerView.requestData();
    }

    public void InitView() {
        recyclerView = (ItheimaRecyclerView) findViewById(R.id.recycler_view);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);

    }

    public static class MyRecyclerViewHolder extends BaseRecyclerViewHolder<NewsBean.ResultBean.ItemsBean> {

        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_content)
        TextView tvContent;
        @BindView(R.id.tv_time)
        TextView tvTime;
        @BindView(R.id.tv_commentcount)
        TextView tvCommentcount;


        public MyRecyclerViewHolder(ViewGroup parentView, int itemResId) {
            super(parentView, itemResId);

        }

        /**
         * 绑定数据的方法，在mData获取数据（mData声明在基类中）
         */
        @Override
        public void onBindRealData() {
            tvTitle.setText(mData.title);
            Log.d("标题为：", mData.title);
            tvContent.setText(mData.body);
            tvTime.setText(mData.pubDate);
            tvCommentcount.setText(String.valueOf(mData.commentCount));
            Log.d("标题为：", String.valueOf(mData.commentCount));
        }

    }

}