# Dev 开发环境


eureka-server 服务中心
    url = http://127.0.0.1:9001
          http://127.0.0.1:9002

config 配置中心
    url = http://127.0.0.1:7001/master/{application}-{profile}.properties


zuul 网关
    url = http://127.0.0.1:8080

    反向代理：
        http://127.0.0.1:8080/custom/**     =>  zfh-shop-custom
        http://127.0.0.1:8080/product/**     =>  zfh-shop-product
        http://127.0.0.1:8080/order/**     =>  zfh-shop-order
        http://127.0.0.1:8080/website/**     =>  zfh-shop-website

zfh-shop-custom 客户服务
    url = http://127.0.0.1:8001

zfh-shop-product 商品服务
    url = http://127.0.0.1:8101

zfh-shop-order 订单服务
    url = http://127.0.0.1:8201

zfh-shop-website 站点服务
    url = http://127.0.0.1:8301

# Prod 生产环境