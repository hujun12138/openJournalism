package com.example.openchina.Bean;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

public class DetailBean extends BasePageBean<DetailBean.ResultBean.AboutsBean> {

    /**
     * code : 1
     * message : success
     * result : {"abouts":[{"commentCount":6,"content":"Proxy-Go v5.3发布了。Proxy是golang实现的高性能http,https,websocket,tcp,udp,socks5代理服务器,支持正向代理、反向代理、透明代理、内网穿透、TCP/UDP端口映射、SSH中转、TLS加密传输、协议转换、DNS防污染代理。 更新内容： 优化了socks_client握手端口判断,避免了sstap测试UDP失败的问题. 特点： 链式代理,程序本身可以作为一级代理,如果设置了上级代理那么可以作为二级代理,乃至N级代理. 通讯加密,如果程序不是一级代理,...","href":"https://www.oschina.net/news/98715/proxy-go-5-3-released","id":98715,"statistics":{"comment":6,"favCount":0,"like":0,"transmit":1,"view":5408},"title":"Proxy-Go v5.3 发布，优化了 SOCKS5 的 UDP 功能","type":6,"viewCount":5408},{"commentCount":4,"content":"Proxy-Go 全平台 SDK是proxy使用gombile实现了一份go代码编译为android和ios平台下面可以直接调用的sdk类库, 另外还为linux和windows提供sdk支持，基于这些类库,APP开发者可以轻松的开发出各种形式的代理工具。 此次更新： 增加了支持日志输出回调的方法: StartWithLog(serviceID, serviceArgsStr string, loggerCallback LogCallback) 优化了socks_client握手端口判断,避免了sstap测试UDP失败的问题.. 修复了HTTP(S)\\SPS反向代...","href":"https://www.oschina.net/news/98300/proxy-go-5-3-released","id":98300,"statistics":{"comment":4,"favCount":0,"like":0,"transmit":0,"view":1067},"title":"Proxy-Go 全平台 SDK v5.3 发布，新增日志回调","type":6,"viewCount":1067},{"commentCount":6,"content":"Proxy-Go v5.2发布了。Proxy是golang实现的高性能http,https,websocket,tcp,udp,socks5代理服务器,支持正向代理、反向代理、透明代理、内网穿透、TCP/UDP端口映射、SSH中转、TLS加密传输、协议转换、DNS防污染代理。 更新内容： 修复了HTTP(S)\\SPS反向代理无法正常工作的问题. 优化了智能判断,减少不必要的DNS解析. 重构了SOCKS和SPS的UDP功能,基于UDP的游戏加速嗖嗖的. 特点： 链式代理,程序本身可以作为一级代理,如果设置了上...","href":"https://www.oschina.net/news/97853/proxy-go-5-2-released","id":97853,"statistics":{"comment":6,"favCount":0,"like":0,"transmit":0,"view":2085},"title":"Proxy-Go v5.2 发布，重构 SOCKS5/SPS 的 UDP 功能","type":6,"viewCount":2085},{"commentCount":6,"content":"Proxy-Go v5.1发布了。Proxy是golang实现的高性能http,https,websocket,tcp,udp,socks5代理服务器,支持正向代理、反向代理、透明代理、内网穿透、TCP/UDP端口映射、SSH中转、TLS加密传输、协议转换、DNS防污染代理。 更新内容： 优化了kcp默认mtu配置,调整为450. 优化了HTTP(S)\\SOCKS5代理智能判断，更加精确。 fix #97 , 修复了RemoveProxyHeaders方法忽略了第一行的bug。 修复了-g参数长格式没有连接符号的bug. 重构了证书生成...","href":"https://www.oschina.net/news/97518/proxy-go-5-1-released","id":97518,"statistics":{"comment":6,"favCount":0,"like":0,"transmit":0,"view":1381},"title":"Proxy-Go v5.1 发布，可以全平台生成证书","type":6,"viewCount":1381},{"commentCount":0,"content":"Proxy-Go 全平台 SDK是proxy使用gombile实现了一份go代码编译为android和ios平台下面可以直接调用的sdk类库, 另外还为linux和windows提供sdk支持，基于这些类库,APP开发者可以轻松的开发出各种形式的代理工具。 此次更新： 修复了SPS多端口无效的bug. 增加了DNS代理功能，提供安全无污染的DNS解析. 下载地址: Gitee GAYHUB Proxy SDK 使用说明 支持以下平台: Android,.arr库 IOS,.framework库 Windows,.dll库 Linux,.so库 MacO...","href":"https://www.oschina.net/news/97250/proxy-go-sdk-5-0-released","id":97250,"statistics":{"comment":0,"favCount":0,"like":0,"transmit":0,"view":1256},"title":"Proxy-Go 全平台 SDK v5.0 发布啦！新增安全DNS代理！","type":6,"viewCount":1256}],"author":"狂奔的蜗牛.","authorId":873901,"authorPortrait":"https://static.oschina.net/uploads/user/436/873901_50.jpg?t=1409972745000","authorRelation":4,"body":"<p>Proxy 是 golang 实现的高性能 http、https、websocket、tcp、udp、socks5 代理服务器，支持正向代理、反向代理、透明代理、内网穿透、TCP/UDP 端口映射、SSH 中转、TLS 加密传输、协议转换、DNS 防污染智能代理、前置 CDN/Nginx 反代、代理连接重定向、API 动态调用上级代理、限速限连接数。提供全平台的命令行版本，友好易用的 Windows&amp;Linux&amp;macOS 控制面板，强大的安卓版。<\/p> \n<p><strong>更新内容<\/strong><br> 1、<span>新增自动调整系统限制的程序文件打开数，防止过低的值影响程序连接数，需要root账号执行proxy程序。<\/span><br> <span>2、优化了http/socks5，判断连接上级的逻辑，如果--intelligent=parent，自动设置always为true。<\/span><br> <span>3、修复了socks5默认情况下，如果设置了上级，但没有使用--always，udp不走上级的问题。<\/span><\/p> \n<p>更新： v10.7 及以后版本，执行：<code>proxy update<\/code>，即可完成快速更新到最新版。<\/p> \n<p><strong>特色功能<\/strong><\/p> \n<ul> \n <li>链式代理，程序本身可以作为一级代理，如果设置了上级代理那么可以作为二级代理，乃至 N 级代理。<\/li> \n <li>通讯加密，如果程序不是一级代理，而且上级代理也是本程序，那么可以加密和上级代理之间的通讯，采用底层 tls 高强度加密，安全无特征。<\/li> \n <li>智能 HTTP 代理，HTTPS 代理，SOCKS5 代理，会自动判断访问的网站是否屏蔽，如果被屏蔽那么就会使用上级代理 (前提是配置了上级代理) 访问网站；如果访问的网站没有被屏蔽，为了加速访问，代理会直接访问网站，不使用上级代理。<\/li> \n <li>域名黑白名单，更加自由的控制网站的访问方式。<\/li> \n <li>跨平台性，无论你是 widows，linux，还是 mac，甚至是树莓派，都可以很好的运行 proxy。<\/li> \n <li>多协议支持，支持 HTTP (S)，TCP，UDP，Websocket，SOCKS5 代理。<\/li> \n <li>TCP/UDP 端口转发。<\/li> \n <li>游戏盾，游戏代理，高仿服务器。<\/li> \n <li>内网穿透，P2P 传输，协议支持 TCP 和 UDP，针对 HTTP 的优化穿透。<\/li> \n <li>SSH 中转，HTTP (S)，SOCKS5 代理支持 SSH 中转，上级 Linux 服务器不需要任何服务端，本地一个 proxy 即可开心上网。<\/li> \n <li><a href=\"https://www.oschina.net/action/GoToLink?url=https%3A%2F%2Fgithub.com%2Fxtaci%2Fkcp-go\" target=\"_blank\" rel=\"nofollow\">KCP<\/a><span>&nbsp;<\/span>协议支持，HTTP (S)，SOCKS5 代理支持 KCP 协议传输数据，降低延迟，提升浏览体验。<\/li> \n <li>动态选择上级代理，通过外部 API，HTTP (S)，SOCKS5，SPS 代理可以实现基于用户或者 IP 的限速，连接数限制，动态获取上级。<\/li> \n <li>灵活的上级分配，HTTP (S)，SOCKS5，SPS 代理可以通过配置文件实现基于用户或者 IP 的限速，连接数限制，指定上级。<\/li> \n <li>反向代理，支持直接把域名解析到 proxy 监听的 ip，然后 proxy 就会帮你代理访问需要访问的 HTTP (S) 网站。<\/li> \n <li>透明 HTTP (S) 代理，配合 iptables，在网关直接把出去的 80，443 方向的流量转发到 proxy，就能实现无感知的智能路由器代理。<\/li> \n <li>协议转换，可以把已经存在的 HTTP (S) 或 SOCKS5 或 SS 代理转换为一个端口同时支持 HTTP (S) 和 SOCKS5 和 SS 代理，转换后的 SOCKS5 和 SS 代理如果上级是 SOCKS5 代理，那么支持 UDP 功能，同时支持强大的级联认证功能。<\/li> \n <li>自定义底层加密传输，http (s)\\sps\\socks 代理在 tcp 之上可以通过 tls 标准加密以及 kcp 协议加密 tcp 数据，除此之外还支持在 tls 和 kcp 之后进行自定义加密，也就是说自定义加密和 tls|kcp 是可以联合使用的，内部采用 AES256 加密，使用的时候只需要自己定义一个密码即可。<\/li> \n <li>底层压缩高效传输，http (s)\\sps\\socks 代理在 tcp 之上可以通过自定义加密和 tls 标准加密以及 kcp 协议加密 tcp 数据，在加密之后还可以对数据进行压缩，也就是说压缩功能和自定义加密和 tls|kcp 是可以联合使用的。<\/li> \n <li>安全的 DNS 代理，可以通过本地的 proxy 提供的 DNS 代理服务器与上级代理加密通讯实现安全防污染的 DNS 查询。<\/li> \n <li>负载均衡，高可用，HTTP (S)\\SOCKS5\\SPS 代理支持上级负载均衡和高可用，多个上级重复 - P 参数即可。<\/li> \n <li>指定出口 IP，HTTP (S)\\SOCKS5\\SPS\\TCP 代理支持客户端用入口 IP 连接过来的，就用入口 IP 作为出口 IP 访问目标网站的功能。如果入口 IP 是内网 IP，出口 IP 不会使用入口 IP<\/li> \n <li>支持限速，HTTP (S)\\SOCKS5\\SPS\\TCP 代理支持限速。<\/li> \n <li> <p>支持限连接数，HTTP (S)\\SOCKS5\\SPS\\TCP 代理支持限连接数。<\/p> <\/li> \n <li>SOCKS5 代理支持级联认证。<\/li> \n <li>证书参数使用 base64 数据，默认情况下 - C，-K 参数是 crt 证书和 key 文件的路径，如果是 base64:// 开头，那么就认为后面的数据是 base64 编码的，会解码后使用。<\/li> \n <li>支持客户端 IP 黑白名单，更加安全的控制客户端对代理服务的访问，如果黑白名单同时设置，那么只有白名单生效。socks/http (s)/sps/tcp/udp/dns/ 内网穿透 bridge / 内网穿透 tbridge，都支持客户端 IP 黑白名单。<\/li> \n <li>端口范围批量监听，HTTP (S)\\SOCKS5\\SPS\\TCP 代理支持指定端口范围监听，避免启动过多进程，提高性能。<\/li> \n<\/ul> \n<p>下载地址:<\/p> \n<ul> \n <li> <p><a href=\"https://gitee.com/snail/proxy/\" target=\"_blank\" rel=\"nofollow\">Gitee<\/a><\/p> <\/li> \n <li> <p><a href=\"https://github.com/snail007/goproxy\" target=\"_blank\" rel=\"nofollow\">Github<\/a><\/p> <\/li> \n<\/ul>","commentCount":1,"favorite":false,"href":"https://www.oschina.net/news/229745/proxy-go-13-0-released","id":229745,"pubDate":"2023-02-24 13:28:00","software":{"href":"https://www.oschina.net/p/proxy-go","id":45965,"logo":"https://static.oschina.net/new-osc/img/default-software-logo.png","name":"Proxy-Go","title":"高性能代理服务器"},"title":"Proxy-Go v13.0 发布，新增自动调整打开文件数限制，用得更省心。","viewCount":162}
     * time : 2023-02-24 17:12:05
     */

