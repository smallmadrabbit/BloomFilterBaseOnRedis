# BloomFilterBaseOnRedis
基于redis的bloom的布隆过滤器，主做字符串去重

使用方法
```'使用方法
//创建配置对象，配置相关参数
//第一个参数为 redis的ip
//第二个参数为 redis的端口
//第三个参数为 使用hash算法的数量 1~15
//第四个参数为 误判率
//第五个参数为 预估的要判重数据的个数
BfConfiguration bc = new BfConfiguration("192.168.88.213",6379,8,0.00001,200000000);
System.out.println(bc);
BFUtil bfUtil = new BFUtil(bc);
//返回true表示不存在，返回false表示已经存在
bfUtil.add(UUID.randomUUID().toString());
```
