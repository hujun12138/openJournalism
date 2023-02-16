package com.example.openchina;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;



public class NewsBean extends BasePageBean<NewsBean.ResultBean.ItemsBean> {


    /**
     * code : 1
     * message : success
     * result : {"items":[{"author":"JohnLui","body":"写作目标 本书的目标是在作者有限的认知范围内，讨论一下高并发问题背后隐藏的一个哲学原理\u2014\u2014找出单点，进行拆分。 内容梗概 我们将从动静分离讲...","commentCount":0,"href":"https://www.oschina.net/news/228305/pphc-open-source-book","id":228305,"pubDate":"2023-02-14 14:30:59","recommend":true,"title":":orange_book:《高并发的哲学原理》开源图书发布","type":6,"viewCount":16},{"author":"狂奔的蜗牛.","body":"Proxy-Go 控制面板 ProxyAdmin 是强大的代理服务工具 snail007/goproxy 的控制面板，运行了它，一秒让你的服务器变为强大的代理服务器，友好的交...","commentCount":0,"href":"https://www.oschina.net/news/228301/proxy-go-4-2-released","id":228301,"pubDate":"2023-02-14 14:07:09","recommend":true,"title":"Proxy-Go 控制面板 v4.2 发布，专业 HTTP/SOCKS5/IP 代理，SDK 升到 12.9","type":6,"viewCount":13},{"author":"OSCS开源供应链安全","body":"漏洞描述 GitLab 是一款基于 Git 的集成软件开发平台。 在GitLab CE/EE受影响版本中存在拒绝服务漏洞，具有上传Helm图表权限的攻击者可以通过上传恶...","commentCount":0,"href":"https://www.oschina.net/news/228288","id":228288,"pubDate":"2023-02-14 11:56:07","recommend":true,"title":"GitLab CE/EE 存在拒绝服务漏洞","type":6,"viewCount":3},{"author":"OSCS开源供应链安全","body":"漏洞描述 react-admin 是一个前端框架，用于构建运行在REST/GraphQL API之上的浏览器应用程序。 该项目受影响版本存在存储型XSS漏洞，由于RichTex...","commentCount":0,"href":"https://www.oschina.net/news/228283","id":228283,"pubDate":"2023-02-14 11:27:06","recommend":true,"title":"react-admin 存在存储型 XSS 漏洞","type":6,"viewCount":19},{"author":"OSCS开源供应链安全","body":"漏洞描述 GitLab 是一款基于 Git 的集成软件开发平台。 在GitLab CE/EE受影响版本中存在跨站点请求伪造缺陷，如果项目所有者或维护者将项目文件上传...","commentCount":0,"href":"https://www.oschina.net/news/228282","id":228282,"pubDate":"2023-02-14 11:25:09","recommend":true,"title":"GitLab CE/EE 存在 CSRF 漏洞","type":6,"viewCount":30},{"author":"xuesjie","body":"昆仑管理系统 v1.3.7 发布了！ 更新日志 1、修改菜单管理及图标管理的查询功； 2、更新个人中心页面，增加角色权限和账号绑定设置； 3、升级前端组...","commentCount":0,"href":"https://www.oschina.net/news/228276/kunlun-admin-1-3-7-released","id":228276,"pubDate":"2023-02-14 10:36:03","recommend":false,"title":"kunlun-admin v1.3.7 发布，昆仑管理系统","type":6,"viewCount":55},{"author":"xingchen","body":"3.0版本更新了什么 重写了UI和交互逻辑，大大提升了视觉效果和操作体验，包括但不限于以下内容： -   展示多个项目时候采用列表结构，同时完善项目...","commentCount":1,"href":"https://www.oschina.net/news/228275/showdoc-3-0-released","id":228275,"pubDate":"2023-02-14 10:29:58","recommend":false,"title":"ShowDoc v3.0 发布，提升了产品颜值和操作体验","type":6,"viewCount":653},{"author":"火箭船","body":"Rust通用代码生成器莲花尝鲜版2，支持Java,Go兼容性，支持前端，支持数据导出 Rust通用代码生成器莲花已公布尝鲜版2。请部署在Tomcat9的webapps目录...","commentCount":0,"href":"https://www.oschina.net/news/228274","id":228274,"pubDate":"2023-02-14 10:21:43","recommend":false,"title":"Rust 通用代码生成器莲花尝鲜版 2，支持 Java、Go 兼容性，支持前端，支持数据导出","type":6,"viewCount":42},{"author":"talent-tan","body":"TiOMQ Client 是什么 TiOMQ Client 是一款免费好用的 MQTT 客户端，用她测试您的 MQTT Server是件非常愉快的事情（TiOMQ Client 仅限功能测试，如果...","commentCount":4,"href":"https://www.oschina.net/news/228272/tiomq-client-1-0-8-released","id":228272,"pubDate":"2023-02-14 10:09:45","recommend":false,"title":"TiOMQ Client 1.0.8，比情人姐还悦色的 MQTT Client","type":6,"viewCount":727},{"author":"openKylin","body":"近日，深圳市江波龙电子股份有限公司（以下简称\u201c江波龙\u201d）签署openKylin社区CLA（Contributor License Agreement 贡献者许可协议），正式加入ope...","commentCount":0,"href":"https://www.oschina.net/news/228270","id":228270,"pubDate":"2023-02-14 09:49:18","recommend":false,"title":"江波龙加入 openKylin，推动存储产品在 openKylin 操作系统上的适配优化！","type":6,"viewCount":73},{"author":"SimpleAdmin","body":"Simple Admin v0.2.4 发布 主要更新： Simple Admin Tools 更新至 v0.2.0 1. 优化代码生成，简化生成代码的接口 2. 修复多项生成bug   Simple Adm...","commentCount":0,"href":"https://www.oschina.net/news/228269/simple-admin-0-2-4-released","id":228269,"pubDate":"2023-02-14 09:48:01","recommend":false,"title":"Simple Admin 分布式后台管理系统 v0.2.4 发布， 重大更新，优化重构接口","type":6,"viewCount":48},{"author":"Dromara开源组织","body":"业界领先的IAM/IDaas身份管理和认证产品 概述 MaxKey单点登录认证系统，谐音马克思的钥匙寓意是最大钥匙,是业界领先的IAM/IDaas身份管理和认证产品...","commentCount":0,"href":"https://www.oschina.net/news/228260/maxkey-3-5-14-released","id":228260,"pubDate":"2023-02-14 09:10:42","recommend":false,"title":"MaxKey 单点登录认证系统 3.5.14 发布，开源领先 IAM 产品","type":6,"viewCount":257},{"author":"罗奇奇","body":"在允许 WSL 使用 OpenGL、OpenCL 和 Vulkan API 进行 GPU 加速之后，微软又正式发布了针对 Linux 的 Windows 子系统 (WSL2)  的 Direct3D 12 GPU ...","commentCount":0,"href":"https://www.oschina.net/news/228258/d3d12-gpu-video-acceleration-for-wsl","id":228258,"pubDate":"2023-02-14 08:53:49","recommend":false,"title":"微软正式推出用于 WSL 的 D3D12 GPU 视频加速","type":6,"viewCount":114},{"author":"白开水不加糖","body":"Arm 工程师 Kiran Chandramohan 在近期举办的 FOSDEM 会议上，介绍了围绕 LLVM Fortran 编译器选项工作的最新进展。 近些年来，许多利益相关者都在...","commentCount":2,"href":"https://www.oschina.net/news/228257/llvm-flang-early-2023","id":228257,"pubDate":"2023-02-14 08:41:06","recommend":false,"title":"Arm 介绍 LLVM Fortran 编译器 Flang 的最新进展","type":6,"viewCount":797},{"author":"OSCHINA编辑部","body":"近日，OSCHINA 和 Gitee 联合发布了《2022 中国开源开发者报告》。澎峰科技联合创始人兼首席运营官王军辉在报告中对 RISC-V 领域进行了解读，以下...","commentCount":0,"href":"https://my.oschina.net/oscpyaqxylk/blog/7762522","id":7762522,"pubDate":"2023-02-14 08:28:48","recommend":false,"title":"RISC-V 高性能计算要解决的三个问题","type":3,"viewCount":1326},{"author":"局","body":"谷歌和 Mozilla 都在开发不使用WebKit 引擎的 iOS 浏览器，而根据苹果当前的 App Store 政策，iOS 浏览器应用程序必须使用系统内置的 WebKit 引擎。...","commentCount":3,"href":"https://www.oschina.net/news/228255/mozilla-google-apple-webkit","id":228255,"pubDate":"2023-02-14 08:27:29","recommend":false,"title":"谷歌和 Mozilla 都在开发不使用 WebKit 引擎的 iOS 浏览器","type":6,"viewCount":1664},{"author":"OSCHINA编辑部","body":"其中，Apache 基金会成员、Apache SeaTunnel (incubating) 导师郭炜（郭大侠）在报告中对开源大数据领域进行了解读，以下为原文。...","commentCount":4,"href":"https://my.oschina.net/oscpyaqxylk/blog/7383833","id":7383833,"pubDate":"2023-02-14 08:22:43","recommend":false,"title":"新一代数据栈将逐步替代国内单一 \u201c数据中台\u201d","type":3,"viewCount":1830},{"author":"青苗","body":"目前支持 Minio  ，阿里云 OSS ，腾讯 COS ，亚马逊 AWSS3 ，本地存储 支持文件类型合法校验 \r\nOSS.fileStorage(platform).bucket(bucketName)\r\n...","commentCount":0,"href":"https://www.oschina.net/news/228253/aizuda-1-0-6-released","id":228253,"pubDate":"2023-02-14 08:22:18","recommend":false,"title":"爱组搭 aizuda 低代码 OSS 文件存储模块 1.0.6 发布","type":6,"viewCount":719},{"author":"白开水不加糖","body":"Gradle 8.0 现已发布。Gradle 是一个基于 Apache Ant 和 Apache Maven 概念的项目自动化构建工具，支持依赖管理和多项目，类似 Maven，但比...","commentCount":3,"href":"https://www.oschina.net/news/228252/gradle-8-0-released","id":228252,"pubDate":"2023-02-14 08:20:11","recommend":false,"title":"Gradle 8.0 发布","type":6,"viewCount":1389},{"author":"白开水不加糖","body":"Editable 是一个富文本编辑器框架，提供了稳定的富文本编辑能力。","commentCount":0,"href":"https://www.oschina.net/p/editablejs","id":65006,"pubDate":"2023-02-14 08:18:56","recommend":false,"title":"Editable \u2014\u2014 富文本编辑器框架","type":1,"viewCount":1237}],"nextPageToken":"DBA816934CD0AA59","prevPageToken":"0997C855C600E421","requestCount":20,"responseCount":20,"totalResults":130696}
     * time : 2023-02-14 15:17:42
     */

