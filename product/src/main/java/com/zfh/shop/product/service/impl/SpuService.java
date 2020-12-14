package com.zfh.shop.product.service.impl;

import com.zfh.shop.product.bean.bo.SpuSearchBo;
import com.zfh.shop.product.bean.vo.SpuVo;
import com.zfh.shop.product.mapper.SpuMapper;
import com.zfh.shop.product.service.ISpuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Spu 商品资源 业务逻辑层实现类
 * */
@Service
public class SpuService implements ISpuService {

    // 数据访问层接口
    @Resource
    private SpuMapper spuMapper;

    @Override
    public List<SpuVo> getSpuVoList(SpuSearchBo spuSearchBo) {
        return spuMapper.getSpuVoList(spuSearchBo);
    }

    @Override
    public SpuVo getSpuVoById(Integer spu_id) {
        return spuMapper.getSpuVoById(spu_id);
    }

    @Override
    public boolean updateSpuStock(Integer id, Integer count) {
        return spuMapper.updateSpuStock(id,count) > 0;
    }
}
