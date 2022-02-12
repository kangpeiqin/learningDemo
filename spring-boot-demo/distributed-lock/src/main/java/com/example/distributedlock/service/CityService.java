package com.example.distributedlock.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.distributedlock.entity.City;
import com.example.distributedlock.mapper.CityMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kpq
 * @since 2022-02-09
 */
@Service
public class CityService extends ServiceImpl<CityMapper, City> {

}
