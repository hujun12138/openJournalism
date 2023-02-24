package com.example.openchina.Bean;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

public class BlogBean extends BasePageBean<BlogBean.ResultBean.ItemsBean> {
    /**
     * code : 1
     * message : success
     * result : {"items":[{"author":"HMS Core","body":"一、 获取Push Token的方式 获取Push Token有两种方式：一种是调用getTo...","commentCount":0,"href":"https://my.oschina.net/HMSCore/blog/8143363","id":8143363,"original":true,"pubDate":"2023-02-23 09:57:33","recommend":false,"title":"【FAQ】获取Push Token失败，如何进行排查？","type":3,"viewCount":0},{"author":"华为开发者论坛","body":"一、拉起方式 用户可以通过手机碰一碰、靠近发现等方式，快速拉起手机上...","commentCount":0,"href":"https://my.oschina.net/u/4478396/blog/8143310","id":8143310,"original":true,"pubDate":"2023-02-23 09:41:17","recommend":false,"title":"鸿蒙智联HarmonyOS Connect原子化服务拉起方式与开发整体流程","type":3,"viewCount":4},{"author":"Anur","body":"这件事起源于有小伙伴在某群里问，在 K8s 中，能不能把 volume 挂载直接...","commentCount":0,"href":"https://my.oschina.net/anur/blog/8108911","id":8108911,"original":true,"pubDate":"2023-02-22 21:23:46","recommend":false,"title":"容器能不能将 volume 挂载直接挂到根目录？（上）\u2014\u2014 从 runc 说起","type":3,"viewCount":330},{"author":"Zilliz","body":"出品人：Towhee 技术团队 王翔宇、顾梦佳 视频识别的标准方法通常会对完...","commentCount":0,"href":"https://my.oschina.net/u/4209276/blog/8108570","id":8108570,"original":true,"pubDate":"2023-02-22 18:49:09","recommend":false,"title":"MAR：针对动作识别的视频掩码建模","type":3,"viewCount":5},{"author":"OSCHINA编辑部","body":"李蒙 现任中移物联网有限公司操作系统产品部副总经理，深耕物联网应用领...","commentCount":0,"href":"https://my.oschina.net/oscpyaqxylk/blog/8108526","id":8108526,"original":true,"pubDate":"2023-02-22 17:11:46","recommend":false,"title":"中移物联网李蒙：物联网操作系统需求大爆发","type":3,"viewCount":6},{"author":"博学谷狂野架构师","body":"重排序 数据依赖性 如果两个操作访问同一个变量，且这两个操作中有一个为...","commentCount":0,"href":"https://my.oschina.net/jiagoushi/blog/8108303","id":8108303,"original":true,"pubDate":"2023-02-22 15:53:49","recommend":true,"title":"98%的程序员，都没有研究过JVM重排序和顺序一致性","type":3,"viewCount":271},{"author":"袋鼠云数栈DTinsight","body":"如今，各行各业都已经意识到了数据的价值，开始沉淀数据资产，挖掘数据价...","commentCount":0,"href":"https://my.oschina.net/u/3869098/blog/8107863","id":8107863,"original":true,"pubDate":"2023-02-22 14:59:11","recommend":true,"title":"大数据应用场景下，标签策略如何实现价值最大化？","type":3,"viewCount":39},{"author":"阿里云大数据AI技术","body":"作者：王奇（花名慧青） 阿里云Hologres研发 随着实时数仓在业务生产系统...","commentCount":0,"href":"https://my.oschina.net/u/5583868/blog/8107779","id":8107779,"original":true,"pubDate":"2023-02-22 14:46:33","recommend":true,"title":"实时数仓Hologres新一代弹性计算组实例技术揭秘","type":3,"viewCount":15},{"author":"京东云开发者","body":"云计算正在以前所未有的速度在各行各业快速普及 随着应用需求的增长，全...","commentCount":0,"href":"https://my.oschina.net/u/4090830/blog/8107680","id":8107680,"original":true,"pubDate":"2023-02-22 14:27:22","recommend":false,"title":"我在京东做研发 | 京东云自研服务器，如何将开发成本降低60%的同时还更低碳环保？","type":3,"viewCount":10},{"author":"OpenHarmony开发者","body":"  简介 本篇主要介绍如何使用DevEco Studio for OpenAtom OpenHarmony ...","commentCount":3,"href":"https://my.oschina.net/OpenHarmony/blog/8107675","id":8107675,"original":false,"pubDate":"2023-02-22 14:26:23","recommend":false,"title":"如何使用DevEco Studio创建Native C++应用","type":3,"viewCount":17},{"author":"飞桨PaddlePaddle","body":"AI+Science专栏由百度飞桨科学计算团队出品，给大家带来在AI+科学计算领...","commentCount":0,"href":"https://my.oschina.net/u/4067628/blog/8106943","id":8106943,"original":true,"pubDate":"2023-02-22 11:16:29","recommend":false,"title":"AI for Science系列（一） ：飞桨加速CFD（计算流体力学）原理与实践","type":3,"viewCount":13},{"author":"Rainbond","body":"Loki 是一个由Grafana Labs 开发的开源日志聚合系统，旨在为云原生架构提...","commentCount":0,"href":"https://my.oschina.net/rainbond/blog/8106846","id":8106846,"original":true,"pubDate":"2023-02-22 10:56:12","recommend":true,"title":"10分钟学会使用 Loki 日志聚合系统","type":3,"viewCount":409},{"author":"GreatSQL","body":"小编提醒：拿MariaDB的so去MySQL里install，这种方式很容易导致 audit ...","commentCount":0,"href":"https://my.oschina.net/GreatSQL/blog/8106715","id":8106715,"original":true,"pubDate":"2023-02-22 10:21:05","recommend":false,"title":"MySQL审计插件-MariaDB Audit Plugin","type":3,"viewCount":6},{"author":"KaiwuDB","body":"导读 本篇博客主要讲解发布于 Microprocessors and Microsystems 的文章...","commentCount":0,"href":"https://my.oschina.net/u/5148943/blog/8106673","id":8106673,"original":true,"pubDate":"2023-02-22 10:11:30","recommend":true,"title":"学术贴 | FPGA 加速图数据库查询执行","type":3,"viewCount":102},{"author":"vivo互联网技术","body":"作者：vivo 互联网平台产品研发团队 本文是《OKR 之剑》系列之总结第 1 ...","commentCount":0,"href":"https://my.oschina.net/vivotech/blog/8106621","id":8106621,"original":true,"pubDate":"2023-02-22 09:13:13","recommend":false,"title":"OKR之剑·总结篇01：如何开好一场OKR复盘会","type":3,"viewCount":11},{"author":"Python自动化办公社区","body":"大家好，这里是程序员晚枫。 今天给大家分享一个来自Python官网的重要消...","commentCount":1,"href":"https://my.oschina.net/u/3888978/blog/8084350","id":8084350,"original":true,"pubDate":"2023-02-21 23:16:54","recommend":true,"title":"定了！Python3.7，今年停止更新！","type":3,"viewCount":629},{"author":"得物技术","body":"0.前言 关于什么是SRE，以及在业务上有哪些具体的输出，网上资料众多但都...","commentCount":0,"href":"https://my.oschina.net/u/5783135/blog/8080272","id":8080272,"original":true,"pubDate":"2023-02-21 19:29:50","recommend":false,"title":"得物容器SRE探索与实践","type":3,"viewCount":5},{"author":"StarRocks","body":"2月10日上午，墨天轮【2023春季发布会暨第二届数据库掌门人论坛】盛大开...","commentCount":0,"href":"https://my.oschina.net/u/5658056/blog/8079833","id":8079833,"original":true,"pubDate":"2023-02-21 17:31:20","recommend":false,"title":"数据库掌门人论坛回顾，激辩技术和行业发展趋势","type":3,"viewCount":7},{"author":"真正的飞鱼","body":"介绍信息加密 信息加密是实现数据保密性的手段。 信息加密（Encryption）...","commentCount":0,"href":"https://my.oschina.net/u/5846998/blog/8078902","id":8078902,"original":true,"pubDate":"2023-02-21 15:36:52","recommend":false,"title":"信息加密","type":3,"viewCount":3},{"author":"Finbird","body":"记得 ChatGPT 最开始上线不久的时候，看到的大部分尝鲜和测试结果都是开...","commentCount":0,"href":"https://my.oschina.net/u/5326906/blog/8078294","id":8078294,"original":true,"pubDate":"2023-02-21 14:50:13","recommend":false,"title":"关于 ChatGPT 与开发者间的一些事儿","type":3,"viewCount":8}],"nextPageToken":"DBA816934CD0AA59","prevPageToken":"0997C855C600E421","requestCount":20,"responseCount":20,"totalResults":1000}
     * time : 2023-02-23 10:07:19
     */

