package com.example.openchina.activity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.openchina.AppConfig;
import com.example.openchina.Bean.BlogBean;
import com.example.openchina.Bean.NewsBean;
import com.example.openchina.R;

import org.itheima.recycler.adapter.BaseLoadMoreRecyclerAdapter;
import org.itheima.recycler.header.RecyclerViewHeader;
import org.itheima.recycler.viewholder.BaseRecyclerViewHolder;
import org.itheima.recycler.widget.ItheimaRecyclerView;
import org.itheima.recycler.widget.PullToLoadMoreRecyclerView;

import butterknife.BindView;

public class BlogActivity extends AppCompatActivity {

    PullToLoadMoreRecyclerView pullToLoadMoreRecyclerView2;
    private ItheimaRecyclerView recyclerView;
    private SwipeRefreshLayout swipeRefreshLayout;
    private RadioGroup radioGroup;
    String url = AppConfig.newsURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        InitView();
        InitData();
    }

    public void InitView() {
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        RecyclerViewHeader header = (RecyclerViewHeader) findViewById(R.id.recycler_header);
        recyclerView = (ItheimaRecyclerView) findViewById(R.id.recycler_view);
        header.attachTo(recyclerView);
        radioGroup = (RadioGroup) findViewById(R.id.rg_blog_head_layout);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.news:
                        url = AppConfig.newsURL;
                        break;
                    case R.id.hot:
                        url = AppConfig.hotURL;
                        break;
                    case R.id.blog:
                        url = AppConfig.blogURL;
                        break;
                }
                InitData();
            }
        });
    }

    public void InitData(){
        pullToLoadMoreRecyclerView2 = new PullToLoadMoreRecyclerView<BlogBean>(swipeRefreshLayout, recyclerView, BlogRecyclerViewHolder.class) {
            @Override
            public int getItemResId() {
                //recylerview item??????id
                return R.layout.items_blogview;
            }

            @Override
            public String getApi() {
                //??????
                return url;
            }

            //???????????????????????????????????????????????????????????????true???????????????????????????false???????????????????????????????????????????????????????????????????????????
            @Override
            public boolean isMoreData(BaseLoadMoreRecyclerAdapter.LoadMoreViewHolder holder) {
                System.out.println("isMoreData" + holder);
                return true;
            }
        };
        pullToLoadMoreRecyclerView2.requestData();
    }
    public static class BlogRecyclerViewHolder extends BaseRecyclerViewHolder<BlogBean.ResultBean.ItemsBean> {

        @BindView(R.id.tv_map)
        TextView tvMap;
        @BindView(R.id.tv_show)
        TextView tvShow;
        @BindView(R.id.tv_time2)
        TextView tvTime2;
        @BindView(R.id.tv_commentcount2)
        TextView tvCommentcount2;


        public BlogRecyclerViewHolder(ViewGroup parentView, int itemResId) {
            super(parentView, itemResId);

        }

        /**
         * ???????????????????????????mData???????????????mData?????????????????????
         */
        @Override
        public void onBindRealData() {
            tvMap.setText(mData.title);
            tvShow.setText(mData.body);
            tvTime2.setText(mData.pubDate);
            tvCommentcount2.setText(String.valueOf(mData.commentCount));

        }

    }
}