    public int code;
    public String message;
    /**
     * items : [{"author":"JohnLui","body":"写作目标 本书的目标是在作者有限的认知范围内，讨论一下高并发问题背后隐藏的一个哲学原理\u2014\u2014找出单点，进行拆分。 内容梗概 我们将从动静分离讲...","commentCount":0,"href":"https://www.oschina.net/news/228305/pphc-open-source-book","id":228305,"pubDate":"2023-02-14 14:30:59","recommend":true,"title":":orange_book:《高并发的哲学原理》开源图书发布","type":6,"viewCount":16},{"author":"狂奔的蜗牛.","body":"Proxy-Go 控制面板 ProxyAdmin 是强大的代理服务工具 snail007/goproxy 的控制面板，运行了它，一秒让你的服务器变为强大的代理服务器，友好的交...","commentCount":0,"href":"https://www.oschina.net/news/228301/proxy-go-4-2-released","id":228301,"pubDate":"2023-02-14 14:07:09","recommend":true,"title":"Proxy-Go 控制面板 v4.2 发布，专业 HTTP/SOCKS5/IP 代理，SDK 升到 12.9","type":6,"viewCount":13},{"author":"OSCS开源供应链安全","body":"漏洞描述 GitLab 是一款基于 Git 的集成软件开发平台。 在GitLab CE/EE受影响版本中存在拒绝服务漏洞，具有上传Helm图表权限的攻击者可以通过上传恶...","commentCount":0,"href":"https://www.oschina.net/news/228288","id":228288,"pubDate":"2023-02-14 11:56:07","recommend":true,"title":"GitLab CE/EE 存在拒绝服务漏洞","type":6,"viewCount":3},{"author":"OSCS开源供应链安全","body":"漏洞描述 react-admin 是一个前端框架，用于构建运行在REST/GraphQL API之上的浏览器应用程序。 该项目受影响版本存在存储型XSS漏洞，由于RichTex...","commentCount":0,"href":"https://www.oschina.net/news/228283","id":228283,"pubDate":"2023-02-14 11:27:06","recommend":true,"title":"react-admin 存在存储型 XSS 漏洞","type":6,"viewCount":19},{"author":"OSCS开源供应链安全","body":"漏洞描述 GitLab 是一款基于 Git 的集成软件开发平台。 在GitLab CE/EE受影响版本中存在跨站点请求伪造缺陷，如果项目所有者或维护者将项目文件上传...","commentCount":0,"href":"https://www.oschina.net/news/228282","id":228282,"pubDate":"2023-02-14 11:25:09","recommend":true,"title":"GitLab CE/EE 存在 CSRF 漏洞","type":6,"viewCount":30},{"author":"xuesjie","body":"昆仑管理系统 v1.3.7 发布了！ 更新日志 1、修改菜单管理及图标管理的查询功； 2、更新个人中心页面，增加角色权限和账号绑定设置； 3、升级前端组...","commentCount":0,"href":"https://www.oschina.net/news/228276/kunlun-admin-1-3-7-released","id":228276,"pubDate":"2023-02-14 10:36:03","recommend":false,"title":"kunlun-admin v1.3.7 发布，昆仑管理系统","type":6,"viewCount":55},{"author":"xingchen","body":"3.0版本更新了什么 重写了UI和交互逻辑，大大提升了视觉效果和操作体验，包括但不限于以下内容： -   展示多个项目时候采用列表结构，同时完善项目...","commentCount":1,"href":"https://www.oschina.net/news/228275/showdoc-3-0-released","id":228275,"pubDate":"2023-02-14 10:29:58","recommend":false,"title":"ShowDoc v3.0 发布，提升了产品颜值和操作体验","type":6,"viewCount":653},{"author":"火箭船","body":"Rust通用代码生成器莲花尝鲜版2，支持Java,Go兼容性，支持前端，支持数据导出 Rust通用代码生成器莲花已公布尝鲜版2。请部署在Tomcat9的webapps目录...","commentCount":0,"href":"https://www.oschina.net/news/228274","id":228274,"pubDate":"2023-02-14 10:21:43","recommend":false,"title":"Rust 通用代码生成器莲花尝鲜版 2，支持 Java、Go 兼容性，支持前端，支持数据导出","type":6,"viewCount":42},{"author":"talent-tan","body":"TiOMQ Client 是什么 TiOMQ Client 是一款免费好用的 MQTT 客户端，用她测试您的 MQTT Server是件非常愉快的事情（TiOMQ Client 仅限功能测试，如果...","commentCount":4,"href":"https://www.oschina.net/news/228272/tiomq-client-1-0-8-released","id":228272,"pubDate":"2023-02-14 10:09:45","recommend":false,"title":"TiOMQ Client 1.0.8，比情人姐还悦色的 MQTT Client","type":6,"viewCount":727},{"author":"openKylin","body":"近日，深圳市江波龙电子股份有限公司（以下简称\u201c江波龙\u201d）签署openKylin社区CLA（Contributor License Agreement 贡献者许可协议），正式加入ope...","commentCount":0,"href":"https://www.oschina.net/news/228270","id":228270,"pubDate":"2023-02-14 09:49:18","recommend":false,"title":"江波龙加入 openKylin，推动存储产品在 openKylin 操作系统上的适配优化！","type":6,"viewCount":73},{"author":"SimpleAdmin","body":"Simple Admin v0.2.4 发布 主要更新： Simple Admin Tools 更新至 v0.2.0 1. 优化代码生成，简化生成代码的接口 2. 修复多项生成bug   Simple Adm...","commentCount":0,"href":"https://www.oschina.net/news/228269/simple-admin-0-2-4-released","id":228269,"pubDate":"2023-02-14 09:48:01","recommend":false,"title":"Simple Admin 分布式后台管理系统 v0.2.4 发布， 重大更新，优化重构接口","type":6,"viewCount":48},{"author":"Dromara开源组织","body":"业界领先的IAM/IDaas身份管理和认证产品 概述 MaxKey单点登录认证系统，谐音马克思的钥匙寓意是最大钥匙,是业界领先的IAM/IDaas身份管理和认证产品...","commentCount":0,"href":"https://www.oschina.net/news/228260/maxkey-3-5-14-released","id":228260,"pubDate":"2023-02-14 09:10:42","recommend":false,"title":"MaxKey 单点登录认证系统 3.5.14 发布，开源领先 IAM 产品","type":6,"viewCount":257},{"author":"罗奇奇","body":"在允许 WSL 使用 OpenGL、OpenCL 和 Vulkan API 进行 GPU 加速之后，微软又正式发布了针对 Linux 的 Windows 子系统 (WSL2)  的 Direct3D 12 GPU ...","commentCount":0,"href":"https://www.oschina.net/news/228258/d3d12-gpu-video-acceleration-for-wsl","id":228258,"pubDate":"2023-02-14 08:53:49","recommend":false,"title":"微软正式推出用于 WSL 的 D3D12 GPU 视频加速","type":6,"viewCount":114},{"author":"白开水不加糖","body":"Arm 工程师 Kiran Chandramohan 在近期举办的 FOSDEM 会议上，介绍了围绕 LLVM Fortran 编译器选项工作的最新进展。 近些年来，许多利益相关者都在...","commentCount":2,"href":"https://www.oschina.net/news/228257/llvm-flang-early-2023","id":228257,"pubDate":"2023-02-14 08:41:06","recommend":false,"title":"Arm 介绍 LLVM Fortran 编译器 Flang 的最新进展","type":6,"viewCount":797},{"author":"OSCHINA编辑部","body":"近日，OSCHINA 和 Gitee 联合发布了《2022 中国开源开发者报告》。澎峰科技联合创始人兼首席运营官王军辉在报告中对 RISC-V 领域进行了解读，以下...","commentCount":0,"href":"https://my.oschina.net/oscpyaqxylk/blog/7762522","id":7762522,"pubDate":"2023-02-14 08:28:48","recommend":false,"title":"RISC-V 高性能计算要解决的三个问题","type":3,"viewCount":1326},{"author":"局","body":"谷歌和 Mozilla 都在开发不使用WebKit 引擎的 iOS 浏览器，而根据苹果当前的 App Store 政策，iOS 浏览器应用程序必须使用系统内置的 WebKit 引擎。...","commentCount":3,"href":"https://www.oschina.net/news/228255/mozilla-google-apple-webkit","id":228255,"pubDate":"2023-02-14 08:27:29","recommend":false,"title":"谷歌和 Mozilla 都在开发不使用 WebKit 引擎的 iOS 浏览器","type":6,"viewCount":1664},{"author":"OSCHINA编辑部","body":"其中，Apache 基金会成员、Apache SeaTunnel (incubating) 导师郭炜（郭大侠）在报告中对开源大数据领域进行了解读，以下为原文。...","commentCount":4,"href":"https://my.oschina.net/oscpyaqxylk/blog/7383833","id":7383833,"pubDate":"2023-02-14 08:22:43","recommend":false,"title":"新一代数据栈将逐步替代国内单一 \u201c数据中台\u201d","type":3,"viewCount":1830},{"author":"青苗","body":"目前支持 Minio  ，阿里云 OSS ，腾讯 COS ，亚马逊 AWSS3 ，本地存储 支持文件类型合法校验 \r\nOSS.fileStorage(platform).bucket(bucketName)\r\n...","commentCount":0,"href":"https://www.oschina.net/news/228253/aizuda-1-0-6-released","id":228253,"pubDate":"2023-02-14 08:22:18","recommend":false,"title":"爱组搭 aizuda 低代码 OSS 文件存储模块 1.0.6 发布","type":6,"viewCount":719},{"author":"白开水不加糖","body":"Gradle 8.0 现已发布。Gradle 是一个基于 Apache Ant 和 Apache Maven 概念的项目自动化构建工具，支持依赖管理和多项目，类似 Maven，但比...","commentCount":3,"href":"https://www.oschina.net/news/228252/gradle-8-0-released","id":228252,"pubDate":"2023-02-14 08:20:11","recommend":false,"title":"Gradle 8.0 发布","type":6,"viewCount":1389},{"author":"白开水不加糖","body":"Editable 是一个富文本编辑器框架，提供了稳定的富文本编辑能力。","commentCount":0,"href":"https://www.oschina.net/p/editablejs","id":65006,"pubDate":"2023-02-14 08:18:56","recommend":false,"title":"Editable \u2014\u2014 富文本编辑器框架","type":1,"viewCount":1237}]
     * nextPageToken : DBA816934CD0AA59
     * prevPageToken : 0997C855C600E421
     * requestCount : 20
     * responseCount : 20
     * totalResults : 130696
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
         * author : JohnLui
         * body : 写作目标 本书的目标是在作者有限的认知范围内，讨论一下高并发问题背后隐藏的一个哲学原理——找出单点，进行拆分。 内容梗概 我们将从动静分离讲...
         * commentCount : 0
         * href : https://www.oschina.net/news/228305/pphc-open-source-book
         * id : 228305
         * pubDate : 2023-02-14 14:30:59
         * recommend : true
         * title : :orange_book:《高并发的哲学原理》开源图书发布
         * type : 6
         * viewCount : 16
         */

        public List<ItemsBean> items;

        public static class ItemsBean {
            public String author;
            public String body;
            public int commentCount;
            public String href;
            public int id;
            public String pubDate;
            public boolean recommend;
            public String title;
            public int type;
            public int viewCount;
        }
    }
}
