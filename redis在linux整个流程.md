在linux配置redis

1、新建文件夹
2、wget 下载redis安装包
3、解压 tar
4、make
5、进src   make install
安装完毕
使用

启动redis
redis-server &（&为允许后台运行）
可ctrol c  退出
外网进入  可能需要开启端口 /sbin/iptables -I INPUT -p tcp --dport 6379 -j ACCEPT
启动客户端
redis-cli
进行操作

允许其他服务器访问redis

修改  redis.config  文件 
添加 bind ip
修改为 daemonize "no"
protected-mode "no"

必要时  修改密码


--------------------------------------
查看 redis是否启动
ps -ef|grep redis

关闭 redis 
kill -9 进程号

