    public int code;
    public String message;
    /**
     * abouts : [{"commentCount":6,"content":"Proxy-Go v5.3发布了。Proxy是golang实现的高性能http,https,websocket,tcp,udp,socks5代理服务器,支持正向代理、反向代理、透明代理、内网穿透、TCP/UDP端口映射、SSH中转、TLS加密传输、协议转换、DNS防污染代理。 更新内容： 优化了socks_client握手端口判断,避免了sstap测试UDP失败的问题. 特点： 链式代理,程序本身可以作为一级代理,如果设置了上级代理那么可以作为二级代理,乃至N级代理. 通讯加密,如果程序不是一级代理,...","href":"https://www.oschina.net/news/98715/proxy-go-5-3-released","id":98715,"statistics":{"comment":6,"favCount":0,"like":0,"transmit":1,"view":5408},"title":"Proxy-Go v5.3 发布，优化了 SOCKS5 的 UDP 功能","type":6,"viewCount":5408},{"commentCount":4,"content":"Proxy-Go 全平台 SDK是proxy使用gombile实现了一份go代码编译为android和ios平台下面可以直接调用的sdk类库, 另外还为linux和windows提供sdk支持，基于这些类库,APP开发者可以轻松的开发出各种形式的代理工具。 此次更新： 增加了支持日志输出回调的方法: StartWithLog(serviceID, serviceArgsStr string, loggerCallback LogCallback) 优化了socks_client握手端口判断,避免了sstap测试UDP失败的问题.. 修复了HTTP(S)\\SPS反向代...","href":"https://www.oschina.net/news/98300/proxy-go-5-3-released","id":98300,"statistics":{"comment":4,"favCount":0,"like":0,"transmit":0,"view":1067},"title":"Proxy-Go 全平台 SDK v5.3 发布，新增日志回调","type":6,"viewCount":1067},{"commentCount":6,"content":"Proxy-Go v5.2发布了。Proxy是golang实现的高性能http,https,websocket,tcp,udp,socks5代理服务器,支持正向代理、反向代理、透明代理、内网穿透、TCP/UDP端口映射、SSH中转、TLS加密传输、协议转换、DNS防污染代理。 更新内容： 修复了HTTP(S)\\SPS反向代理无法正常工作的问题. 优化了智能判断,减少不必要的DNS解析. 重构了SOCKS和SPS的UDP功能,基于UDP的游戏加速嗖嗖的. 特点： 链式代理,程序本身可以作为一级代理,如果设置了上...","href":"https://www.oschina.net/news/97853/proxy-go-5-2-released","id":97853,"statistics":{"comment":6,"favCount":0,"like":0,"transmit":0,"view":2085},"title":"Proxy-Go v5.2 发布，重构 SOCKS5/SPS 的 UDP 功能","type":6,"viewCount":2085},{"commentCount":6,"content":"Proxy-Go v5.1发布了。Proxy是golang实现的高性能http,https,websocket,tcp,udp,socks5代理服务器,支持正向代理、反向代理、透明代理、内网穿透、TCP/UDP端口映射、SSH中转、TLS加密传输、协议转换、DNS防污染代理。 更新内容： 优化了kcp默认mtu配置,调整为450. 优化了HTTP(S)\\SOCKS5代理智能判断，更加精确。 fix #97 , 修复了RemoveProxyHeaders方法忽略了第一行的bug。 修复了-g参数长格式没有连接符号的bug. 重构了证书生成...","href":"https://www.oschina.net/news/97518/proxy-go-5-1-released","id":97518,"statistics":{"comment":6,"favCount":0,"like":0,"transmit":0,"view":1381},"title":"Proxy-Go v5.1 发布，可以全平台生成证书","type":6,"viewCount":1381},{"commentCount":0,"content":"Proxy-Go 全平台 SDK是proxy使用gombile实现了一份go代码编译为android和ios平台下面可以直接调用的sdk类库, 另外还为linux和windows提供sdk支持，基于这些类库,APP开发者可以轻松的开发出各种形式的代理工具。 此次更新： 修复了SPS多端口无效的bug. 增加了DNS代理功能，提供安全无污染的DNS解析. 下载地址: Gitee GAYHUB Proxy SDK 使用说明 支持以下平台: Android,.arr库 IOS,.framework库 Windows,.dll库 Linux,.so库 MacO...","href":"https://www.oschina.net/news/97250/proxy-go-sdk-5-0-released","id":97250,"statistics":{"comment":0,"favCount":0,"like":0,"transmit":0,"view":1256},"title":"Proxy-Go 全平台 SDK v5.0 发布啦！新增安全DNS代理！","type":6,"viewCount":1256}]
     * author : 狂奔的蜗牛.
     * authorId : 873901
     * authorPortrait : https://static.oschina.net/uploads/user/436/873901_50.jpg?t=1409972745000
     * authorRelation : 4
     * body : <p>Proxy 是 golang 实现的高性能 http、https、websocket、tcp、udp、socks5 代理服务器，支持正向代理、反向代理、透明代理、内网穿透、TCP/UDP 端口映射、SSH 中转、TLS 加密传输、协议转换、DNS 防污染智能代理、前置 CDN/Nginx 反代、代理连接重定向、API 动态调用上级代理、限速限连接数。提供全平台的命令行版本，友好易用的 Windows&amp;Linux&amp;macOS 控制面板，强大的安卓版。</p>
     <p><strong>更新内容</strong><br> 1、<span>新增自动调整系统限制的程序文件打开数，防止过低的值影响程序连接数，需要root账号执行proxy程序。</span><br> <span>2、优化了http/socks5，判断连接上级的逻辑，如果--intelligent=parent，自动设置always为true。</span><br> <span>3、修复了socks5默认情况下，如果设置了上级，但没有使用--always，udp不走上级的问题。</span></p>
     <p>更新： v10.7 及以后版本，执行：<code>proxy update</code>，即可完成快速更新到最新版。</p>
     <p><strong>特色功能</strong></p>
     <ul>
     <li>链式代理，程序本身可以作为一级代理，如果设置了上级代理那么可以作为二级代理，乃至 N 级代理。</li>
     <li>通讯加密，如果程序不是一级代理，而且上级代理也是本程序，那么可以加密和上级代理之间的通讯，采用底层 tls 高强度加密，安全无特征。</li>
     <li>智能 HTTP 代理，HTTPS 代理，SOCKS5 代理，会自动判断访问的网站是否屏蔽，如果被屏蔽那么就会使用上级代理 (前提是配置了上级代理) 访问网站；如果访问的网站没有被屏蔽，为了加速访问，代理会直接访问网站，不使用上级代理。</li>
     <li>域名黑白名单，更加自由的控制网站的访问方式。</li>
     <li>跨平台性，无论你是 widows，linux，还是 mac，甚至是树莓派，都可以很好的运行 proxy。</li>
     <li>多协议支持，支持 HTTP (S)，TCP，UDP，Websocket，SOCKS5 代理。</li>
     <li>TCP/UDP 端口转发。</li>
     <li>游戏盾，游戏代理，高仿服务器。</li>
     <li>内网穿透，P2P 传输，协议支持 TCP 和 UDP，针对 HTTP 的优化穿透。</li>
     <li>SSH 中转，HTTP (S)，SOCKS5 代理支持 SSH 中转，上级 Linux 服务器不需要任何服务端，本地一个 proxy 即可开心上网。</li>
     <li><a href="https://www.oschina.net/action/GoToLink?url=https%3A%2F%2Fgithub.com%2Fxtaci%2Fkcp-go" target="_blank" rel="nofollow">KCP</a><span>&nbsp;</span>协议支持，HTTP (S)，SOCKS5 代理支持 KCP 协议传输数据，降低延迟，提升浏览体验。</li>
     <li>动态选择上级代理，通过外部 API，HTTP (S)，SOCKS5，SPS 代理可以实现基于用户或者 IP 的限速，连接数限制，动态获取上级。</li>
     <li>灵活的上级分配，HTTP (S)，SOCKS5，SPS 代理可以通过配置文件实现基于用户或者 IP 的限速，连接数限制，指定上级。</li>
     <li>反向代理，支持直接把域名解析到 proxy 监听的 ip，然后 proxy 就会帮你代理访问需要访问的 HTTP (S) 网站。</li>
     <li>透明 HTTP (S) 代理，配合 iptables，在网关直接把出去的 80，443 方向的流量转发到 proxy，就能实现无感知的智能路由器代理。</li>
     <li>协议转换，可以把已经存在的 HTTP (S) 或 SOCKS5 或 SS 代理转换为一个端口同时支持 HTTP (S) 和 SOCKS5 和 SS 代理，转换后的 SOCKS5 和 SS 代理如果上级是 SOCKS5 代理，那么支持 UDP 功能，同时支持强大的级联认证功能。</li>
     <li>自定义底层加密传输，http (s)\sps\socks 代理在 tcp 之上可以通过 tls 标准加密以及 kcp 协议加密 tcp 数据，除此之外还支持在 tls 和 kcp 之后进行自定义加密，也就是说自定义加密和 tls|kcp 是可以联合使用的，内部采用 AES256 加密，使用的时候只需要自己定义一个密码即可。</li>
     <li>底层压缩高效传输，http (s)\sps\socks 代理在 tcp 之上可以通过自定义加密和 tls 标准加密以及 kcp 协议加密 tcp 数据，在加密之后还可以对数据进行压缩，也就是说压缩功能和自定义加密和 tls|kcp 是可以联合使用的。</li>
     <li>安全的 DNS 代理，可以通过本地的 proxy 提供的 DNS 代理服务器与上级代理加密通讯实现安全防污染的 DNS 查询。</li>
     <li>负载均衡，高可用，HTTP (S)\SOCKS5\SPS 代理支持上级负载均衡和高可用，多个上级重复 - P 参数即可。</li>
     <li>指定出口 IP，HTTP (S)\SOCKS5\SPS\TCP 代理支持客户端用入口 IP 连接过来的，就用入口 IP 作为出口 IP 访问目标网站的功能。如果入口 IP 是内网 IP，出口 IP 不会使用入口 IP</li>
     <li>支持限速，HTTP (S)\SOCKS5\SPS\TCP 代理支持限速。</li>
     <li> <p>支持限连接数，HTTP (S)\SOCKS5\SPS\TCP 代理支持限连接数。</p> </li>
     <li>SOCKS5 代理支持级联认证。</li>
     <li>证书参数使用 base64 数据，默认情况下 - C，-K 参数是 crt 证书和 key 文件的路径，如果是 base64:// 开头，那么就认为后面的数据是 base64 编码的，会解码后使用。</li>
     <li>支持客户端 IP 黑白名单，更加安全的控制客户端对代理服务的访问，如果黑白名单同时设置，那么只有白名单生效。socks/http (s)/sps/tcp/udp/dns/ 内网穿透 bridge / 内网穿透 tbridge，都支持客户端 IP 黑白名单。</li>
     <li>端口范围批量监听，HTTP (S)\SOCKS5\SPS\TCP 代理支持指定端口范围监听，避免启动过多进程，提高性能。</li>
     </ul>
     <p>下载地址:</p>
     <ul>
     <li> <p><a href="https://gitee.com/snail/proxy/" target="_blank" rel="nofollow">Gitee</a></p> </li>
     <li> <p><a href="https://github.com/snail007/goproxy" target="_blank" rel="nofollow">Github</a></p> </li>
     </ul>
     * commentCount : 1
     * favorite : false
     * href : https://www.oschina.net/news/229745/proxy-go-13-0-released
     * id : 229745
     * pubDate : 2023-02-24 13:28:00
     * software : {"href":"https://www.oschina.net/p/proxy-go","id":45965,"logo":"https://static.oschina.net/new-osc/img/default-software-logo.png","name":"Proxy-Go","title":"高性能代理服务器"}
     * title : Proxy-Go v13.0 发布，新增自动调整打开文件数限制，用得更省心。
     * viewCount : 162
     */