    public int code;
    public String message;
    /**
     * items : [{"author":"HMS Core","body":"一、 获取Push Token的方式 获取Push Token有两种方式：一种是调用getTo...","commentCount":0,"href":"https://my.oschina.net/HMSCore/blog/8143363","id":8143363,"original":true,"pubDate":"2023-02-23 09:57:33","recommend":false,"title":"【FAQ】获取Push Token失败，如何进行排查？","type":3,"viewCount":0},{"author":"华为开发者论坛","body":"一、拉起方式 用户可以通过手机碰一碰、靠近发现等方式，快速拉起手机上...","commentCount":0,"href":"https://my.oschina.net/u/4478396/blog/8143310","id":8143310,"original":true,"pubDate":"2023-02-23 09:41:17","recommend":false,"title":"鸿蒙智联HarmonyOS Connect原子化服务拉起方式与开发整体流程","type":3,"viewCount":4},{"author":"Anur","body":"这件事起源于有小伙伴在某群里问，在 K8s 中，能不能把 volume 挂载直接...","commentCount":0,"href":"https://my.oschina.net/anur/blog/8108911","id":8108911,"original":true,"pubDate":"2023-02-22 21:23:46","recommend":false,"title":"容器能不能将 volume 挂载直接挂到根目录？（上）\u2014\u2014 从 runc 说起","type":3,"viewCount":330},{"author":"Zilliz","body":"出品人：Towhee 技术团队 王翔宇、顾梦佳 视频识别的标准方法通常会对完...","commentCount":0,"href":"https://my.oschina.net/u/4209276/blog/8108570","id":8108570,"original":true,"pubDate":"2023-02-22 18:49:09","recommend":false,"title":"MAR：针对动作识别的视频掩码建模","type":3,"viewCount":5},{"author":"OSCHINA编辑部","body":"李蒙 现任中移物联网有限公司操作系统产品部副总经理，深耕物联网应用领...","commentCount":0,"href":"https://my.oschina.net/oscpyaqxylk/blog/8108526","id":8108526,"original":true,"pubDate":"2023-02-22 17:11:46","recommend":false,"title":"中移物联网李蒙：物联网操作系统需求大爆发","type":3,"viewCount":6},{"author":"博学谷狂野架构师","body":"重排序 数据依赖性 如果两个操作访问同一个变量，且这两个操作中有一个为...","commentCount":0,"href":"https://my.oschina.net/jiagoushi/blog/8108303","id":8108303,"original":true,"pubDate":"2023-02-22 15:53:49","recommend":true,"title":"98%的程序员，都没有研究过JVM重排序和顺序一致性","type":3,"viewCount":271},{"author":"袋鼠云数栈DTinsight","body":"如今，各行各业都已经意识到了数据的价值，开始沉淀数据资产，挖掘数据价...","commentCount":0,"href":"https://my.oschina.net/u/3869098/blog/8107863","id":8107863,"original":true,"pubDate":"2023-02-22 14:59:11","recommend":true,"title":"大数据应用场景下，标签策略如何实现价值最大化？","type":3,"viewCount":39},{"author":"阿里云大数据AI技术","body":"作者：王奇（花名慧青） 阿里云Hologres研发 随着实时数仓在业务生产系统...","commentCount":0,"href":"https://my.oschina.net/u/5583868/blog/8107779","id":8107779,"original":true,"pubDate":"2023-02-22 14:46:33","recommend":true,"title":"实时数仓Hologres新一代弹性计算组实例技术揭秘","type":3,"viewCount":15},{"author":"京东云开发者","body":"云计算正在以前所未有的速度在各行各业快速普及 随着应用需求的增长，全...","commentCount":0,"href":"https://my.oschina.net/u/4090830/blog/8107680","id":8107680,"original":true,"pubDate":"2023-02-22 14:27:22","recommend":false,"title":"我在京东做研发 | 京东云自研服务器，如何将开发成本降低60%的同时还更低碳环保？","type":3,"viewCount":10},{"author":"OpenHarmony开发者","body":"  简介 本篇主要介绍如何使用DevEco Studio for OpenAtom OpenHarmony ...","commentCount":3,"href":"https://my.oschina.net/OpenHarmony/blog/8107675","id":8107675,"original":false,"pubDate":"2023-02-22 14:26:23","recommend":false,"title":"如何使用DevEco Studio创建Native C++应用","type":3,"viewCount":17},{"author":"飞桨PaddlePaddle","body":"AI+Science专栏由百度飞桨科学计算团队出品，给大家带来在AI+科学计算领...","commentCount":0,"href":"https://my.oschina.net/u/4067628/blog/8106943","id":8106943,"original":true,"pubDate":"2023-02-22 11:16:29","recommend":false,"title":"AI for Science系列（一） ：飞桨加速CFD（计算流体力学）原理与实践","type":3,"viewCount":13},{"author":"Rainbond","body":"Loki 是一个由Grafana Labs 开发的开源日志聚合系统，旨在为云原生架构提...","commentCount":0,"href":"https://my.oschina.net/rainbond/blog/8106846","id":8106846,"original":true,"pubDate":"2023-02-22 10:56:12","recommend":true,"title":"10分钟学会使用 Loki 日志聚合系统","type":3,"viewCount":409},{"author":"GreatSQL","body":"小编提醒：拿MariaDB的so去MySQL里install，这种方式很容易导致 audit ...","commentCount":0,"href":"https://my.oschina.net/GreatSQL/blog/8106715","id":8106715,"original":true,"pubDate":"2023-02-22 10:21:05","recommend":false,"title":"MySQL审计插件-MariaDB Audit Plugin","type":3,"viewCount":6},{"author":"KaiwuDB","body":"导读 本篇博客主要讲解发布于 Microprocessors and Microsystems 的文章...","commentCount":0,"href":"https://my.oschina.net/u/5148943/blog/8106673","id":8106673,"original":true,"pubDate":"2023-02-22 10:11:30","recommend":true,"title":"学术贴 | FPGA 加速图数据库查询执行","type":3,"viewCount":102},{"author":"vivo互联网技术","body":"作者：vivo 互联网平台产品研发团队 本文是《OKR 之剑》系列之总结第 1 ...","commentCount":0,"href":"https://my.oschina.net/vivotech/blog/8106621","id":8106621,"original":true,"pubDate":"2023-02-22 09:13:13","recommend":false,"title":"OKR之剑·总结篇01：如何开好一场OKR复盘会","type":3,"viewCount":11},{"author":"Python自动化办公社区","body":"大家好，这里是程序员晚枫。 今天给大家分享一个来自Python官网的重要消...","commentCount":1,"href":"https://my.oschina.net/u/3888978/blog/8084350","id":8084350,"original":true,"pubDate":"2023-02-21 23:16:54","recommend":true,"title":"定了！Python3.7，今年停止更新！","type":3,"viewCount":629},{"author":"得物技术","body":"0.前言 关于什么是SRE，以及在业务上有哪些具体的输出，网上资料众多但都...","commentCount":0,"href":"https://my.oschina.net/u/5783135/blog/8080272","id":8080272,"original":true,"pubDate":"2023-02-21 19:29:50","recommend":false,"title":"得物容器SRE探索与实践","type":3,"viewCount":5},{"author":"StarRocks","body":"2月10日上午，墨天轮【2023春季发布会暨第二届数据库掌门人论坛】盛大开...","commentCount":0,"href":"https://my.oschina.net/u/5658056/blog/8079833","id":8079833,"original":true,"pubDate":"2023-02-21 17:31:20","recommend":false,"title":"数据库掌门人论坛回顾，激辩技术和行业发展趋势","type":3,"viewCount":7},{"author":"真正的飞鱼","body":"介绍信息加密 信息加密是实现数据保密性的手段。 信息加密（Encryption）...","commentCount":0,"href":"https://my.oschina.net/u/5846998/blog/8078902","id":8078902,"original":true,"pubDate":"2023-02-21 15:36:52","recommend":false,"title":"信息加密","type":3,"viewCount":3},{"author":"Finbird","body":"记得 ChatGPT 最开始上线不久的时候，看到的大部分尝鲜和测试结果都是开...","commentCount":0,"href":"https://my.oschina.net/u/5326906/blog/8078294","id":8078294,"original":true,"pubDate":"2023-02-21 14:50:13","recommend":false,"title":"关于 ChatGPT 与开发者间的一些事儿","type":3,"viewCount":8}]
     * nextPageToken : DBA816934CD0AA59
     * prevPageToken : 0997C855C600E421
     * requestCount : 20
     * responseCount : 20
     * totalResults : 1000
     */

    public ResultBean result;
    public String time;

    @Override
    public List<ResultBean.ItemsBean> getItemDatas() {
        return result.items;
    }

    public static class ResultBean {
        public String nextPageToken;
        public String prevPageToken;
        public int requestCount;
        public int responseCount;
        public int totalResults;
        /**
         * author : HMS Core
         * body : 一、 获取Push Token的方式 获取Push Token有两种方式：一种是调用getTo...
         * commentCount : 0
         * href : https://my.oschina.net/HMSCore/blog/8143363
         * id : 8143363
         * original : true
         * pubDate : 2023-02-23 09:57:33
         * recommend : false
         * title : 【FAQ】获取Push Token失败，如何进行排查？
         * type : 3
         * viewCount : 0
         */

        public List<ItemsBean> items;

        public static class ItemsBean {
            public String author;
            public String body;
            public int commentCount;
            public String href;
            public int id;
            public boolean original;
            public String pubDate;
            public boolean recommend;
            public String title;
            public int type;
            public int viewCount;
        }
    }
}
