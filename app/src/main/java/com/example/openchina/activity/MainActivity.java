package com.example.openchina.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.openchina.AppConfig;
import com.example.openchina.R;
import com.itheima.retrofitutils.Request;
import com.itheima.loopviewpager.LoopViewPager;
import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.listener.HttpResponseListener;

import org.itheima.recycler.L;
import org.itheima.recycler.adapter.BaseLoadMoreRecyclerAdapter;
import org.itheima.recycler.adapter.BaseRecyclerAdapter;
import org.itheima.recycler.viewholder.BaseRecyclerViewHolder;
import org.itheima.recycler.widget.ItheimaRecyclerView;
import org.itheima.recycler.widget.PullToLoadMoreRecyclerView;
import org.itheima.recycler.header.RecyclerViewHeader;

import java.util.ArrayList;
import java.util.List;

import com.example.openchina.Bean.ImgBean;
import com.example.openchina.Bean.NewsBean;
import butterknife.BindView;
import okhttp3.Headers;
import retrofit2.Call;


public class MainActivity extends AppCompatActivity {

    PullToLoadMoreRecyclerView pullToLoadMoreRecyclerView;
    ItheimaRecyclerView recyclerView;
    SwipeRefreshLayout swipeRefreshLayout;
    LoopViewPager loopViewPager;

    private int statu;
    private NewsBean mNewsBean;
    private String NextToken = "";
    private String PrevToken = "";

    private static final int STATUS_REFRESH = 1;
    private static final int STATUS_MORE = 2;
    List<NewsBean.ResultBean.ItemsBean> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
        initBanner();
        pullToLoadMoreRecyclerView = new PullToLoadMoreRecyclerView<NewsBean>(swipeRefreshLayout, recyclerView, MyRecyclerViewHolder.class) {
            @Override
            public int getItemResId() {
                //recylerview item资源id
                return R.layout.item_recylerview;
            }

            @Override
            public String getApi() {
                //接口
                String url = AppConfig.jouralismURL;
                switch (statu){
                    case STATUS_MORE:
                        NextToken = mNewsBean.result.nextPageToken;
                        url += MainActivity.this.NextToken;
                        break;
                    case STATUS_REFRESH:
                        NextToken = mNewsBean.result.nextPageToken;
                        url += MainActivity.this.NextToken;
                        break;
                }
                return url;
            }
            //是否加载更多的数据，根据业务逻辑自行判断，true表示有更多的数据，false表示没有更多的数据，如果不需要监听可以不重写该方法
            @Override
            public boolean isMoreData(BaseLoadMoreRecyclerAdapter.LoadMoreViewHolder holder) {
                System.out.println("isMoreData" + holder);
                statu = STATUS_MORE;
                return true;
            }
        };
        pullToLoadMoreRecyclerView.setLoadingDataListener(new PullToLoadMoreRecyclerView.LoadingDataListener<NewsBean>() {

            @Override
            public void onRefresh() {
                //监听下啦刷新，如果不需要监听可以不重新该方法
                L.i("setLoadingDataListener onRefresh");
                statu = STATUS_REFRESH;
            }

            @Override
            public void onStart() {
                //监听http请求开始，如果不需要监听可以不重新该方法
                L.i("setLoadingDataListener onStart");
            }

            @Override
            public void onSuccess(NewsBean newsBean ,Headers headers) {
                //监听http请求成功，如果不需要监听可以不重新该方法
                L.i("setLoadingDataListener onSuccess: " + newsBean);
                mNewsBean = newsBean;
                List<NewsBean.ResultBean.ItemsBean> listEntrys = newsBean.getItemDatas();
                for (NewsBean.ResultBean.ItemsBean item:listEntrys) {
                    list.add(item);
                }

            }

            @Override
            public void onFailure() {
                //监听http请求失败，如果不需要监听可以不重新该方法
                L.i("setLoadingDataListener onFailure");
            }
        });
        pullToLoadMoreRecyclerView.requestData();
    }


    public void InitView() {
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        RecyclerViewHeader header = (RecyclerViewHeader) findViewById(R.id.recycler_header);
        recyclerView = (ItheimaRecyclerView) findViewById(R.id.recycler_view);
        header.attachTo(recyclerView);
        loopViewPager = (LoopViewPager) findViewById(R.id.lvp_pager);
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
    List<String> imageLists = new ArrayList<>();
    List<String> textLists = new ArrayList<>();
    private void initBanner() {
        Request request = (Request) ItheimaHttp.newGetRequest(AppConfig.imgAndTextURL);//apiUrl格式："xxx/xxxxx"
        Call call = ItheimaHttp.send((com.itheima.retrofitutils.Request) request, new HttpResponseListener<ImgBean>() {

            @Override
            public void onResponse(ImgBean imgBean, Headers headers) {
                List<ImgBean.ResultBean.ItemsBean> itemsBeans =  imgBean.getItemDatas();

                for (int i = 0; i < itemsBeans.size(); i++) {

                    textLists.add(itemsBeans.get(i).name);
                    imageLists.add(itemsBeans.get(i).img);
                }
                loopViewPager.setImgData(imageLists);
                loopViewPager.setTitleData(textLists);
                loopViewPager.start();
            }
        });

    }


}