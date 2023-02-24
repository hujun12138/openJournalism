package com.example.openchina.Bean;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

public class ImgBean extends BasePageBean<ImgBean.ResultBean.ItemsBean> {
    /**
     * code : 1
     * message : success
     * notice : {"softwareCount":0,"newsCount":19}
     * result : {"items":[{"detail":"","href":"https://www.oschina.net/question/4855753_2327939","id":2327939,"img":"https://static.oschina.net/uploads/cooperation/4855753_2327831_bc0b96d4-91f2-4d2a-a7e1-b977fda44af8.png","name":"有奖问答 \u2014\u2014 ChatGPT 火了一波，普通程序员怎样快速入门机器学习","pubDate":"2023-02-15 14:33:50","type":0,"weight":1},{"detail":"","href":"https://www.oschina.net/news/226144/oracle-java-se-subscript","id":226144,"img":"https://static.oschina.net/uploads/space/2023/0129/084507_CDGE_4937141.png","name":"价格暴涨，甲骨文推出全新 Java SE 定价模式","pubDate":"2023-01-30 17:17:03","type":6,"weight":0},{"detail":"","href":"https://www.oschina.net/news/225473/googles-deepmind-chatgpt","id":225473,"img":"https://static.oschina.net/uploads/space/2023/0130/151335_2djC_5430600.png","name":"谷歌 DeepMind 宣布即将推出 ChatGPT 的强力竞争对手","pubDate":"2023-01-30 17:16:55","type":6,"weight":0},{"detail":"","href":"https://www.oschina.net/news/225880/lol-sources-alleged","id":225880,"img":"https://static.oschina.net/uploads/img/202301/26083900_Yhkb.jpg","name":"黑客正在拍卖《英雄联盟》游戏源代码","pubDate":"2023-01-30 17:18:05","type":6,"weight":0},{"detail":"","href":"https://www.oschina.net/news/226273/google-open-source","id":226273,"img":"https://static.oschina.net/uploads/img/202301/30151052_nAmR.png","name":"谷歌多名资深\u201c开源大佬\u201d被裁员","pubDate":"2023-01-30 17:19:15","type":6,"weight":0},{"detail":"","href":"https://www.oschina.net/news/225645/chm-apple-lisa-source-co","id":225645,"img":"https://static.oschina.net/uploads/img/202301/30170454_dI2F.png","name":"庆祝 40 周年，CHM 公开 Apple Lisa 源代码","pubDate":"2023-01-30 17:20:06","type":6,"weight":0}],"nextPageToken":"5AD31EC5A195F300","prevPageToken":"150DFFB9324B0FD7","requestCount":6,"responseCount":6,"totalResults":6}
     * time : 2023-02-16 10:38:36
     */

    public int code;
    public String message;
    /**
     * softwareCount : 0
     * newsCount : 19
     */

    public NoticeBean notice;
    /**
     * items : [{"detail":"","href":"https://www.oschina.net/question/4855753_2327939","id":2327939,"img":"https://static.oschina.net/uploads/cooperation/4855753_2327831_bc0b96d4-91f2-4d2a-a7e1-b977fda44af8.png","name":"有奖问答 \u2014\u2014 ChatGPT 火了一波，普通程序员怎样快速入门机器学习","pubDate":"2023-02-15 14:33:50","type":0,"weight":1},{"detail":"","href":"https://www.oschina.net/news/226144/oracle-java-se-subscript","id":226144,"img":"https://static.oschina.net/uploads/space/2023/0129/084507_CDGE_4937141.png","name":"价格暴涨，甲骨文推出全新 Java SE 定价模式","pubDate":"2023-01-30 17:17:03","type":6,"weight":0},{"detail":"","href":"https://www.oschina.net/news/225473/googles-deepmind-chatgpt","id":225473,"img":"https://static.oschina.net/uploads/space/2023/0130/151335_2djC_5430600.png","name":"谷歌 DeepMind 宣布即将推出 ChatGPT 的强力竞争对手","pubDate":"2023-01-30 17:16:55","type":6,"weight":0},{"detail":"","href":"https://www.oschina.net/news/225880/lol-sources-alleged","id":225880,"img":"https://static.oschina.net/uploads/img/202301/26083900_Yhkb.jpg","name":"黑客正在拍卖《英雄联盟》游戏源代码","pubDate":"2023-01-30 17:18:05","type":6,"weight":0},{"detail":"","href":"https://www.oschina.net/news/226273/google-open-source","id":226273,"img":"https://static.oschina.net/uploads/img/202301/30151052_nAmR.png","name":"谷歌多名资深\u201c开源大佬\u201d被裁员","pubDate":"2023-01-30 17:19:15","type":6,"weight":0},{"detail":"","href":"https://www.oschina.net/news/225645/chm-apple-lisa-source-co","id":225645,"img":"https://static.oschina.net/uploads/img/202301/30170454_dI2F.png","name":"庆祝 40 周年，CHM 公开 Apple Lisa 源代码","pubDate":"2023-01-30 17:20:06","type":6,"weight":0}]
     * nextPageToken : 5AD31EC5A195F300
     * prevPageToken : 150DFFB9324B0FD7
     * requestCount : 6
     * responseCount : 6
     * totalResults : 6
     */

    public ResultBean result;
    public String time;

    @Override
    public List<ResultBean.ItemsBean> getItemDatas() {
        return result.items;
    }

    public static class NoticeBean {
        public int softwareCount;
        public int newsCount;
    }

    public static class ResultBean {
        public String nextPageToken;
        public String prevPageToken;
        public int requestCount;
        public int responseCount;
        public int totalResults;
        /**
         * detail :
         * href : https://www.oschina.net/question/4855753_2327939
         * id : 2327939
         * img : https://static.oschina.net/uploads/cooperation/4855753_2327831_bc0b96d4-91f2-4d2a-a7e1-b977fda44af8.png
         * name : 有奖问答 —— ChatGPT 火了一波，普通程序员怎样快速入门机器学习
         * pubDate : 2023-02-15 14:33:50
         * type : 0
         * weight : 1
         */

        public List<ItemsBean> items;

        public static class ItemsBean {
            public String detail;
            public String href;
            public int id;
            public String img;
            public String name;
            public String pubDate;
            public int type;
            public int weight;
        }
    }
}