    public ResultBean result;
    public String time;

    @Override
    public List<ResultBean.AboutsBean> getItemDatas() {
        return result.abouts;
    }

    public static class ResultBean {
        public String author;
        public int authorId;
        public String authorPortrait;
        public int authorRelation;
        public String body;
        public int commentCount;
        public boolean favorite;
        public String href;
        public int id;
        public String pubDate;
        /**
         * href : https://www.oschina.net/p/proxy-go
         * id : 45965
         * logo : https://static.oschina.net/new-osc/img/default-software-logo.png
         * name : Proxy-Go
         * title : 高性能代理服务器
         */

        public SoftwareBean software;
        public String title;
        public int viewCount;
        /**
         * commentCount : 6
         * content : Proxy-Go v5.3发布了。Proxy是golang实现的高性能http,https,websocket,tcp,udp,socks5代理服务器,支持正向代理、反向代理、透明代理、内网穿透、TCP/UDP端口映射、SSH中转、TLS加密传输、协议转换、DNS防污染代理。 更新内容： 优化了socks_client握手端口判断,避免了sstap测试UDP失败的问题. 特点： 链式代理,程序本身可以作为一级代理,如果设置了上级代理那么可以作为二级代理,乃至N级代理. 通讯加密,如果程序不是一级代理,...
         * href : https://www.oschina.net/news/98715/proxy-go-5-3-released
         * id : 98715
         * statistics : {"comment":6,"favCount":0,"like":0,"transmit":1,"view":5408}
         * title : Proxy-Go v5.3 发布，优化了 SOCKS5 的 UDP 功能
         * type : 6
         * viewCount : 5408
         */

        public List<AboutsBean> abouts;

        public static class SoftwareBean {
            public String href;
            public int id;
            public String logo;
            public String name;
            public String title;
        }

        public static class AboutsBean {
            public int commentCount;
            public String content;
            public String href;
            public int id;
            /**
             * comment : 6
             * favCount : 0
             * like : 0
             * transmit : 1
             * view : 5408
             */

            public StatisticsBean statistics;
            public String title;
            public int type;
            public int viewCount;

            public static class StatisticsBean {
                public int comment;
                public int favCount;
                public int like;
                public int transmit;
                public int view;
            }
        }
    }
}
