package com.example.openchina.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.openchina.AppConfig;
import com.example.openchina.Bean.DetailBean;
import com.example.openchina.R;
import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.Request;
import com.itheima.retrofitutils.listener.HttpResponseListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Headers;
import retrofit2.Call;


public class DetailActivity extends AppCompatActivity {


    @BindView(R.id.tv_title3)
    TextView tvTitle3;
    @BindView(R.id.tv_timer)
    TextView tvTimer;
    @BindView(R.id.wv_new_detail_web)
    WebView wvNewDetailWeb;
    @BindView(R.id.tv_software)
    TextView tvSoftware;
    @BindView(R.id.lv_software)
    LinearLayout lvSoftware;
    @BindView(R.id.tv_recommend)
    TextView tvRecommend;
    @BindView(R.id.lv_recommend)
    LinearLayout lvRecommend;
    @BindView(R.id.comment)
    TextView comment;
    @BindView(R.id.lv_comment)
    LinearLayout lvComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);
        ButterKnife.bind(this);
        Request request = ItheimaHttp.newGetRequest(AppConfig.detailURL + id);//apiUrl格式："xxx/xxxxx"
        Call call = ItheimaHttp.send(request, new HttpResponseListener<DetailBean>() {
            @Override
            public void onResponse(DetailBean itemsBean, Headers headers) {
                wvNewDetailWeb.loadData(itemsBean.result.body, null, "utf-8");
                tvTitle3.setText(itemsBean.result.title);
                tvTimer.setText(itemsBean.result.pubDate);

                List<DetailBean.ResultBean.AboutsBean> aboutlist = itemsBean.result.abouts;

                if (aboutlist.size() > 0 || aboutlist != null) {
                    for (int i = 0; i < aboutlist.size(); i++) {
                        View view = View.inflate(DetailActivity.this, R.layout.item_about_safe, null);
                        TextView tv_title = (TextView) view.findViewById(R.id.tv_item_about_safe_name);
                        tv_title.setText(aboutlist.get(i).title);
                        lvSoftware.addView(view);
                    }
                }
            }
        });
    }
}